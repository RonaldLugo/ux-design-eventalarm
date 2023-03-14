package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class PlaceMapActivity extends AppCompatActivity {

    private Button buttonCancel;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_map);

        buttonCancel = (Button) findViewById(R.id.place_map_cancel_button);
        buttonCancel.setOnClickListener(view -> finish());

        buttonNext = (Button) findViewById(R.id.place_map_next_button);
        buttonNext.setOnClickListener(view -> openActivityAddPlace());
    }

    public void openActivityAddPlace() {
        Intent intent = new Intent(this, PlaceAddActivity.class);
        startActivity(intent);
    }
}