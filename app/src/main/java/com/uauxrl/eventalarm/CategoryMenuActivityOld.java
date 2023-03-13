package com.uauxrl.eventalarm;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class CategoryMenuActivityOld extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_old);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.category_clock);
    }

    CategoryClockFragment clockFragment = new CategoryClockFragment();
    CategoryPlaceFragment placeFragment = new CategoryPlaceFragment();
    CategoryTypeFragment typeFragment = new CategoryTypeFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.category_clock:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, clockFragment).commit();
                return true;
            case R.id.category_place:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, placeFragment).commit();
                return true;
            case R.id.category_type:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, typeFragment).commit();
                return true;
        }
        return false;
    }
}