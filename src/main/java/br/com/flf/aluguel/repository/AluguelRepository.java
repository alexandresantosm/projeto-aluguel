package br.com.flf.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flf.aluguel.model.Aluguel;

public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

}
