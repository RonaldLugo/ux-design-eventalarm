package com.uauxrl.eventalarm;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.HashMap;
import java.util.Map;

public class CategoryMenuActivity extends AppCompatActivity {
    private ImageButton buttonClock;
    private LinearLayout menuClockLayout;
    private ImageButton buttonPlace;
    private LinearLayout menuPlaceLayout;
    private ImageButton buttonType;
    private LinearLayout menuTypeLayout;

    private static Map<String, String> categoryMap = new HashMap<String, String>();

    CategoryClockFragment clockFragment = new CategoryClockFragment();
    ClockListFragment clockListFragment = new ClockListFragment();
    CategoryPlaceFragment placeFragment = new CategoryPlaceFragment();
    PlaceListFragment placeListFragment = new PlaceListFragment();
    CategoryTypeFragment typeFragment = new CategoryTypeFragment();
    TypeListFragment typeListFragment = new TypeListFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        menuClockLayout = (LinearLayout) findViewById(R.id.menu_clock_layout);
        menuPlaceLayout = (LinearLayout) findViewById(R.id.menu_place_layout);
        menuTypeLayout = (LinearLayout) findViewById(R.id.menu_type_layout);

        buttonClock = (ImageButton) findViewById(R.id.menu_clock_button);
        buttonClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = (categoryMap.get("clock").equals("list") ? clockListFragment : clockFragment);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, fragment).commit();
                menuClockLayout.setBackground(getResources().getDrawable(R.drawable.background_menu_item));
                menuPlaceLayout.setBackgroundResource(0);
                menuTypeLayout.setBackgroundResource(0);
            }
        });

        buttonPlace = (ImageButton) findViewById(R.id.menu_place_button);
        buttonPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = (categoryMap.containsKey("place") && categoryMap.get("place").equals("list") ? placeListFragment : placeFragment);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, fragment).commit();
                menuPlaceLayout.setBackground(getResources().getDrawable(R.drawable.background_menu_item));
                menuClockLayout.setBackgroundResource(0);
                menuTypeLayout.setBackgroundResource(0);
            }
        });

        buttonType = (ImageButton) findViewById(R.id.menu_type_button);
        buttonType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = (categoryMap.containsKey("type") && categoryMap.get("type").equals("list") ? typeListFragment : typeFragment);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMenu, fragment).commit();
                menuTypeLayout.setBackground(getResources().getDrawable(R.drawable.background_menu_item));
                menuClockLayout.setBackgroundResource(0);
                menuPlaceLayout.setBackgroundResource(0);
            }
        });

        String category = "";

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            category = extras.getString("category");
        }
        System.out.println("category: " + category);

        switch (category) {
            case "place_list":
                categoryMap.put("place", "list");
                buttonPlace.callOnClick();
                break;
            case "place":
                categoryMap.put("place", "empty");
                buttonPlace.callOnClick();
                break;
            case "type_list":
                categoryMap.put("type", "list");
                buttonType.callOnClick();
                break;
            case "type":
                categoryMap.put("type", "empty");
                buttonType.callOnClick();
                break;
            case "clock_list":
                categoryMap.put("clock", "list");
                buttonClock.callOnClick();
                break;
            case "clock": default:
                categoryMap.put("clock", "empty");
                buttonClock.callOnClick();
                break;
        }
    }
}