package com.rdeconti.mercadinhoVirtual.controllers;

import com.rdeconti.mercadinhoVirtual.models.Fornecedor;
import com.rdeconti.mercadinhoVirtual.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fornecedor")
public class FornecedorController {
    
	@Autowired
    private FornecedorService fornecedorService;
	
    @GetMapping
    public Iterable<Fornecedor> listar(){
        return fornecedorService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Fornecedor fornecedor){
        fornecedorService.inserir(fornecedor);
    }
    
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Fornecedor fornecedor){
        fornecedorService.alterar(fornecedor);
    }

    @DeleteMapping
    @RequestMapping("{codigoFornecedor}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Integer codigoFornecedor){
        fornecedorService.excluir(codigoFornecedor);
    }
}
