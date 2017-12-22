package com.richard.lingoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button family,greet,food,school,market;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        family = (Button)findViewById(R.id.family);
        food = (Button)findViewById(R.id.food);
        market = (Button)findViewById(R.id.market);
        school = (Button)findViewById(R.id.schol);
        greet = (Button)findViewById(R.id.greet);

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,Family.class);

                startActivity(intent);

            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,Food.class);

                startActivity(intent);

            }
        });

        greet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,Greetings.class);

                startActivity(intent);

            }
        });

        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,School.class);

                startActivity(intent);

            }
        });

        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,Market.class);

                startActivity(intent);

            }
        });







    }
}
