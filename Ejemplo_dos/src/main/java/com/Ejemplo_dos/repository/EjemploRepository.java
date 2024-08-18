package com.Ejemplo_dos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ejemplo_dos.entity.Ejemplo;

@Repository
public interface EjemploRepository extends JpaRepository<Ejemplo, Integer>{

	
}
