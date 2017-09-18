package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.Evento;
import com.programacion.movil.estemanp.androidmvcapplication.R;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by wpena on 17/09/2017.
 */

public class EventoController {
    private static EventoController _instance;

    private ArrayList<Evento> eventos;

    public static EventoController getInstance()
    {
        if (_instance == null)
        {
            _instance = new EventoController();
        }
        return _instance;
    }

    private EventoController(){
        this.fillEventoList();
    }


    private void fillEventoList(){
        eventos = new ArrayList<Evento>();
        eventos.add(new Evento(R.mipmap.ic_user,"Feria de las flores","Culturales","Descripción","Lugar","David Ramos","Llevar flores", new Date(2017, 9 ,18) ));
        eventos.add(new Evento(R.mipmap.ic_cup,"Junior Vs Nacional","Deportivos","Liga Águila","Estadio Atanasio","Wilmar Peña","Todos al estadio",new Date(2017, 9 ,19) ));
        eventos.add(new Evento(R.mipmap.ic_grado,"Grados UNAC","Académicos","Unac","Bolivar Rave","Wilmar Peña","Grados 2017",new Date(2017, 9 ,22) ));
    }


    public ArrayList<Evento> getEventos() {

        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
}
