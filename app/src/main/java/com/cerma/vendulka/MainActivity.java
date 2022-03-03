package com.cerma.vendulka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
   public TextView labelResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data test = new Data();
       labelResult = findViewById(R.id.result);

        labelResult.setText(test.vypocet());

    }


    }
