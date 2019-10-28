package com.example.rembangfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kawista extends AppCompatActivity {

    EditText jumlah;
    Button proses;

    private String KEY_NAMA = "nama";
    private String KEY_HARGA = "harga";
    private String KEY_JUMLAH = "jumlah";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kawista);

        jumlah = findViewById(R.id.input_jumlah);
        proses = findViewById(R.id.btn_beli);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputjumlah = jumlah.getText().toString();

                Intent i = new Intent(Kawista.this, Preview.class);
                i.putExtra(KEY_NAMA, "Buah Kawista");
                i.putExtra(KEY_HARGA, "30000");
                i.putExtra(KEY_JUMLAH, inputjumlah);
                startActivity(i);
            }
        });
    }
}
