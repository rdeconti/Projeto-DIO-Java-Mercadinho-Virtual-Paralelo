package com.rdeconti.mercadinhoVirtual.services;

import com.rdeconti.mercadinhoVirtual.models.Transportadora;
import com.rdeconti.mercadinhoVirtual.repository.TransportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportadoraService {

    @Autowired
    private TransportadoraRepository transportadoraRepository;

    public Iterable<Transportadora> findAll(){
        return transportadoraRepository.findAll( );
    }
    
    public Transportadora findByCodigoTransportadora(Integer codigoTransportadora) {
        Transportadora transportadora = findByCodigoTransportadora( codigoTransportadora );
    	return transportadoraRepository.findByCodigoTransportadora( transportadora );
    }

    public void inserir(Transportadora transportadora){
    	transportadoraRepository.save( transportadora );
        System.out.println("INSERIDO: " + transportadora);
    }

    public void alterar(Transportadora transportadora){
    	transportadoraRepository.save( transportadora );
        System.out.println("ALTERADO: " + transportadora);
    }    

    public void excluir(Integer codigoTransportadora){
    	Transportadora transportadora = findByCodigoTransportadora( codigoTransportadora );
    	transportadoraRepository.delete( transportadora );
        System.out.println("EXCLUIDO: " + transportadora);
    } 
}
