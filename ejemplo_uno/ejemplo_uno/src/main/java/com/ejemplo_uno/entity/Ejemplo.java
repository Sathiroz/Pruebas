package com.ejemplo_uno.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ejemplo")
public class Ejemplo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_ejemplo")
	private  int ejemploId; 
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha")
	private LocalDate fecha;
	
	public Ejemplo() {
		
	}
	
	public Ejemplo(int ejemploId, String nombre, LocalDate fecha) {
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
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate localDate) {
		this.fecha = localDate;
	}
	@Override
	public String toString() {
		return "EjemploEntity [ejemploId=" + ejemploId + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
	

}
