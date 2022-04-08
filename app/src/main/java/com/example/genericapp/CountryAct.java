package com.example.genericapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class CountryAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        Resources res = getResources();
        Intent receivedText = getIntent();
        String intentValue = receivedText.getStringExtra("continent");

        String[] countries;
        Button[] buttons = new Button[4];
        
        switch(intentValue){
            case "oceania":
                countries = res.getStringArray(R.array.oceania);
                buttons[0] = (Button) findViewById(R.id.country1);
                buttons[0].setText(countries[0]);
                buttons[1] = (Button) findViewById(R.id.country2);
                buttons[1].setText(countries[1]);
                buttons[2] = (Button) findViewById(R.id.country3);
                buttons[2].setText(countries[2]);
                buttons[3] = (Button) findViewById(R.id.country4);
                buttons[3].setText(countries[3]);
                break;
            case "asia":
                countries = res.getStringArray(R.array.asia);
                buttons[0] = (Button) findViewById(R.id.country1);
                buttons[0].setText(countries[0]);
                buttons[1] = (Button) findViewById(R.id.country2);
                buttons[1].setText(countries[1]);
                buttons[2] = (Button) findViewById(R.id.country3);
                buttons[2].setText(countries[2]);
                buttons[3] = (Button) findViewById(R.id.country4);
                buttons[3].setText(countries[3]);
                break;
            case "africa":
                countries = res.getStringArray(R.array.africa);
                buttons[0] = (Button) findViewById(R.id.country1);
                buttons[0].setText(countries[0]);
                buttons[1] = (Button) findViewById(R.id.country2);
                buttons[1].setText(countries[1]);
                buttons[2] = (Button) findViewById(R.id.country3);
                buttons[2].setText(countries[2]);
                buttons[3] = (Button) findViewById(R.id.country4);
                buttons[3].setText(countries[3]);
                break;
            case "South America":
                countries = res.getStringArray(R.array.southAmerica);
                buttons[0] = (Button) findViewById(R.id.country1);
                buttons[0].setText(countries[0]);
                buttons[1] = (Button) findViewById(R.id.country2);
                buttons[1].setText(countries[1]);
                buttons[2] = (Button) findViewById(R.id.country3);
                buttons[2].setText(countries[2]);
                buttons[3] = (Button) findViewById(R.id.country4);
                buttons[3].setText(countries[3]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + intentValue);
        }

    }

    public void country(View view) {
        Intent continentIntent = new Intent(this, UniAct.class);
        continentIntent.putExtra("country",((Button)view).getText().toString());
        startActivity(continentIntent);

    }

    public void Back(View view) { finish(); }

}
