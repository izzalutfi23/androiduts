package com.example.rembangfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.tombollogin);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String cekusername = username.getText().toString();
                final String cekpassword = password.getText().toString();
                if(cekusername.equals("izza")&&cekpassword.equals("123")){
                    Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, Utama.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Gagal Login", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
