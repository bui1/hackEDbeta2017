package com.example.android.hiddengems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class list_screen extends AppCompatActivity {



    private EditText editTxt;
    private Button btn;
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    private EditText editTxt2;
    private Button btn2;
    private ListView list2;
    private ArrayAdapter<String> adapter2;
    private ArrayList<String> arrayList2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);

        // Get the Intent that started this activity and extract the string
        //Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        //String messageName = intent.getStringExtra(profile_setup.EXTRA_MESSAGE);
        //String messageCity = intent.getStringExtra(profile_setup.EXTRA_MESSAGE2);
        String player1name = extras.getString("EXTRA_MESSAGE");
        //String player2name = extras.getString("EXTRA_MESSAGE2");
        // Capture the layout's TextView and set the string as its text
        TextView textViewName = findViewById(R.id.yourName);
        textViewName.setText(player1name);
        TextView textViewCity = findViewById(R.id.yourCity);
        //textViewCity.setText(player2name);


//        ListView personal_locations = (ListView) findViewById(R.id.list_personal_locations);
//
//        String[] locations = Locations_list.getLocations();
//        for (String location: locations){
//            personal_locations.append(location+"\n\n\n");
//        }
//
//        ListView new_locations = (ListView) findViewById(R.id.wish_list);
//
//        String[] new_places = check_out_location.get_places();
//        for (String place: new_places){
//            new_locations.add(place+"\n\n\n");
//        }



        editTxt = (EditText) findViewById(R.id.new_gem);
        btn = (Button) findViewById(R.id.enter_gem);
        list = (ListView) findViewById(R.id.list_personal_locations);
        arrayList = new ArrayList<String>();

        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);

        // Here, you set the data in your ListView
        list.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // this line adds the data of your EditText and puts in your array
                arrayList.add(editTxt.getText().toString());
                editTxt.getText().clear();
                // next thing you have to do is check if your adapter has changed
                adapter.notifyDataSetChanged();
            }
        });





    }





}
