package com.trip.models;

public class Categoria {
	
	private Integer id;
	private String nomCatergoria;
	private String descripcion;
	private boolean activo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomCatergoria() {
		return nomCatergoria;
	}
	public void setNomCatergoria(String nomCatergoria) {
		this.nomCatergoria = nomCatergoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	

	
	
	
}
