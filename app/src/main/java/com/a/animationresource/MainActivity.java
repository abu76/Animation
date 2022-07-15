package com.a.animationresource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Button button;
    ImageView imageView;
    Animation girlAnim, upBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);
        upBottom= AnimationUtils.loadAnimation(MainActivity.this, R.anim.up_from_bottom_slow);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             imageView.startAnimation(upBottom);
            }
        });
    }
}