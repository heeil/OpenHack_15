package com.example.openhack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

import com.google.android.material.bottomnavigation.BottomNavigationView;


    public class registerPage2 extends AppCompatActivity {
        private TextView mTextMessage;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register_page2);


            Button nextButton = findViewById(R.id.nextButton);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), registerPage.class);
                    startActivity(intent);
                }
            });
        }
    }

