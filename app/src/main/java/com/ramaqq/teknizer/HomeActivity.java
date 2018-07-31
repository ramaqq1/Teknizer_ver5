package com.ramaqq.teknizer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by ramaqq on 7/17/2018.
 */

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "HomeActivity";

    //variables
    private DrawerLayout drawer;
    private BottomNavigationView mMainView;
    private FrameLayout mframeLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        Log.d(TAG, "onCreate: starting in second activity");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        mMainView = findViewById(R.id.main_nav);
        mframeLayout = (FrameLayout) findViewById(R.id.fragment_container);

        mMainView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btnav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                new FragmentHome()).commit();
                        return true;
                    case R.id.btnav_points:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                new FragmentPoints()).commit();
                        return true;
                    case R.id.btnav_leaderboard:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                new FragmentLeaderboard()).commit();
                        return true;

                    default:
                        return false;
                }

            }
        });

        //to list event  to navigation view
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //get menu item drawer and add animation drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //Menu home akan langsung tampil tanpa mengklik menu home pada awal masuk app
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FragmentHome()).commit();
            mMainView.setSelectedItemId(R.id.btnav_home);
        }

    }

    // to make theard not back to defferent acivity
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();//close activity
        }
    }

    // to make item selected when action item is trigger
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_settingActivity()).commit();
                break;
            case R.id.nav_key:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_changePassActivity()).commit();
                break;
            case R.id.nav_logout:
                Toast.makeText(this, "LogOut", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_help:
                Toast.makeText(this, "go to the Help page", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
