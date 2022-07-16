package br.com.gabs.cm;

import br.com.gabs.cm.modelo.Tabuleiro;
import br.com.gabs.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro); 
		
	}
}
