package com.example.rembangfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Utama extends AppCompatActivity {

    Button dumbeg, kawista, tuyuhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        dumbeg = findViewById(R.id.btn_dumbeg);
        kawista = findViewById(R.id.btn_kawista);
        tuyuhan = findViewById(R.id.btn_tuyuhan);

        dumbeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Utama.this, Dumbeg.class);
                startActivity(i);
            }
        });
        kawista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Utama.this, Kawista.class);
                startActivity(i);
            }
        });
        tuyuhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Utama.this, Tuyuhan.class);
                startActivity(i);
            }
        });
    }
}
