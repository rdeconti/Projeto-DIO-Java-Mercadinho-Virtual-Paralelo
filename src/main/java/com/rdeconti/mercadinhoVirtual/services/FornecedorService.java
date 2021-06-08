package com.rdeconti.mercadinhoVirtual.services;

import com.rdeconti.mercadinhoVirtual.models.Fornecedor;
import com.rdeconti.mercadinhoVirtual.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Iterable<Fornecedor> findAll(){
        return fornecedorRepository.findAll( );
    }
    
    public Fornecedor findByCodigoFornecedor(Integer codigoFornecedor) {
        Fornecedor fornecedor = findByCodigoFornecedor( codigoFornecedor );
    	return fornecedorRepository.findByCodigoFornecedor( fornecedor );
    }

    public void inserir(Fornecedor fornecedor){
    	fornecedorRepository.save( fornecedor );
        System.out.println("INSERIDO: " + fornecedor);
    }

    public void alterar(Fornecedor fornecedor){
    	fornecedorRepository.save( fornecedor );
        System.out.println("ALTERADO: " + fornecedor);
    }    

    public void excluir(Integer codigoFornecedor){
    	Fornecedor fornecedor = findByCodigoFornecedor( codigoFornecedor );
    	fornecedorRepository.delete( fornecedor );
        System.out.println("EXCLUIDO: " + fornecedor);
    } 
}
