package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText nro1, nro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nro1 = findViewById(R.id.etNro1);
        nro2 = findViewById(R.id.etNro2);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_facebook, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1){
            Toast.makeText(getApplicationContext(), "Opcion 1", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.opcion2){
            finish();
            return true;
        }
        if (id == R.id.opcion3) {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void open2(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("nro1", nro1.getText().toString().isEmpty() ? 1 : Integer.parseInt(nro1.getText().toString()));
        i.putExtra("nro2", nro2.getText().toString().isEmpty() ? 2 : Integer.parseInt(nro2.getText().toString()));
        startActivity(i);
    }

    public void open3(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(i);
    }

    public void openEmail(View view) {
        String[] direcciones = {"p.solis@udh.edu.pe", "o.sulca@udh.edu.pe"};
        String tema = "Recordatorio";

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("*/*");
        i.putExtra(Intent.EXTRA_EMAIL, direcciones);
        i.putExtra(Intent.EXTRA_SUBJECT, tema);
        startActivity(i);
    }
}