package com.rdeconti.mercadinhoVirtual.controllers;

import com.rdeconti.mercadinhoVirtual.models.Produto;
import com.rdeconti.mercadinhoVirtual.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {
    
	@Autowired
    private ProdutoService produtoService;
	
    @GetMapping
    public Iterable<Produto> listar(){
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Produto produto){
        produtoService.inserir(produto);
    }
    
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Produto produto){
        produtoService.alterar(produto);
    }

    @DeleteMapping
    @RequestMapping("{codigoProduto}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Integer codigoProduto){
        produtoService.excluir(codigoProduto);
    }
}
