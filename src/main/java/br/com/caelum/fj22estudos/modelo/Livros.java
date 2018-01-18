package br.com.caelum.fj22estudos.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livros {
	@Id
	@GeneratedValue
	private int cdLivro;
	private String titulo;
	private String autor;
	private BigDecimal preco;
	@ManyToOne
	private Categoria categoria;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getCdLivro() {
		return cdLivro;
	}
	public void setCdLivro(int cdLivro) {
		this.cdLivro = cdLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}
