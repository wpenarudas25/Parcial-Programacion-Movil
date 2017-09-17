package com.programacion.movil.estemanp.androidmvcapplication.Domain;

/**
 * Created by estemanp on 19/08/16.
 */
public class User {

    private String name;
    private String lastName;
    private String userName;
    private String password;
    private String rol;


    public User(String name, String lastName, String userName, String password, String rol){
        this.setName(name);
        this.setLastName(lastName);
        this.setUserName(userName);
        this.setPassword(password);
        this.setRol(rol);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
