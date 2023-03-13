package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ClockAddActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_add);

        button = (Button) findViewById(R.id.clock_add_cancel_button);
        button.setOnClickListener(view -> openActivityMenu());
    }

    public void openActivityMenu() {
        Intent intent = new Intent(this, CategoryMenuActivity.class);
        intent.putExtra("category","clock");
        startActivity(intent);
    }
}