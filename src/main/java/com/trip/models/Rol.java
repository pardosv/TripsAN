package com.trip.models;

import java.util.Date;

public class Rol {

    
    private Integer id;

    private String nombre;
    private String descripcion;

    private boolean estado;

    
    private Date fechaCreacion;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

	public void setId(long l) {
		// TODO Auto-generated method stub
		
	}
}
