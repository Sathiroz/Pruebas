package com.ejemplo_uno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo_uno.entity.Ejemplo;

@Repository
public interface EjemploRepository extends JpaRepository<Ejemplo, Integer>{

}
