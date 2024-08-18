package com.Ejemplo_dos.service;

import java.util.List;

import com.Ejemplo_dos.entity.Ejemplo;

public interface EjemploService {

	Ejemplo guardar(Ejemplo ejemplo);
	Ejemplo editar(int id,Ejemplo ejemplo);
	String eliminar(int id);
	Ejemplo buscar(int id);
	List mostrar();
	
	
}
