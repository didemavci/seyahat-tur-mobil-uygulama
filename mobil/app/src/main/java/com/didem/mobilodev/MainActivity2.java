package com.didem.mobilodev;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
public Button btngiris;
    public EditText edittextad,editTextsifre;


    public SharedPreferences sp;
    public  SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edittextad =(EditText) findViewById(R.id.editTextTextPersonName2);
        editTextsifre=(EditText) findViewById(R.id.editTextNumberPassword2);
        btngiris=findViewById(R.id.button2);
        sp=getSharedPreferences("com.didem.mobilodev" , Context.MODE_PRIVATE);
        editor =sp.edit();


       btngiris.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(edittextad.getText().toString().equals("admin")&& editTextsifre.getText().toString().equals("1234")) {
                   editor.putString("ad", edittextad.getText().toString());
                   editor.putString("sifre", editTextsifre.getText().toString());
                   editor.commit();
                   startActivity(new Intent(MainActivity2.this, anasayfa.class));
               }
               else
               {
                   Toast.makeText(getApplicationContext(),"giriş hatalı",Toast.LENGTH_SHORT).show();
               }
           }
       });



    }
}