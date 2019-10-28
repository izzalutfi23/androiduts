package com.example.rembangfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Preview extends AppCompatActivity {

    TextView nama, harga, jumlah, total;
    EditText inputbayar;
    Button bayar;

    private String KEY_NAMA = "nama";
    private String KEY_HARGA = "harga";
    private String KEY_JUMLAH = "jumlah";
    private String KEY_TOTAL = "total";
    private String KEY_BAYAR = "bayar";

    private String get_nama;
    private String get_harga;
    private String get_jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        nama = findViewById(R.id.nama);
        harga = findViewById(R.id.harga);
        jumlah = findViewById(R.id.jumlah);
        total = findViewById(R.id.total);
        inputbayar = findViewById(R.id.input_bayar);
        bayar = findViewById(R.id.btn_bayar);

        Intent i = getIntent();
        get_nama = i.getStringExtra(KEY_NAMA);
        get_harga = i.getStringExtra(KEY_HARGA);
        get_jumlah = i.getStringExtra(KEY_JUMLAH);

        double harga1 = Double.parseDouble(get_harga);
        final double jumlah1 = Double.parseDouble(get_jumlah);
        final double total1 = harga1*jumlah1;

        nama.setText(get_nama);
        harga.setText("Rp "+get_harga);
        jumlah.setText(get_jumlah);
        total.setText("Rp "+total1);

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_byr = inputbayar.getText().toString();
                double a = Double.parseDouble(input_byr);

                if (a<total1)
                {
                    Toast.makeText(getApplicationContext(), "Jumlah Pembayaran Kurang",Toast.LENGTH_LONG).show();
                }
                else {

                    Intent i = new Intent(Preview.this, Selesai.class);
                    i.putExtra(KEY_NAMA, get_nama);
                    i.putExtra(KEY_HARGA, get_harga);
                    i.putExtra(KEY_JUMLAH, get_jumlah);
                    i.putExtra(KEY_TOTAL, "" + total1);
                    i.putExtra(KEY_BAYAR, input_byr);
                    startActivity(i);
                }
            }
        });
    }
}
