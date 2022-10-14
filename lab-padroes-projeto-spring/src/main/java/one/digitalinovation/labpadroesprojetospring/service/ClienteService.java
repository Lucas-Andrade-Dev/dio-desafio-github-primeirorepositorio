package one.digitalinovation.labpadroesprojetospring.service;

import one.digitalinovation.labpadroesprojetospring.model.Cliente;

/**
 * Interface que define  o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma 
 * Interface.
 * 
 * @author lucas
 *
 */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscaPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
	
}
