package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TypeAddActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_add);

        button = (Button) findViewById(R.id.type_add_cancel_button);
        button.setOnClickListener(view -> openActivityMenu());
    }

    public void openActivityMenu() {
        Intent intent = new Intent(this, CategoryMenuActivity.class);
        intent.putExtra("category","type");
        startActivity(intent);
    }
}