package br.com.caelum.fj22estudos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.fj22estudos.modelo.Categoria;

@Repository
public class CategoriaDao {

	@PersistenceContext
	private EntityManager manager;
	public void save (Categoria categoria) {
		manager.persist(categoria);
	}
}
