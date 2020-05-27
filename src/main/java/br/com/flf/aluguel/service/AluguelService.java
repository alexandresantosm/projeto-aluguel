package br.com.flf.aluguel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flf.aluguel.model.Aluguel;
import br.com.flf.aluguel.repository.AluguelRepository;

@Service
public class AluguelService {

	@Autowired
	private AluguelRepository aluguelRepository;

	public List<Aluguel> list() {
		return aluguelRepository.findAll();
	}

	public Aluguel find(Integer id) {
		return aluguelRepository.findById(id).get();
	}
}
