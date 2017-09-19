package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.programacion.movil.estemanp.androidmvcapplication.R;

public class LandingActivity extends AppCompatActivity {
    TextView nombreEvento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);


        //Intent intent = getIntent();
        //Bundle extras = intent.getExtras();
        //if (extras!=null){
            //String dato = extras.getString("evento");
            //nombreEvento.setText(dato);
        //}
    }
}
