package br.com.viniciusrvk.imc_challeng.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MedidasTest {

	@Test
	public void deveRetornarIMCCorretamente() {
		final String altura = "1.71";
		final String peso = "70.15";
		final BigDecimal esperado = new BigDecimal("24.00");
		final Medidas medidas = new Medidas(new BigDecimal(altura), new BigDecimal(peso));
		assertThat(medidas.getIndiceMassaCorporea()).isEqualTo(esperado);
	}

	@Test(expected = Exception.class)
	public void deveLancarException() {
		final String altura = "1,71";
		final String peso = "70.15";
		final Medidas medidas = new Medidas(new BigDecimal(altura), new BigDecimal(peso));
		medidas.getIndiceMassaCorporea();
	}

}
