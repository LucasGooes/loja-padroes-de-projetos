package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.http.JavaHttpClient;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		orcamento.aprovar();
		orcamento.finalizar();
		// A IDEIA � SE VOC� QUISER UTILIZAR OUTRA IMPLEMENTA��O, APENAS SE DEVE MUDAR A INST�NCIA ENVIADA COMO PARAMETRO
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
