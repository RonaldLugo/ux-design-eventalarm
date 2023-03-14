package com.uauxrl.eventalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class PlaceAlarmActivity extends AppCompatActivity {

    private Button buttonDelay;
    private Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_alarm);

        buttonDelay = (Button) findViewById(R.id.place_alarm_delay_button);
        buttonDelay.setOnClickListener(view -> finish());

        buttonStop = (Button) findViewById(R.id.place_alarm_stop_button);
        buttonStop.setOnClickListener(view -> finish());
    }
}