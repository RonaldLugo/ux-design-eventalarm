package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView buttonLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.register_code_button);
        button.setOnClickListener(view -> openActivityMenu());

        // hack para celulares con pantalla demasiado pequena
        buttonLabel = (TextView) findViewById(R.id.register_code_label);
        buttonLabel.setOnClickListener(view -> openActivityMenu());
    }

    public void openActivityMenu() {
        Intent intent = new Intent(this, CategoryMenuActivity.class);
        startActivity(intent);
    }

    /**
    public void openActivityMenu() {
        Intent intent = new Intent(this, CategoryMenuActivity.class);
        startActivity(intent);
    }
     **/
}