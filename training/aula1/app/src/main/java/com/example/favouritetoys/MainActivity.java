package com.example.favouritetoys;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //The class R is generated when the application is compiled: in the  class R are include all constants, related to the content on the res folder.
        //The setContentView view method reads all XML and creates an object for each XML tag, so we can manipulate them
        setContentView(R.layout.activity_main); //Association between the current activity with the view.
    }
}
