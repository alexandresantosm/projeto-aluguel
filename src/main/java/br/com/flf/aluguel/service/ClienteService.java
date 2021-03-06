package br.com.flf.aluguel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flf.aluguel.model.Cliente;
import br.com.flf.aluguel.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> list() {
		return clienteRepository.findAll();
	}
	
	public Cliente find(Integer id) {
		return clienteRepository.findById(id).get();
	}
}
