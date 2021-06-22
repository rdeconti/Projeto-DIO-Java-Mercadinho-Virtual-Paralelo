package com.rdeconti.mercadinhoVirtual.services;

import com.rdeconti.mercadinhoVirtual.models.Produto;
import com.rdeconti.mercadinhoVirtual.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Iterable<Produto> findAll(){
        return produtoRepository.findAll( );
    }
    
    public Produto findByCodigoProduto(Integer codigoProduto) {
        Produto produto = findByCodigoProduto( codigoProduto );
    	return produtoRepository.findByCodigoProduto( produto );
    }

    public void inserir(Produto produto){
    	produtoRepository.save( produto );
        System.out.println("INSERIDO: " + produto);
    }

    public void alterar(Produto produto){
    	produtoRepository.save( produto );
        System.out.println("ALTERADO: " + produto);
    }    

    public void excluir(Integer codigoProduto){
    	Produto produto = findByCodigoProduto( codigoProduto );
    	produtoRepository.delete( produto );
        System.out.println("EXCLUIDO: " + produto);
    } 
}
