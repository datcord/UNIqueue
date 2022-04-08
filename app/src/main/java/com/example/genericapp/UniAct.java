package com.example.genericapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UniAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni);
        Resources res = getResources();
        Intent receivedText = getIntent();
        String intentValue = receivedText.getStringExtra("country");

        TextView tv1 = (TextView)findViewById(R.id.textView);
        tv1.setText(intentValue);

    }
    public String[] getInfo(){
        Resources res = getResources();
        Intent receivedText = getIntent();
        String intentValue = receivedText.getStringExtra("country");
        String[] info;
        switch (intentValue){
            case "Fiji": info = res.getStringArray(R.array.Fiji); break;
            case "Guam": info = res.getStringArray(R.array.Guam); break;
            case "Samoa": info = res.getStringArray(R.array.Samoa); break;
            case "New Zealand": info = res.getStringArray(R.array.NewZealand); break;
            case "Nigeria": info = res.getStringArray(R.array.Nigeria); break;
            case "Congo": info = res.getStringArray(R.array.Congo); break;
            case "Uganda": info = res.getStringArray(R.array.Uganda); break;
            case "Chad": info = res.getStringArray(R.array.Chad); break;
            case "Sri Lanka": info = res.getStringArray(R.array.SriLanka); break;
            case "Thailand": info = res.getStringArray(R.array.Thailand); break;
            case "Nepal": info = res.getStringArray(R.array.Nepal); break;
            case "Kyrgystan": info = res.getStringArray(R.array.Kyrgystan); break;
            case "Nicaragua": info = res.getStringArray(R.array.Nicaragua); break;
            case "Honduras": info = res.getStringArray(R.array.Honduras); break;
            case "Barbados": info = res.getStringArray(R.array.Barbados); break;
            case "Uruguay": info = res.getStringArray(R.array.Uruguay); break;
            default: throw new IllegalStateException("Unexpected value: " + intentValue);
        }
        return info;
    }

    public void Back(View view) { finish(); }

    public void goToWeb(View view) {
        String[] info = getInfo();
        String url =  info[0];
        Uri webpage = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(webIntent);
    }

    public void goToMap(View view) {
        String[] info = getInfo();
        Uri location = Uri.parse(info[1]);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        startActivity(mapIntent);
    }
}