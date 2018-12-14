package br.com.db1.calculadoraapi.model;

public enum Operacao {

	SOMA {
		@Override
		public double execute(double numeroUm, double numeroDois) {
			return numeroUm + numeroDois;
		}
	},
	SUBTRACAO {
		@Override
		public double execute(double numeroUm, double numeroDois) {
			return numeroUm - numeroDois;
		}
	},
	DIVISAO {
		@Override
		public double execute(double numeroUm, double numeroDois) {
			return numeroUm / numeroDois;
		}
	},
	MULTIPLICACAO {
		@Override
		public double execute(double numeroUm, double numeroDois) {
			return numeroUm * numeroDois;
		}
	};

	public abstract double execute(double numeroUm, double numeroDois);
}
