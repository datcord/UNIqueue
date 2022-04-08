package com.example.genericapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Continent(View view) {
        Intent searchCountry = new Intent(this, ContinentAct.class);
        startActivity(searchCountry);
    }

    public void Exit(View view) {
        finish();
    }
}