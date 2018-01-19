package br.com.caelum.fj22estudos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.fj22estudos.modelo.CarrinhoItens;

@Repository
public class CarrinhoItensDao {

	@PersistenceContext
	private EntityManager manager;
	public void save(CarrinhoItens carrinhoItens) {
		manager.persist(carrinhoItens);
	}
}
