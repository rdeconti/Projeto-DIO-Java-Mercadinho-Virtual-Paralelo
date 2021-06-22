package com.rdeconti.mercadinhoVirtual.repository;

import com.rdeconti.mercadinhoVirtual.models.Transportadora;
import org.springframework.data.repository.CrudRepository;

public interface TransportadoraRepository extends CrudRepository<Transportadora, String>
{
	public Transportadora findByCodigoTransportadora(Transportadora codigoTransportadora);
}
