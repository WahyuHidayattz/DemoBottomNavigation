package com.wahyudemo.bottomnav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.*;
import android.widget.*;
import android.view.*;
import android.support.design.widget.*;

public class MainActivity extends AppCompatActivity
{
    private BottomNavigationView mBottomNav;
    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNav = findViewById(R.id.bottom_navigation);
        mTextMessage = findViewById(R.id.message);

        mTextMessage.setText("Home");
        setupBottomNav();
    }

    private void setupBottomNav()
    {
        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(MenuItem item)
                {
                    // set action by clicked item by id
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            mTextMessage.setText("Home");
                            break;
                        case R.id.nav_notification:
                            mTextMessage.setText("Notification");
                            break;
                        case R.id.nav_dashboard:
                            mTextMessage.setText("Dashboard");
                            break;
                    }
                    item.setCheckable(true);
                    item.setChecked(true);
                    return false;
                }
            });
    }
}
