package com.example.rembangfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Selesai extends AppCompatActivity {

    TextView nama, harga, jumlah, total, bayar, kembalian;
    Button kembali;

    private String KEY_NAMA = "nama";
    private String KEY_HARGA = "harga";
    private String KEY_JUMLAH = "jumlah";
    private String KEY_TOTAL = "total";
    private String KEY_BAYAR = "bayar";

    private String get_nama;
    private String get_harga;
    private String get_jumlah;
    private String get_total;
    private String get_bayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);

        nama = findViewById(R.id.nama);
        harga = findViewById(R.id.harga);
        jumlah = findViewById(R.id.jumlah);
        total = findViewById(R.id.total);
        bayar = findViewById(R.id.bayar);
        kembalian = findViewById(R.id.kembalian);
        kembali = findViewById(R.id.kembali);

        Intent i = getIntent();
        get_nama = i.getStringExtra(KEY_NAMA);
        get_harga = i.getStringExtra(KEY_HARGA);
        get_jumlah = i.getStringExtra(KEY_JUMLAH);
        get_total = i.getStringExtra(KEY_TOTAL);
        get_bayar = i.getStringExtra(KEY_BAYAR);

        double byr1 = Double.parseDouble(get_bayar);
        double tot1 = Double.parseDouble(get_total);
        double kembalian1 = byr1-tot1;

        nama.setText(get_nama);
        harga.setText("Rp "+get_harga);
        jumlah.setText(get_jumlah);
        total.setText("Rp "+get_total);
        bayar.setText("Rp "+get_bayar);
        kembalian.setText("Rp "+kembalian1);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Selesai.this, Utama.class);
                startActivity(i);
            }
        });
    }
}
