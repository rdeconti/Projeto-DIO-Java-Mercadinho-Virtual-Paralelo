package com.rdeconti.mercadinhoVirtual.repository;

import com.rdeconti.mercadinhoVirtual.models.Estoque;
import org.springframework.data.repository.CrudRepository;

public interface EstoqueRepository extends CrudRepository<Estoque, String>
{
	public Estoque findByCodigoProduto(Estoque codigoProduto);
}
