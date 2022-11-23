package br.com.integration.external.controller;

import br.com.integration.external.client.PokemonClient;
import br.com.integration.external.dto.PokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class PokemonController {

    @Autowired
    private PokemonClient client;

    @GetMapping ("/{name}")
    public ResponseEntity<PokemonDTO> getPokemonInformation(@PathVariable("name") String name){
        return ResponseEntity.ok(client.getPokemonInformation(name));
    }
}
