package com.demo.learningtask32_rivera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageView imgOne = findViewById(R.id.Burj);
        imgOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Burjkhalifa.class);
                startActivity(i);
            }
        });
        ImageView imgTwo = findViewById(R.id.central);
        imgTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Centralpark.class);
                startActivity(i);
            }
        });
        ImageView imgThree = findViewById(R.id.eiffel);
        imgThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Eiffeltower.class);
                startActivity(i);
            }
        });
        ImageView imgFour = findViewById(R.id.greatwall);
        imgFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Greatwall.class);
                startActivity(i);
            }
        });
        ImageView imgFive = findViewById(R.id.niagara);
        imgFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Niagarafalls.class);
                startActivity(i);
            }
        });
        ImageView imgSix = findViewById(R.id.taj);
        imgSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Tajmahal.class);
                startActivity(i);
            }
        });
    }
}