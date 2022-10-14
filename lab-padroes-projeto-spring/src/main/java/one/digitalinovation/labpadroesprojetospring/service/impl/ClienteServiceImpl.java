package one.digitalinovation.labpadroesprojetospring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinovation.labpadroesprojetospring.model.Cliente;
import one.digitalinovation.labpadroesprojetospring.model.ClienteRepository;
import one.digitalinovation.labpadroesprojetospring.model.Endereco;
import one.digitalinovation.labpadroesprojetospring.model.EnderecoRepository;
import one.digitalinovation.labpadroesprojetospring.service.ClienteService;
import one.digitalinovation.labpadroesprojetospring.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	//Singleton: Injetar os componentes do Spring com @Autowired
	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ViaCepService viaCepSerice;

	// Strategy: Implementar os métodos definidos na interface.
	//Facade: Abstrair integrações com subsistemas, provendo uma interface
	// simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscaPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if (cliente.isPresent()) {
			return cliente.get();
		} else {
			return null;
		}
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);

	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
           salvarClienteComCep(cliente);
		}

	}

	@Override
	public void deletar(Long id) {
		
		clienteRepository.deleteById(id);

	}
	
	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepSerice.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});

		cliente.setEndereco(endereco);

		clienteRepository.save(cliente);
	}

}
