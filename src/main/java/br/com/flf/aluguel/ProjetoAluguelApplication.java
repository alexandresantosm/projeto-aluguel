package br.com.flf.aluguel;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.flf.aluguel.model.Aluguel;
import br.com.flf.aluguel.model.Cliente;
import br.com.flf.aluguel.repository.AluguelRepository;
import br.com.flf.aluguel.repository.ClienteRepository;

@SpringBootApplication
public class ProjetoAluguelApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private AluguelRepository aluguelRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoAluguelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente c1 = new Cliente(null, "Alexandre", "000.000.000-00", "Rua A", "000000000");
		Cliente c2 = new Cliente(null, "Joaquim", "111.111.000-00", "Rua B", "111000000");
		Cliente c3 = new Cliente(null, "Dadá", "222.222.000-00", "Rua C", "222000000");
		
		Aluguel a1 = new Aluguel(null, new Date(), c1);
		Aluguel a2 = new Aluguel(null, new Date(), c2);
		Aluguel a3 = new Aluguel(null, new Date(), c3);
		Aluguel a4 = new Aluguel(null, new Date(), c2);
		Aluguel a5 = new Aluguel(null, new Date(), c1);
		
		c1.getAlugueis().addAll(Arrays.asList(a1,a5));
		c2.getAlugueis().addAll(Arrays.asList(a2,a4));
		c1.getAlugueis().add(a3);
		
		clienteRepository.saveAll(Arrays.asList(c1,c2,c3));
		aluguelRepository.saveAll(Arrays.asList(a1,a2,a3,a4,a5));
	}

}
