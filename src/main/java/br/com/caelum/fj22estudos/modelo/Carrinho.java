package br.com.caelum.fj22estudos.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Carrinho {
	@Id
	@GeneratedValue
	private int cdCarrinho;
	public int getCdCarrinho() {
		return cdCarrinho;
	}
	public void setCdCarrinho(int cdCarrinho) {
		this.cdCarrinho = cdCarrinho;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@ManyToOne
	private Cliente cliente;

}
