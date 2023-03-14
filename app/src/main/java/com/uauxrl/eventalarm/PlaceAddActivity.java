package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class PlaceAddActivity extends AppCompatActivity {

    private Button buttonCancel;
    private Button buttonSave;
    private Button buttonMap;
    private Button buttonRepeat;
    private Button buttonTone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_add);

        buttonCancel = (Button) findViewById(R.id.place_add_cancel_button);
        buttonCancel.setOnClickListener(view -> finish());

        buttonSave = (Button) findViewById(R.id.place_add_save_button);
        buttonSave.setOnClickListener(view -> openActivityMenu("place_list"));

        buttonMap = (Button) findViewById(R.id.place_add_map_open);
        buttonMap.setOnClickListener(view -> openActivityMap());

        buttonRepeat = (Button) findViewById(R.id.place_add_loop_open);
        buttonRepeat.setOnClickListener(view -> openActivityRepeat());

        buttonTone = (Button) findViewById(R.id.place_add_tone_open);
        buttonTone.setOnClickListener(view -> openActivityTone());
    }

    public void openActivityMenu(String category) {
        Intent intent = new Intent(this, CategoryMenuActivity.class);
        intent.putExtra("category",category);
        startActivity(intent);
    }

    public void openActivityMap() {
        Intent intent = new Intent(this, PlaceMapActivity.class);
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
}