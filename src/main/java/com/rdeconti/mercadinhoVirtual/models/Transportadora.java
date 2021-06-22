package com.rdeconti.mercadinhoVirtual.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transportadora {

	@Id
	private Integer codigoTransportadora;
	private String nome;
	private String modelo;
	private String placa;
	private String telefone;

	public Transportadora(Integer codigoTransportadora, String nome, String modelo, String placa, String telefone) {
		super();
		this.codigoTransportadora = codigoTransportadora;
		this.nome = nome;
		this.modelo = modelo;
		this.placa = placa;
		this.telefone = telefone;
	}

	public Transportadora(String nome, String modelo, String placa, String telefone) {
		this.nome = nome;
		this.modelo = modelo;
		this.placa = placa;
		this.telefone = telefone;
	}

	public Integer getCodigoTransportadora() {
		return codigoTransportadora;
	}

	public void setCodigoTransportadora(Integer codigoTransportadora) {
		this.codigoTransportadora = codigoTransportadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
	

