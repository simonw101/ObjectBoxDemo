package com.example.objectboxdemo;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Note {

    @Id long id;

    String title;

    String text;

    Date CreatedAt;

}
