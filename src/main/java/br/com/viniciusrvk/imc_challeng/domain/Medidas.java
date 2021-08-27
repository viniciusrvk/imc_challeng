package br.com.viniciusrvk.imc_challeng.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Medidas implements Serializable{


	private static final long serialVersionUID = -8418551512577395765L;

	private final BigDecimal altura;
	private final BigDecimal peso;

	public Medidas(BigDecimal altura, BigDecimal peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public BigDecimal getIndiceMassaCorporea() {
		return this.peso.divide(this.altura.pow(2), 2, RoundingMode.CEILING);
	}
}
