package br.com.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.CadastroImovel;


public interface Imobiliaria extends JpaRepository<CadastroImovel,Long>{

}
