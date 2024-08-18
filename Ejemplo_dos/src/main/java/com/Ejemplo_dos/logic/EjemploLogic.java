package com.Ejemplo_dos.logic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejemplo_dos.entity.Ejemplo;
import com.Ejemplo_dos.repository.EjemploRepository;
import com.Ejemplo_dos.service.EjemploService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EjemploLogic implements EjemploService{

	@Autowired
	EjemploRepository repo;
	
	
	@Override
	public Ejemplo guardar(Ejemplo ejemplo) {
		
		if (!repo.findById(ejemplo.getIdEjemplo()).isPresent()) {
			return repo.save(ejemplo);
		}
		
		throw new EntityNotFoundException("Error");
		
	}

	@Override
	public Ejemplo editar(int id,Ejemplo ejemplo) {
		Optional<Ejemplo> ejem = repo.findById(id);
		
		if (ejem.isPresent()) {
			Ejemplo existente = new Ejemplo();
			existente.setNombre(ejemplo.getNombre());
			existente.setFecha(ejemplo.getFecha());
			return repo.save(existente);
		}
		
		throw new EntityNotFoundException("Error");
	}

	@Override
	public String eliminar(int id) {
		return repo.findById(id).map(e -> {
			repo.deleteById(id);
			return "Eliminado";
		}).orElseThrow(() -> new EntityNotFoundException("No se encontro el id"));
	}

	@Override
	public Ejemplo buscar(int id) {
		
		return repo.findById(id).orElseThrow(()-> new EntityNotFoundException("No se encontro"));
	}

	@Override
	public List mostrar() {
		
		return repo.findAll();
	}

	
	
}
