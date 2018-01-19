package br.com.caelum.fj22estudos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.fj22estudos.modelo.Livros;

@Repository
public class LivrosDao {
	
	@PersistenceContext
	private EntityManager manager;
	public void save(Livros livros) {
		manager.persist(livros);
	}
	public List<Livros> BuscaTodos(){
		return manager.createQuery("Select c from Livros c",Livros.class).getResultList();
	}
	public List<Livros> BuscaPorTitulo(String titulo) {
		return manager.createQuery("Select s from Livros s where s.titulo like '%titulo%'",Livros.class).setParameter("titulo", titulo).getResultList();
		
	}
	public List<Livros> BuscaPorAutor(String autor) {
		return manager.createQuery("Select s from Livros s where s.autor like '%autor%'",Livros.class).setParameter("autor", autor).getResultList();
		
	}
	public List<Livros> BuscaPorCategoria(String categoria) {
		return manager.createQuery("Select s from Livros s left join fetch s.categoria where s.categoria like '%categoria%'",Livros.class).setParameter("categoria", categoria).getResultList();
		
	}

}
