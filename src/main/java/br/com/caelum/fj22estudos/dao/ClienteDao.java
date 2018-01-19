package br.com.caelum.fj22estudos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.fj22estudos.modelo.Cliente;

@Repository
public class ClienteDao {
	@PersistenceContext
	private EntityManager manager;
	public void save (Cliente cliente) {
		manager.persist(cliente);
	}
	public List<Cliente> BuscaTodos() {
		return manager.createQuery("Select c from Cliente c",Cliente.class).getResultList();
	}

}
 