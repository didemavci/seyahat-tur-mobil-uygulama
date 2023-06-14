package com.didem.mobilodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
public Button btnrez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnrez=findViewById(R.id.button6);
        btnrez.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
            startActivity(intent);
        });


    }
}