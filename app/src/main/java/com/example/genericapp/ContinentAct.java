package com.example.genericapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContinentAct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continent);
    }

    public void continent(View view) {
        Intent continentIntent = new Intent(this, CountryAct.class);
        continentIntent.putExtra("continent",((Button)view).getText().toString());
        startActivity(continentIntent);

    }

    public void Back(View view) {
        finish();
    }
}
