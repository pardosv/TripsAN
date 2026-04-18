package com.trip.models;

public class Usuario {
	
	private int id;
	private String nomUsuarios;
	private String email;
	private String usaername;
	private String password;
	private boolean activo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomUsuarios() {
		return nomUsuarios;
	}
	public void setNomUsuarios(String nomUsuarios) {
		this.nomUsuarios = nomUsuarios;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsaername() {
		return usaername;
	}
	public void setUsaername(String usaername) {
		this.usaername = usaername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	

}
