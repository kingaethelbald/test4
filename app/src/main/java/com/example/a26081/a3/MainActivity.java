package com.example.a26081.a3;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        getFragmentManager().beginTransaction().add(android.R.id.content, new fragment()).commit();

    }

}