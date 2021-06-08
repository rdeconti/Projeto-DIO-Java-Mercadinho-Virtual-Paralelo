package com.rdeconti.mercadinhoVirtual.services;

import com.rdeconti.mercadinhoVirtual.models.Estoque;
import com.rdeconti.mercadinhoVirtual.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public Iterable<Estoque> findAll(){
        return estoqueRepository.findAll( );
    }
    
    public Estoque findByCodigoProduto(Integer codigoProduto) {
        Estoque estoque = findByCodigoProduto( codigoProduto );
    	return estoqueRepository.findByCodigoProduto( estoque );
    }

    public void inserir(Estoque estoque){
    	estoqueRepository.save( estoque );
        System.out.println("INSERIDO: " + estoque);
    }

    public void alterar(Estoque estoque){
    	estoqueRepository.save( estoque );
        System.out.println("ALTERADO: " + estoque);
    }    

    public void excluir(Integer codigoProduto){
    	Estoque estoque = findByCodigoProduto( codigoProduto );
    	estoqueRepository.delete( estoque );
        System.out.println("EXCLUIDO: " + estoque);
    } 
}
