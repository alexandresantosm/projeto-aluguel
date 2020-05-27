package br.com.flf.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.flf.aluguel.model.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

}
