package org.generation.Farmacia.Repository;

import java.util.List;

import org.generation.Farmacia.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
