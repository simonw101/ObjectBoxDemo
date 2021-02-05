package com.example.objectboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import io.objectbox.Box;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Box<Note> noteBox = ObjectBox.getBoxStore().boxFor(Note.class);

        List<Note> notes = noteBox.getAll();

        for (int i = 0; i < notes.size() ; i++) {

            Log.i("info", notes.get(i).text);

        }

    }
}