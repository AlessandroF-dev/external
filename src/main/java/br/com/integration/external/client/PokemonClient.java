package br.com.integration.external.client;

import br.com.integration.external.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokemonClient", url = "https://pokeapi.co/api/v2")
public interface PokemonClient {

    @GetMapping ("/pokemon/{name}")
    PokemonDTO getPokemonInformation(@PathVariable("name") String name);
}
