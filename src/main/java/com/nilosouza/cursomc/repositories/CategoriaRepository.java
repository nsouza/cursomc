package com.nilosouza.cursomc.repositories;

import org.springframework.stereotype.Repository;

import com.nilosouza.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {	

}
