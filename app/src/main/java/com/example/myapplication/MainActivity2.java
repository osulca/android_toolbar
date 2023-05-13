package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtTitle2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*
        Integer nro1 = getIntent().getExtras().getInt("nro1");
        Integer nro2 = getIntent().getExtras().getInt("nro2");
        Integer suma = nro1 + nro2;
        txtTitle2 = findViewById(R.id.txtTitle2);
        txtTitle2.setText(String.valueOf(suma));
        */
    }
}