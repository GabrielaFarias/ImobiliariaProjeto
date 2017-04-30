package br.com.senai.model;

import javax.persistence.Column;

public class ImovelAluga extends CadastroImovel{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "valor")
	private double valorAluguel;
	
	public Double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
}
