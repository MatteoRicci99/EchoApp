package com.example.echoapp;


import android.database.sqlite.SQLiteClosable;

public class DBhelper extends SQLiteClosable {



    @Override
    protected void onAllReferencesReleased() {

    }
}
