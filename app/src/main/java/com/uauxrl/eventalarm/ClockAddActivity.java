package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ClockAddActivity extends AppCompatActivity {

    private Button buttonCancel;
    private Button buttonSave;
    private Button buttonRepeat;
    private Button buttonTone;

    private TextView linkTimezone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_add);

        buttonCancel = (Button) findViewById(R.id.clock_add_cancel_button);
        buttonCancel.setOnClickListener(view -> openActivityMenu("clock"));

        buttonSave = (Button) findViewById(R.id.clock_add_save_button);
        buttonSave.setOnClickListener(view -> openActivityMenu("clock_list"));

        buttonRepeat = (Button) findViewById(R.id.clock_add_loop_open);
        buttonRepeat.setOnClickListener(view -> openActivityRepeat());

        buttonTone = (Button) findViewById(R.id.clock_add_tone_open);
        buttonTone.setOnClickListener(view -> openActivityTone());

        linkTimezone = (TextView) findViewById(R.id.clock_add_timezone);
        linkTimezone.setOnClickListener(view -> openActivityTimezone());

    }

    public void openActivityMenu(String category) {
        Intent intent = new Intent(this, CategoryMenuActivity.class);
        intent.putExtra("category",category);
        startActivity(intent);
    }

    public void openActivityRepeat() {
        Intent intent = new Intent(this, RepeatActivity.class);
        startActivity(intent);
    }

    public void openActivityTone() {
        Intent intent = new Intent(this, ToneActivity.class);
        startActivity(intent);
    }

    public void openActivityTimezone() {
        Intent intent = new Intent(this, TimeZoneActivity.class);
        startActivity(intent);
    }
}