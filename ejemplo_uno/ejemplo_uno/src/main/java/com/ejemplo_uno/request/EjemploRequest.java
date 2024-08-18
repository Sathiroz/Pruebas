package com.ejemplo_uno.request;

import java.sql.Date;


public class EjemploRequest {

	
	private  int ejemploId; 
	private String nombre;
	private Date fecha;
	
	public EjemploRequest() {
		
	}

	public EjemploRequest(int ejemploId, String nombre, Date fecha) {
		super();
		this.ejemploId = ejemploId;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public int getEjemploId() {
		return ejemploId;
	}

	public void setEjemploId(int ejemploId) {
		this.ejemploId = ejemploId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "EjemploRequest [ejemploId=" + ejemploId + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
	
}
