package com.example.echoapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.example.echoapp.web.WebActivity;

public class HomeActivity extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        switch(id) {

            case R.id.Nuovo:
                break;

            case R.id.Utente:
                break;

            case R.id.Impostazioni:
                break;

            case R.id.TreeDom:
                startActivity(new Intent(this, WebActivity.class));
                break;
        }
        return false;
    }



}
