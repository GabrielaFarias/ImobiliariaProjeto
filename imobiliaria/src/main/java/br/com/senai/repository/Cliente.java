package br.com.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.CadastroCliente;

public interface Cliente extends JpaRepository<CadastroCliente, Long>{

}
