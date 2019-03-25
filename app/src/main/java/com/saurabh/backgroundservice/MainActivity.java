package com.saurabh.backgroundservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    setTitle("Android Background Service Example.");

    Button startBackService = (Button)findViewById(R.id.start_background_service_button);
        startBackService.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Start android service.
            Intent startServiceIntent = new Intent(getApplicationContext(), MyBackgroundService.class);
            startService(startServiceIntent);
        }
    });


    Button stopBackService = (Button)findViewById(R.id.stop_background_service_button);
        stopBackService.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Stop android service.
            Intent stopServiceIntent = new Intent(getApplicationContext(), MyBackgroundService.class);
            stopService(stopServiceIntent);
        }
    });
}
}
