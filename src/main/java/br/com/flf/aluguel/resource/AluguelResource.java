package br.com.flf.aluguel.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flf.aluguel.model.Aluguel;
import br.com.flf.aluguel.service.AluguelService;

@RestController
@RequestMapping("/alugueis")
public class AluguelResource {

	@Autowired
	private AluguelService aluguelService;

	@GetMapping
	public ResponseEntity<List<Aluguel>> list() {

		List<Aluguel> alugueis = aluguelService.list();

		return ResponseEntity.ok().body(alugueis);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Aluguel> find(@PathVariable Integer id) {

		Aluguel aluguel = aluguelService.find(id);

		return ResponseEntity.ok().body(aluguel);
	}
}
