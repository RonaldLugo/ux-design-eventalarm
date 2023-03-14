package com.uauxrl.eventalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TypeFindActivity extends AppCompatActivity {

    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_find);

        buttonBack = (Button) findViewById(R.id.type_find_back);
        buttonBack.setOnClickListener(view -> finish());
    }
}