package com.uauxrl.eventalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ToneActivity extends AppCompatActivity {

    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tone);

        buttonBack = (Button) findViewById(R.id.repeat_back);
        buttonBack.setOnClickListener(view -> finish());
    }
}