package com.mariela.leon.proyectosqlite.modelo;

import android.content.Context;
import android.widget.Toast;

public class Empleado {

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String estadoCivil;

    public void insertarEmpleado(Context person){
        TiendaSQL cp = new TiendaSQL(person); //INSTANCIA
        String sql = "INSERT INTO empleado(cedula,nombre,apellido,direccion,estadocivil)";
        sql+="VALUES('"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getEstadoCivil()+"')";

        Toast.makeText(person, "->"+sql, Toast.LENGTH_SHORT).show();
        cp.getWritableDatabase().execSQL(sql);
    }

    public void editarEmpleado(Context person){
        TiendaSQL cp = new TiendaSQL(person); //INSTANCIA
        String sql = "update empleado set nombre='"+getNombre()+"',apellido='"+getApellido()+"',direccion='"+getDireccion()+"',estadocivil='"+getEstadoCivil()+"' WHERE cedula='"+getCedula()+"'";

        Toast.makeText(person, "->"+sql, Toast.LENGTH_SHORT).show();
        cp.getWritableDatabase().execSQL(sql);
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
