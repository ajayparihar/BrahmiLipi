package com.example.brahmilipi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Animation sup,sdow;
    Button vovel,alphabet;
    TextView home_bipi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vovel= findViewById(R.id.home_vovel);
        alphabet= findViewById(R.id.home_alphabet);
        home_bipi=findViewById(R.id.home_bipi);

        home_bipi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Made by Bheb Developer",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });

        sup = AnimationUtils.loadAnimation(this,R.anim.anim);
        sdow = AnimationUtils.loadAnimation(this,R.anim.anim2);

        home_bipi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    home_bipi.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    home_bipi.startAnimation(sdow);
                }
                return false;

            }

        });


        vovel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, vovel.class);
                startActivity(intent);
            }
        });


            vovel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    vovel.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    vovel.startAnimation(sdow);
                }
                return false;

            }

        });

       alphabet.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent =new Intent(MainActivity.this, alphabet.class);
               startActivity(intent);
           }
       }));


        alphabet.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    alphabet.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    alphabet.startAnimation(sdow);
                }
                return false;

            }

        });

    }
}
