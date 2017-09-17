package com.programacion.movil.estemanp.androidmvcapplication.Domain;

import android.media.Image;
import android.text.format.DateFormat;

import java.sql.Array;

/**
 * Created by wpena on 17/09/2017.
 */

public class Evento {

    private Image imagen;
    private String nombreEvento,descripcion,lugarEvento,encargado,reqiositos;
    private DateFormat fecha;
    private String tipoEvento []= {"Culturales", "Gastronómicos", "Empresariales","Sociales","Deportivos","Academicos","Religiosos"};


    public Evento(Image imagen, String nombreEvento, String[] tipoEvento, String descripcion, String lugarEvento, String encargado, String reqiositos, DateFormat fecha) {
        this.imagen = imagen;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.lugarEvento = lugarEvento;
        this.encargado = encargado;
        this.reqiositos = reqiositos;
        this.fecha = fecha;
    }

    public String[] getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String[] tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getReqiositos() {
        return reqiositos;
    }

    public void setReqiositos(String reqiositos) {
        this.reqiositos = reqiositos;
    }

    public DateFormat getFecha() {
        return fecha;
    }

    public void setFecha(DateFormat fecha) {
        this.fecha = fecha;
    }
}
