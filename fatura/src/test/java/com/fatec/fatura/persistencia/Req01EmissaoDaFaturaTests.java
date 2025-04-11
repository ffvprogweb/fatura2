package com.fatec.fatura.persistencia;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.fatec.fatura.model.Fatura;

class Req01EmissaoDaFaturaTests {

	Fatura fatura = new Fatura();
	Logger logger = LogManager.getLogger(this.getClass());
	@Test
	void ct01_quando_dados_validos_fatura_nao_eh_nulo() {
		try {
			// dado que as informacoes de fatura sao validas
			// quando confirmo a fatura
			fatura = new Fatura("1", "71112917000126", "02/10/2026", "moveis planejados", "1000.50");
			// entao fatura é registrada com data de emisssao igual a data de hoje
			assertNotNull(fatura);
			//String dataDeHoje = agendamento.obtemDataAtual();
			//assertEquals(dataDeHoje, fatura.getDataEmissao());
		} catch (Exception e) {
			logger.info(">>>>>> ct01 - nao deveria falhar => " + e.getMessage());
			fail("nao deveria falhar fatura valida");

		}
	}

}
