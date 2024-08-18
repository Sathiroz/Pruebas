package com.ejemplo_uno.logic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo_uno.entity.Ejemplo;
//import com.ejemplo_uno.excepcion.ResourceNotFoundExcepcion;
import com.ejemplo_uno.repository.EjemploRepository;
import com.ejemplo_uno.service.EjemploService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EjemploLogic implements EjemploService{

	@Autowired
	EjemploRepository repo;
	
	
	@Override
	public Ejemplo guardar(Ejemplo ejemplo) {
		if (!repo.findById(ejemplo.getEjemploId()).isPresent()) {
			return repo.save(ejemplo);
		}
		throw new EntityNotFoundException("Error al guardar, no puedes poner valores null");
	}

	@Override
	public Ejemplo actualizar(int id, Ejemplo ejemplo) {
		Optional<Ejemplo> ejemplos = repo.findById(id);
		
		if (ejemplos.isPresent()) {
		Ejemplo existente = ejemplos.get();
		
		existente.setNombre(ejemplo.getNombre());
		existente.setFecha(ejemplo.getFecha());
		
		return repo.save(existente);
		}else {
			throw new EntityNotFoundException("No se encontro el id" + id);
		}
	}

	@Override
	public String eliminar(int id) {
		return repo.findById(id).map(e ->{
			repo.deleteById(id);
			return "Eliminado correctamente";
		}).orElseThrow(()-> new EntityNotFoundException("No se econtro el id"))  ;
	}

	@Override
	public Ejemplo buscar(int id) {
		return repo.findById(id).orElseThrow(() -> new EntityNotFoundException("No se encontro el id"));
	}

	@Override
	public List mostrar() {
		return repo.findAll();
	}

}
