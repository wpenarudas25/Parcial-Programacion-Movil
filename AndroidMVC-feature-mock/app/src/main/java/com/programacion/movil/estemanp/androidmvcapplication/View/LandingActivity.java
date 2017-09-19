package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.programacion.movil.estemanp.androidmvcapplication.R;

public class LandingActivity extends AppCompatActivity {
    TextView nombreEvento;
    TextView fechaEvento;
    TextView lugarEvento;
    TextView encargadoEvento;
    TextView descripcionEvento;

    ImageView imagenEvento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        nombreEvento = (TextView)findViewById(R.id.txtEvento);
        fechaEvento = (TextView)findViewById(R.id.fechaEvento);
        lugarEvento = (TextView)findViewById(R.id.lugarEvento);
        encargadoEvento = (TextView)findViewById(R.id.encargadoEvento);
        descripcionEvento = (TextView)findViewById(R.id.descripcionEvento);
        imagenEvento = (ImageView)findViewById(R.id.imagenEvento);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras!=null){
            String evento = extras.getString("evento");
            nombreEvento.setText(evento);
            String fecha = extras.getString("fecha");
            fechaEvento.setText(fecha);
            String lugar = extras.getString("lugar");
            lugarEvento.setText(lugar);
            String encargado = extras.getString("encargado");
            encargadoEvento.setText(encargado);
            String descripcion = extras.getString("descripcion");
            descripcionEvento.setText(descripcion);

            String imagen = extras.getString("imagen");
            imagenEvento.setImageResource(R.drawable.cup);

        }
    }
}
