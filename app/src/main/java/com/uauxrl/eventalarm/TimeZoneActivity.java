package com.uauxrl.eventalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TimeZoneActivity extends AppCompatActivity {

    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_zone);

        buttonBack = (Button) findViewById(R.id.timezone_back_button);
        buttonBack.setOnClickListener(view -> finish());
    }
}