package com.rdeconti.mercadinhoVirtual.repository;

import com.rdeconti.mercadinhoVirtual.models.Fornecedor;
import org.springframework.data.repository.CrudRepository;

public interface FornecedorRepository extends CrudRepository<Fornecedor, String>
{
	public Fornecedor findByCodigoFornecedor(Fornecedor codigoFornecedor);
}
