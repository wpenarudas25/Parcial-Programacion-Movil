package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.Evento;

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
        eventos.add(new Evento(1,"Feria de las flores","Culturales","Descripción","Lugar","David Ramos","Llevar flores", new Date(2017, 9 ,18) ));
        eventos.add(new Evento(1,"Junior Vs Nacional","Deportivos","Descripción","Lugar","Wilmar Peña","Todos al estadio",new Date(2017, 9 ,19) ));
    }


    public ArrayList<Evento> getEventos() {

        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
}
