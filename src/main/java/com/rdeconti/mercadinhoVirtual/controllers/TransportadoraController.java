package com.rdeconti.mercadinhoVirtual.controllers;

import com.rdeconti.mercadinhoVirtual.models.Transportadora;
import com.rdeconti.mercadinhoVirtual.services.TransportadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transportadora")
public class TransportadoraController {
    
	@Autowired
    private TransportadoraService transportadoraService;
	
    @GetMapping
    public Iterable<Transportadora> listar(){
        return transportadoraService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Transportadora transportadora){
        transportadoraService.inserir(transportadora);
    }
    
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Transportadora transportadora){
        transportadoraService.alterar(transportadora);
    }

    @DeleteMapping
    @RequestMapping("{codigoTransportadora}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Integer codigoTransportadora){
        transportadoraService.excluir(codigoTransportadora);
    }
}
