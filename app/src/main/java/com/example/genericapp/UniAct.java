package com.example.genericapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UniAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni);

        Intent receivedText = getIntent();
        String intentValue = receivedText.getStringExtra("country");
        String[] info = getInfo();
        TextView tv1 = (TextView)findViewById(R.id.textView);
        tv1.setText(intentValue);

    }
    public String[] getInfo(){
        Resources res = getResources();
        Intent receivedText = getIntent();
        String intentValue = receivedText.getStringExtra("country");
        String[] info;
        ImageView logo = (ImageView)findViewById(R.id.imageView2);
        switch (intentValue){
            case "Fiji":
                info = res.getStringArray(R.array.Fiji);
                logo.setImageResource(R.drawable.fiji);
                break;
            case "Guam":
                info = res.getStringArray(R.array.Guam);
                logo.setImageResource(R.drawable.guam);
                break;
            case "Samoa":
                info = res.getStringArray(R.array.Samoa);
                logo.setImageResource(R.drawable.samoa);
                break;
            case "New Zealand":
                info = res.getStringArray(R.array.NewZealand);
                logo.setImageResource(R.drawable.newzealand);
                break;
            case "Nigeria":
                info = res.getStringArray(R.array.Nigeria);
                logo.setImageResource(R.drawable.lagos);
                break;
            case "Congo":
                info = res.getStringArray(R.array.Congo);
                logo.setImageResource(R.drawable.marien_ng);
                break;
            case "Uganda":
                info = res.getStringArray(R.array.Uganda);
                logo.setImageResource(R.drawable.makerere);
                break;
            case "Chad":
                info = res.getStringArray(R.array.Chad);
                logo.setImageResource(R.drawable.undj);
                break;
            case "Sri Lanka":
                info = res.getStringArray(R.array.SriLanka);
                logo.setImageResource(R.drawable.colombo);
                break;
            case "Thailand":
                info = res.getStringArray(R.array.Thailand);
                logo.setImageResource(R.drawable.mahidol);
                break;
            case "Nepal":
                info = res.getStringArray(R.array.Nepal);
                logo.setImageResource(R.drawable.nepal);
                break;
            case "Kyrgystan":
                info = res.getStringArray(R.array.Kyrgystan);
                logo.setImageResource(R.drawable.kyrgystan);
                break;
            case "Nicaragua":
                info = res.getStringArray(R.array.Nicaragua);
                logo.setImageResource(R.drawable.nicaragua);
                break;
            case "Honduras":
                info = res.getStringArray(R.array.Honduras);
                logo.setImageResource(R.drawable.honduras);
                break;
            case "Barbados":
                info = res.getStringArray(R.array.Barbados);
                logo.setImageResource(R.drawable.barbados);
                break;
            case "Uruguay":
                info = res.getStringArray(R.array.Uruguay);
                logo.setImageResource(R.drawable.uruguay);
                break;
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