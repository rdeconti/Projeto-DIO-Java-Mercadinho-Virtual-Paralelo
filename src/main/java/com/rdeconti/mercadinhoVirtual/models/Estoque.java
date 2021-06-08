package com.rdeconti.mercadinhoVirtual.models;

import javax.persistence.*;

@Entity
public class Estoque {

	@Id
	private Integer codigoProduto;
	private String nomeProduto;
	private String descricao;
	private Double valorUnitario;
	private Double valorTotal;
	private Integer quantidade;

	public Estoque(Integer codigoProduto, String nomeProduto, String descricao, Double valorUnitario, Double valorTotal, Integer quantidade) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
	}

	public Estoque(String nomeProduto, String descricao, Double valorUnitario, Double valorTotal, Integer quantidade) {
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
	}

	public Integer getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
	

