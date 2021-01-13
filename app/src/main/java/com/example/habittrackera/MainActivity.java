package com.example.habittrackera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //UI Properties
    NavHostFragment navHostFragment;
    BottomNavigationView bottomNavigationView;

    //Life Cycle Methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupNavigationController();
    }

    //View Setup
    public void setupNavigationController() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_container);
        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.getNavController());
    }
}




