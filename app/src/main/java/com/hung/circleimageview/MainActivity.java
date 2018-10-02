package com.hung.circleimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        CircleImageView  newView = findViewById(R.id.img_new2);
        newView.setImageDrawable(getResources().getDrawable(R.drawable.trump));
        //
        CircleImageViewOld oldView = findViewById(R.id.img_old);

    }
}
