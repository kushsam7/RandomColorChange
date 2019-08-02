package com.example.labexperrimenttwo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        Random col = new Random();
//        int c = Color.argb(col.nextInt(256), col.nextInt(256), col.nextInt(256), col.nextInt(256));
//        findViewById(android.R.id.content).setBackgroundColor(c);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomAndroidColor);
    }
}
