package com.example.computershortcutkey;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {
    private ImageView logo;
    private static int splashTimeOut=5000;
    TextView textView;

    private ProgressBar bar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bar=findViewById(R.id.progress);
        textView=findViewById(R.id.text);
        bar.setVisibility(bar.VISIBLE);
        logo=findViewById(R.id.logo);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mysplashanimation);
        textView.startAnimation(myanim);
        logo.startAnimation(myanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splashTimeOut);
    }
}
