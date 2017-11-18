package com.example.android.hiddengems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class profile_setup extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setup);
    }

    public void goToMain(View v){
        Button toMenuOption = (Button) findViewById(R.id.toMain);
        startActivity(new Intent(getApplicationContext(), list_screen.class));
    }


}
