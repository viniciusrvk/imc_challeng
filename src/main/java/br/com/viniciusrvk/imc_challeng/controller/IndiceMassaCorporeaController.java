package br.com.viniciusrvk.imc_challeng.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniciusrvk.imc_challeng.domain.Medidas;


@Controller
@RestController
public class IndiceMassaCorporeaController {

	@PostMapping(value = "/indice_massa_corporea")
	public ResponseEntity<Medidas> calcularIMC(
			@RequestParam(value = "peso", required = true) String peso,
			@RequestParam(value = "altura", required = true) String altura) {
		final var medidas = new Medidas(new BigDecimal(altura), new BigDecimal(peso));
		return new ResponseEntity<>(medidas, HttpStatus.OK);
	}
}
