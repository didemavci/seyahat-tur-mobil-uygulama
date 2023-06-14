package com.didem.mobilodev;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button3);
        button.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);

            startActivity(intent);
        });
    }

}