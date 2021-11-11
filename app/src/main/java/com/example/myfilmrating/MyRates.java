package com.example.myfilmrating;
//gjimenez
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MyRates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rates);
    }
    public void goToRnTs(View view) {
        goToUrl ( "https://www.rottentomatoes.com");
    } //www.rottentomatoes.com


    private void goToUrl (String url) { //Abre la url
        Uri uriUrl = Uri.parse(url);
        Intent launcher = new Intent(Intent.ACTION_VIEW, uriUrl);
        launcher.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        launcher.setPackage("com.android.chrome");
        try {
            startActivity(launcher);
        } catch (ActivityNotFoundException ex) {  // Abrir otro navegador.
           launcher.setPackage(null);
        }
    }

    public void goAddFilm (View view){ // Cambiar a activity AddFilm
        Intent next=new Intent(this, AddFilm.class);
        startActivity(next);
    }



}