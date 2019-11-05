package br.ce.wcaquino.servicos;

import java.util.List;

import br.ce.wcaquino.entidades.Filme;

public class LocacaoServiceHelper {

	public Double getValorTotal(List<Filme> filmes) {
		
		Double valorTotal = 0.0;
		
		for(int i = 0; i < filmes.size(); i++) {
			valorTotal += filmes.get(i).getPrecoLocacao();
		}
		return valorTotal;
	}
	
	public boolean isLivrosPossuemEstoque(List<Filme> filmes) {
		
		boolean possuemEstoque = true;
		
		for(int i = 0; i < filmes.size(); i++) {
			if(filmes.get(i).getEstoque() <= 0 || filmes.get(i).getEstoque() == null) {
				possuemEstoque = false;
			}
		}
		return possuemEstoque;
	}
	
}
