package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class RepeatActivity extends AppCompatActivity {

    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeat);

        buttonBack = (Button) findViewById(R.id.repeat_back);
        buttonBack.setOnClickListener(view -> finish());
    }
}