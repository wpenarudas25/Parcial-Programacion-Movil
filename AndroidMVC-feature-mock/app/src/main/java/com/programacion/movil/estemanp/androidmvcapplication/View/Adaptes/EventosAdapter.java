package com.programacion.movil.estemanp.androidmvcapplication.View.Adaptes;

/**
 * Created by wpena on 17/09/2017.
 */


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.Evento;
import com.programacion.movil.estemanp.androidmvcapplication.R;
import com.programacion.movil.estemanp.androidmvcapplication.Domain.Evento;

import java.util.ArrayList;

/**
 * Created by estemanp on 29/08/16.
 */
public class EventosAdapter extends ArrayAdapter<Evento> {

    private final Context contexto;
    private ArrayList<Evento> eventosList;

    public EventosAdapter(Context context, ArrayList<Evento> eventos) {
        super(context, -1, eventos);
        this.contexto = context;
        this.eventosList = eventos;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) contexto
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layoutEvento = inflater.inflate(R.layout.adapter_evento, parent, false);

        ImageView imgEvento = (ImageView) layoutEvento.findViewById(R.id.imgEvento);
        TextView txtName = (TextView) layoutEvento.findViewById(R.id.txtEvento);
        TextView txtTipo = (TextView) layoutEvento.findViewById(R.id.txtTipo);
        TextView txtHora = (TextView) layoutEvento.findViewById(R.id.txtHora);


        Evento evento = eventosList.get(position);

        imgEvento.setImageResource(evento.getImagen());
        txtName.setText(evento.getNombreEvento());
        txtTipo.setText(evento.getTipoEvento());
        txtHora.setText(evento.getFecha().toString());

        return layoutEvento;
    }
}
