package com.lanusroots.myfirstapp;
/* Hace referencia a tu proyecto raiz (roots) */

import androidx.appcompat.app.AppCompatActivity;
/* Hace referencia a la libreria general q todo proyecto utiliza (AppCompatActivity) */

import android.os.Bundle;
/* Hace referencia a la libreria para inicio de la app mobile */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}