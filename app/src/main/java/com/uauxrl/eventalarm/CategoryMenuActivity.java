package com.uauxrl.eventalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class CategoryMenuActivity extends AppCompatActivity {
    private ImageButton buttonClock;
    private LinearLayout menuClockLayout;
    private ImageButton buttonPlace;
    private LinearLayout menuPlaceLayout;
    private ImageButton buttonType;
    private LinearLayout menuTypeLayout;

    CategoryClockFragment clockFragment = new CategoryClockFragment();
    CategoryPlaceFragment placeFragment = new CategoryPlaceFragment();
    CategoryTypeFragment typeFragment = new CategoryTypeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        menuClockLayout = (LinearLayout) findViewById(R.id.menu_clock_layout);
        menuPlaceLayout = (LinearLayout) findViewById(R.id.menu_place_layout);
        menuTypeLayout = (LinearLayout) findViewById(R.id.menu_type_layout);

        String category = "";

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            category = extras.getString("category");
        }

        if (category.equals("place")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, placeFragment).commit();
        } else if (category.equals("type")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, typeFragment).commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, clockFragment).commit();
        }

        buttonClock = (ImageButton) findViewById(R.id.menu_clock_button);

        buttonClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, clockFragment).commit();
                menuClockLayout.setBackground(getResources().getDrawable(R.drawable.background_menu_item));
                menuPlaceLayout.setBackgroundResource(0);
                menuTypeLayout.setBackgroundResource(0);
            }
        });

        buttonPlace = (ImageButton) findViewById(R.id.menu_place_button);
        buttonPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, placeFragment).commit();
                menuPlaceLayout.setBackground(getResources().getDrawable(R.drawable.background_menu_item));
                menuClockLayout.setBackgroundResource(0);
                menuTypeLayout.setBackgroundResource(0);
            }
        });

        buttonType = (ImageButton) findViewById(R.id.menu_type_button);
        buttonType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, typeFragment).commit();
                menuTypeLayout.setBackground(getResources().getDrawable(R.drawable.background_menu_item));
                menuClockLayout.setBackgroundResource(0);
                menuPlaceLayout.setBackgroundResource(0);
            }
        });

    }
}