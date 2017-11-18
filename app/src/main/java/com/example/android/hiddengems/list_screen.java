package com.example.android.hiddengems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class list_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);


        TextView personal_locations = (TextView) findViewById(R.id.list_personal_locations);

        String[] locations = Locations_list.getLocations();
        for (String location: locations){
            personal_locations.append(location+"\n\n\n");
        }

        TextView new_locations = (TextView) findViewById(R.id.wish_list);

        String[] new_places = check_out_location.get_places();
        for (String place: new_places){
            new_locations.append(place+"\n\n\n");
        }




    }



}
