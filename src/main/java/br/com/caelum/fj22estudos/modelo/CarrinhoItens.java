package br.com.caelum.fj22estudos.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CarrinhoItens {
	@Id
	private int cdCarrinhoItem;
	public int getCdCarrinhoItem() {
		return cdCarrinhoItem;
	}
	public void setCdCarrinhoItem(int cdCarrinhoItem) {
		this.cdCarrinhoItem = cdCarrinhoItem;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public Livros getLivro() {
		return livro;
	}
	public void setLivro(Livros livro) {
		this.livro = livro;
	}
	@ManyToOne
	private Carrinho carrinho;
	@ManyToOne
	private Livros livro;
	
}
