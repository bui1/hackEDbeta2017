package com.example.android.hiddengems;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class profile_setup extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.hiddengems.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.hiddengems.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setup);


        Button toMenuOption = (Button) findViewById(R.id.toMain);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, list_screen.class);
        EditText editName = (EditText) findViewById(R.id.fullName);
        //EditText editCity = (EditText) findViewById(R.id.cityInput);
        String messageName = editName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messageName);
        startActivity(intent);
    }

    public void onClick(View v){
        Intent intent = new Intent();
// Show only images, no videos or anything else
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
// Always show the chooser (if there are multiple options available)
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1);
    }

//    public void sendMessage(View v) {
//        Intent intent = new Intent(this, list_screen.class);
//        EditText editName = (EditText) findViewById(R.id.fullName);
//        //EditText editCity = (EditText) findViewById(R.id.cityInput);
//        String messageName = editName.getText().toString();
//        //String messageCity = editCity.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, messageName);
//        //intent.putExtra(EXTRA_MESSAGE, messageCity);
//        startActivity(intent);
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri uri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                // Log.d(TAG, String.valueOf(bitmap));

                ImageView imageView = (ImageView) findViewById(R.id.profileP);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void goToMain(View v){

        Intent intent = new Intent(this, list_screen.class);
        EditText editName = (EditText) findViewById(R.id.fullName);
        EditText editCity = (EditText) findViewById(R.id.cityInput);
        String messageName = editName.getText().toString();
        String messageCity = editCity.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messageName);
        intent.putExtra(EXTRA_MESSAGE2, messageCity);
        startActivity(intent);



        //startActivity(new Intent(getApplicationContext(), list_screen.class));
    }


}
