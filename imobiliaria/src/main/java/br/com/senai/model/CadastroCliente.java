package br.com.senai.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class CadastroCliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String nome;
	
	private String cpf;
	
	private double salario;
	
	private double telefone;
	
	private String NomeAvalista;
	
	private String cpfAvalista;
	
	private double salarioAvalista;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public String getNomeAvalista() {
		return NomeAvalista;
	}

	public void setNomeAvalista(String nomeAvalista) {
		NomeAvalista = nomeAvalista;
	}

	public String getCpfAvalista() {
		return cpfAvalista;
	}

	public void setCpfAvalista(String cpfAvalista) {
		this.cpfAvalista = cpfAvalista;
	}

	public double getSalarioAvalista() {
		return salarioAvalista;
	}

	public void setSalarioAvalista(double salarioAvalista) {
		this.salarioAvalista = salarioAvalista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroCliente other = (CadastroCliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
}
