package br.com.caelum.fj22estudos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.fj22estudos.modelo.Carrinho;

@Repository
public class CarrinhoDao {
    @PersistenceContext
	private EntityManager manager;
    public void save (Carrinho carrinho) {
    	manager.persist(carrinho);
    }
}
