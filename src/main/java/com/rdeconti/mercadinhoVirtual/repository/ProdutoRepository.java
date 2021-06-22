package com.rdeconti.mercadinhoVirtual.repository;

import com.rdeconti.mercadinhoVirtual.models.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, String>
{
	public Produto findByCodigoProduto(Produto codigoProduto);
}
