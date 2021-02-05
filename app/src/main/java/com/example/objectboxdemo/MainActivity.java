package com.example.objectboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.objectbox.Box;

public class MainActivity extends AppCompatActivity {

    public void click(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Note note = new Note();
//
//        note.title = "Test";
//
//        note.text = "Test";
//
//        note.CreatedAt = new Date();
//
//        noteBox.put(note);


    }
}