package br.com.db1.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculo")
public class Calculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Operacao operacao;

	@Column(nullable = false)
	private double numeroUm;

	@Column(nullable = false)
	private double numeroDois;

	@Column(nullable = false)
	private double resultado;

	private LocalDateTime data;

	public Calculo(Operacao operacao, double numeroUm, double numeroDois) {
		this.operacao = operacao;
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
		this.resultado = this.operacao.execute(this.numeroUm, this.numeroDois);
		this.data = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public double getNumeroUm() {
		return numeroUm;
	}

	public double getNumeroDois() {
		return numeroDois;
	}

	public double getResultado() {
		return resultado;
	}

	public LocalDateTime getData() {
		return data;
	}

	protected Calculo() {
	}

}
