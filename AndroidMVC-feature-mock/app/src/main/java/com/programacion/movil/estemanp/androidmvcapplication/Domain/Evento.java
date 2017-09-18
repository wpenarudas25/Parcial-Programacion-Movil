package com.programacion.movil.estemanp.androidmvcapplication.Domain;
import java.sql.Date;

/**
 * Created by wpena on 17/09/2017.
 */

public class Evento {

    private int imagen;
    private String nombreEvento,descripcion,lugarEvento,encargado,requisitos;
    private Date fecha;
    private String tipoEvento;

    public Evento(int imagen, String nombreEvento, String tipoEvento, String descripcion,
                  String lugarEvento, String encargado, String requisitos, Date fecha) {
        this.imagen = imagen;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.lugarEvento = lugarEvento;
        this.encargado = encargado;
        this.requisitos = requisitos;
        this.fecha = fecha;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
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
        return requisitos;
    }

    public void setReqiositos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
