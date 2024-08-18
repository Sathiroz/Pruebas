package com.ejemplo_uno.service;

import java.util.List;

import com.ejemplo_uno.entity.Ejemplo;

public interface EjemploService {
	
	
	Ejemplo guardar (Ejemplo ejemplo);
	Ejemplo actualizar (int id, Ejemplo ejemplo);
	String eliminar (int id);
	Ejemplo buscar (int id);
	List mostrar();

}
