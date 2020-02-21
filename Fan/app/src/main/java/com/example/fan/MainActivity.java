package com.example.fan;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton butt;
    ImageView imageView;
    ObjectAnimator rotateAnimator;
    Switch switchButton;
    SeekBar seekbar;
    final int SPEED[]={0, 5000, 3000, 1000};
    GradientDrawable gd = new GradientDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butt = (ToggleButton) findViewById(R.id.toggleButton);
        switchButton = (Switch) findViewById(R.id.switchButton);
        seekbar = (SeekBar) findViewById(R.id.seekBar2);
        imageView = (ImageView) findViewById(R.id.imageView);

        rotateAnimator=ObjectAnimator.ofFloat(imageView, "rotation", 0, 360);
        rotateAnimator.setDuration(1000);
        rotateAnimator.setRepeatCount(ValueAnimator.INFINITE);
        rotateAnimator.setInterpolator(new LinearInterpolator());

        gd.setShape(GradientDrawable.RECTANGLE);
        gd.setGradientType(GradientDrawable.RADIAL_GRADIENT);
        gd.setGradientRadius(330);

        rotateAnimator.setDuration(SPEED[2]);
        rotateAnimator.start();

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(butt.isChecked()){
                    rotateAnimator.setDuration(SPEED[1]);
                    rotateAnimator.start();
                }
                else {
                    rotateAnimator.end();
                }
            }
        });


        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    gd.setColors(new int[]{Color.YELLOW, Color.TRANSPARENT});
                    imageView.setBackground(gd);
                }
                else{
                    imageView.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser==true && butt.isChecked()){
                    rotateAnimator.setDuration(SPEED[progress]);
                    rotateAnimator.start();
                }
                else{
                    rotateAnimator.end();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
