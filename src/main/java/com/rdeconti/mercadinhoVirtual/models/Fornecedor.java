package com.rdeconti.mercadinhoVirtual.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fornecedor {

	@Id
	private Integer codigoFornecedor;
	private String nome;
	private String telefone;

	public Fornecedor(Integer codigoFornecedor, String nome, String telefone) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nome = nome;
		this.telefone = telefone;
	}

	public Fornecedor(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public Integer getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(Integer codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
	

