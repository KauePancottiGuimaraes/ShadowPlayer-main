package com.example.shadowplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void next(View view){
        Intent it = new Intent(this, MainActivity6.class);
        startActivity(it);
    }
    public void back(View view) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
    public void legal(View view){
        Intent it = new Intent(this, MainActivity2.class);
        startActivity(it);
    }
}