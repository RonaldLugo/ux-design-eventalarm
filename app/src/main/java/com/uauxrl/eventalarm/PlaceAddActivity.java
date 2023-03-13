package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class PlaceAddActivity extends AppCompatActivity {

    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_add);

        buttonCancel = (Button) findViewById(R.id.place_add_cancel_button);
        buttonCancel.setOnClickListener(view -> openActivityMenu());
    }

    public void openActivityMenu() {
        Intent intent = new Intent(this, PlaceMapActivity.class);
        startActivity(intent);
    }
}