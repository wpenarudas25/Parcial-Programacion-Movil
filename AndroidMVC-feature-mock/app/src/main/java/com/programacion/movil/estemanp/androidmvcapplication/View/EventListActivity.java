package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.EventoController;
import com.programacion.movil.estemanp.androidmvcapplication.R;
import com.programacion.movil.estemanp.androidmvcapplication.Domain.Evento;
import com.programacion.movil.estemanp.androidmvcapplication.View.Adaptes.EventosAdapter;
import android.view.View;
import android.widget.AdapterView;

import android.widget.Toast;


public class EventListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        //Localizamos la lista en el control grafico layout en el xml
        ListView lista = (ListView) findViewById(R.id.eventList);

        // Creamos el adaptador asignando tambien el diseño grafico
        //ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, AppController.getInstance().getCityList());
        EventosAdapter adaptador = new EventosAdapter(this, EventoController.getInstance().getEventos());

        // Asignamos el adaptador al control lista
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(view.getContext(),EventoController.getInstance().getEventos().get(position).getCapitalCity(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(EventListActivity.this, LandingActivity.class);
                Evento evento =  (Evento) EventoController.getInstance().getEventos().get(position);

                intent.putExtra("evento",evento.getNombreEvento());
                intent.putExtra("descripcion",evento.getDescripcion());
                intent.putExtra("encargado",evento.getEncargado());
                intent.putExtra("fecha",evento.getFecha().toString());
                intent.putExtra("imagen",evento.getImagen());
                intent.putExtra("lugar",evento.getLugarEvento());
                intent.putExtra("requisitos",evento.getReqiositos());
                intent.putExtra("tipo",evento.getTipoEvento());

                startActivity(intent);
            }
        });
    }
}