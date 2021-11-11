package com.example.myfilmrating;
//gjimenez
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddFilm extends AppCompatActivity {
    EditText film;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_film);
        film=(EditText) findViewById(R.id.film);
    }
    public void sendFilm(View view){
        sendText(film.getText()+"");
    }
    public void sendText(String movie){
        Intent send=new Intent();
        send.setAction(Intent.ACTION_SEND);
        send.putExtra(Intent.EXTRA_TEXT, movie);
        send.setType("text/plain");
        if (send.resolveActivity(getPackageManager()) != null) {
            startActivity(send);
        }

    }
}