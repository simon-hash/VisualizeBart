package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        Log.i("info", "Image View berührt");

        ImageView bartimageView = findViewById(R.id.bartimageView);
        ImageView homerimageView = findViewById(R.id.homerimageView);

        bartimageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartimageView = findViewById(R.id.bartimageView);
        bartimageView.setX(-1000);

        bartimageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);


    }
}

// Oder faden lassen dann das oben ersetzten durch

    boolean bartIsShowing = true;

    public void fade(View view){
        Log.i("info","Image View berührt");

        ImageView bartimageView = findViewById(R.id.bartimageView);
        bartimageView.animate().alpha(0).setDuration(2000);

        ImageView homerimageView = findViewById(R.id.homerimageView);
        homerimageView.animate().alpha(1).setDuration(2000);

        if (bartIsShowing){
            bartIsShowing = false;
            bartimageView.animate().alpha(0).setDuration(2000);
            homerimageView.animate().alpha(1).setDuration(2000);
        } else {
            bartIsShowing = true;
            bartimageView.animate().alpha(1).setDuration(2000);
            homerimageView.animate().alpha(0).setDuration(2000);
        }

    }