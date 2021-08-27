package br.com.viniciusrvk.imc_challeng.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.viniciusrvk.imc_challeng.domain.Medidas;

@RunWith(SpringRunner.class)
public class IndiceMassaCorporeaControllerTest {

	@InjectMocks
	private IndiceMassaCorporeaController controller;

	@Test
	public void deveRetornarIndiceMassaCorporeaDe24() {
		final String altura = "1.71";
		final String peso = "70.15";
		final BigDecimal esperado = new BigDecimal("24.00");
		final Medidas medidas = new Medidas(new BigDecimal(altura), new BigDecimal(peso));

		final var response = controller.calcularIMC(peso, altura);

		final Medidas atual = response.getBody();

		assertThat(atual.getIndiceMassaCorporea()).isNotNull()
		.isEqualTo(esperado);
		assertThat(atual.getAltura()).isNotNull()
		.isEqualTo(medidas.getAltura());
		assertThat(atual.getPeso()).isNotNull()
		.isEqualTo(medidas.getPeso());
	}


}
