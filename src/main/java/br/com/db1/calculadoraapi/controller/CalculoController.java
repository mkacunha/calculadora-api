package br.com.db1.calculadoraapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadoraapi.dto.CalculoDTO;
import br.com.db1.calculadoraapi.model.Calculo;
import br.com.db1.calculadoraapi.model.Operacao;
import br.com.db1.calculadoraapi.service.CalculoService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/calculos")
public class CalculoController {

	@Autowired
	private CalculoService calculoService;

	@PostMapping
	public Calculo post(@RequestBody CalculoDTO calculo) {
		return calculoService
				.salvarNovoCalculo(
						calculo.getOperacao(), 
						calculo.getNumeroUm(), 
						calculo.getNumeroDois());
	}
	
	@GetMapping
	public List<Calculo> todosCalculos(){
		return calculoService.buscarTodosCalculos();
	}

}
