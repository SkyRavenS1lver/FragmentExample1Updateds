package com.example.fragmentexample1updated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        satu act bisa menampung beberapa fragment, kalau act tidak bisa masuk ke act lain, tapi frag bisa masuk ke act lain.

    }
}