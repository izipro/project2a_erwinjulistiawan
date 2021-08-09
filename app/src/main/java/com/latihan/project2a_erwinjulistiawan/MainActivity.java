package com.latihan.project2a_erwinjulistiawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtangkapertama,txtangkakedua;
    TextView hasil;
    int input1,input2,output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtangkapertama = (EditText) findViewById(R.id.txtangkapertama);
        txtangkakedua = (EditText) findViewById(R.id.txtangkakedua);
        hasil = (TextView) findViewById(R.id.hasil);
    }
    public void konver(){
        input1 = Integer.parseInt(txtangkapertama.getText().toString());
        input2 = Integer.parseInt(txtangkakedua.getText().toString());


    }
    public void btntambah(View view){
        konver();
        output=input1+input2;
        hasil.setText(String.valueOf(output));
    }
    public void btnkurang(View view){
        konver();
        output=input1-input2;
        hasil.setText(String.valueOf(output));
    }
    public void btnkali(View view){
        konver();
        output=input1*input2;
        hasil.setText(String.valueOf(output));
    }
    public void btnbagi(View view){
        konver();
        output=input1/input2;
        hasil.setText(String.valueOf(output));
    }
    public void btnbersihkan(View view){
        txtangkapertama.setText("");
        txtangkakedua.setText("");
        hasil.setText("");
    }
}