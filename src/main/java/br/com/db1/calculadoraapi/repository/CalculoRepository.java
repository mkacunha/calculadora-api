package br.com.db1.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.calculadoraapi.model.Calculo;

public interface CalculoRepository extends JpaRepository<Calculo, Long> {

}
