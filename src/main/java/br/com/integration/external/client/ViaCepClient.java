package br.com.integration.external.client;

import br.com.integration.external.dto.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name = "viaCepClient", url = "viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping ("/{cep}/json")
    ResponseDTO returnCepInformation (@PathVariable ("cep")String cep);
}
