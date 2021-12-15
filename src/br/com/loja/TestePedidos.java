package br.com.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.acao.EnviarEmailPedido;
import br.com.loja.pedido.acao.LogDePedido;
import br.com.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {
	
	public static void main(String[] args) {
		String cliente = "Rodrigo";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), 
																		new EnviarEmailPedido(),
																		new LogDePedido()));
		handler.execute(gerador);
	}

}
