package com.didem.mobilodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class KullaniciSayfasi extends AppCompatActivity {
public Button btnrez2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_sayfasi);

        btnrez2=findViewById(R.id.button5);
        btnrez2.setOnClickListener(view -> {
            Intent intent=new Intent(KullaniciSayfasi.this,MainActivity4.class);
            startActivity(intent);
        });
    }
}