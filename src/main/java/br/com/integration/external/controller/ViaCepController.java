package br.com.integration.external.controller;

import br.com.integration.external.client.ViaCepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class ViaCepController {

    @Autowired
    private ViaCepClient viaCepClient;

    @GetMapping ("/{cep}/json")
    public ResponseEntity getCepInformation (@PathVariable("cep") String cep) {
        return ResponseEntity.ok(viaCepClient.returnCepInformation(cep));
    }
}
