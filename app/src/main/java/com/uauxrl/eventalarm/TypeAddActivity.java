package com.uauxrl.eventalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TypeAddActivity extends AppCompatActivity {

    private Button buttonCancel;
    private Button buttonSave;
    private Button buttonCategory;
    private Button buttonRepeat;
    private Button buttonTone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_add);

        buttonCancel = (Button) findViewById(R.id.type_add_cancel_button);
        buttonCancel.setOnClickListener(view -> finish());

        buttonSave = (Button) findViewById(R.id.type_add_save_button);
        buttonSave.setOnClickListener(view -> openActivityMenu("type_list"));

        buttonCategory = (Button) findViewById(R.id.type_add_category_open);
        buttonCategory.setOnClickListener(view -> openActivityCategory());

        buttonRepeat = (Button) findViewById(R.id.type_add_loop_open);
        buttonRepeat.setOnClickListener(view -> openActivityRepeat());

        buttonTone = (Button) findViewById(R.id.type_add_tone_open);
        buttonTone.setOnClickListener(view -> openActivityTone());
    }

    public void openActivityMenu(String category) {
        Intent intent = new Intent(this, CategoryMenuActivity.class);
        intent.putExtra("category",category);
        startActivity(intent);
    }

    public void openActivityCategory() {
        Intent intent = new Intent(this, TypeFindActivity.class);
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