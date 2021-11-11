package com.example.myfilmrating;
//gjimenez
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goProfile (View view){ //Cambiar a Profile
        Intent next=new Intent(this, Profile.class);
        startActivity(next);
    }

    public void goMyRates (View view){ //Cambiar a Myrates
        Intent next=new Intent(this, MyRates.class);
        startActivity(next);
    }

}