package br.com.loja.pedido;

import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	//construtor com injeção de dependencias: repository, service, etc.
	
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		System.out.println("Salvar peido no Banco de Dados");
		System.out.println("Enviar email com dados do novo pedido");
	}
	
}
