package br.com.senai.model;

import javax.persistence.Column;

public class ImovelVenda extends CadastroImovel{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "valor")
	private double valorVenda;
	
	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
}
