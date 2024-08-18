package com.Ejemplo_dos.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EJEMPLO")
public class Ejemplo {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID_EJEMPLO")
	private int idEjemplo;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "FECHA")
	private LocalDate fecha;
	
	
	
	public Ejemplo() {
		super();
	}
	public Ejemplo(int idEjemplo, String nombre, LocalDate fecha) {
		super();
		this.idEjemplo = idEjemplo;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	public int getIdEjemplo() {
		return idEjemplo;
	}
	public void setIdEjemplo(int idEjemplo) {
		this.idEjemplo = idEjemplo;
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
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
}
