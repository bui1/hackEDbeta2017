package com.example.android.hiddengems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void buttonOnClick(View v){
        Button toMenuOption = (Button) findViewById(R.id.started);
        startActivity(new Intent(getApplicationContext(), profile_setup.class));
    }





}
