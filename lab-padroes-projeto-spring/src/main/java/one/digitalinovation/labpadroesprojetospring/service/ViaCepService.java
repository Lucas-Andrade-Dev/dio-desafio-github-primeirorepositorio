package one.digitalinovation.labpadroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import one.digitalinovation.labpadroesprojetospring.model.Endereco;

/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para o consumo da API do <b>ViaCep</b>
 * 
 * @see <a href="https://spring.io/projects/sping-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCep</a>
 * 
 * @author lucas
 *
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
	 
	//Outra opção para fazer este annotation: @GetMapping("/{cep}/json/")
	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);


	
}
