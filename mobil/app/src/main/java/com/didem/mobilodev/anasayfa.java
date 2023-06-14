package com.didem.mobilodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class anasayfa extends AppCompatActivity {
public Button btn;
public  Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

       btn=findViewById(R.id.button);
       btn.setOnClickListener(view -> {
           Intent intent =new Intent(anasayfa.this,KullaniciSayfasi.class);

           startActivity(intent);
       });

       btn2=findViewById(R.id.button7);
       btn2.setOnClickListener(view -> {
           Intent intent2=new Intent(anasayfa.this,MainActivity3.class);
           startActivity(intent2);
       });
    }
}