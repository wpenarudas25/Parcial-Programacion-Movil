package com.programacion.movil.estemanp.androidmvcapplication.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.EventoController;
import com.programacion.movil.estemanp.androidmvcapplication.Domain.Evento;
import com.programacion.movil.estemanp.androidmvcapplication.R;

public class LandingActivity extends AppCompatActivity implements OnClickListener{
    TextView nombreEvento;
    TextView fechaEvento;
    TextView lugarEvento;
    TextView encargadoEvento;
    TextView descripcionEvento;
    Button btnBack;

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

        btnBack = (Button)findViewById(R.id.btnBack);

        btnBack.setOnClickListener(this);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras!=null){
            String evento = extras.getString("evento");
            nombreEvento.setText(evento);
            String fecha = extras.getString("fecha");
            fechaEvento.setText(fecha);
            String lugar = extras.getString("lugar");
            lugarEvento.setText(lugar);
            String encargado = "Encargado: "+ extras.getString("encargado");
            encargadoEvento.setText(encargado);
            String descripcion = extras.getString("descripcion");
            descripcionEvento.setText(descripcion);

            int imagen = extras.getInt("imagen");
            imagenEvento.setImageResource(imagen);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnBack:
                Intent intent = new Intent(LandingActivity.this, EventListActivity.class);
                startActivity(intent);
                break;
        }
    }
}
