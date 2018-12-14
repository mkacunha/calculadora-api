package br.com.db1.calculadoraapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.calculadoraapi.model.Calculo;
import br.com.db1.calculadoraapi.model.Operacao;
import br.com.db1.calculadoraapi.repository.CalculoRepository;

@Service
public class CalculoService {

	@Autowired
	private CalculoRepository calculoRepository;
	
	public Calculo salvarNovoCalculo(Operacao operacao, double numeroUm, double numeroDois) {
		return calculoRepository.save(new Calculo(operacao, numeroUm, numeroDois));
	}
	
	public List<Calculo> buscarTodosCalculos() {
		return calculoRepository.findAll();
	}
}
