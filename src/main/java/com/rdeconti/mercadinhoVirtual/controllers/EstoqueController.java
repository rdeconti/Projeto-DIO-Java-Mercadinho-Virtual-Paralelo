package com.rdeconti.mercadinhoVirtual.controllers;

import com.rdeconti.mercadinhoVirtual.models.Estoque;
import com.rdeconti.mercadinhoVirtual.services.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/estoque")
public class EstoqueController {
    
	@Autowired
    private EstoqueService estoqueService;
	
    @GetMapping
    public Iterable<Estoque> listar(){
        return estoqueService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Estoque estoque){
        estoqueService.inserir(estoque);
    }
    
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Estoque estoque){
        estoqueService.alterar(estoque);
    }

    @DeleteMapping
    @RequestMapping("{codigoProduto}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Integer codigoProduto){
        estoqueService.excluir(codigoProduto);
    }
}
