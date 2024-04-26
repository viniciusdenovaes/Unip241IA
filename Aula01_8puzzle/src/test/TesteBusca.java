package test;

import java.util.Collection;

import entity.Estado;
import entity.Tabuleiro;
import estruturas.Fila;
import estruturas.Pilha;
import solver.BuscaEspaco;

public class TesteBusca {
	public static void main(String[] args) {
		Tabuleiro t = new Tabuleiro(
				 new int[][]{
					 {0,1,3},
					 {8,2,4},
					 {7,6,5}
					 }
				);
		Estado e = new Estado(t);
		
		BuscaEspaco be = new BuscaEspaco(e, new Fila());
		
		be.solve();
		

	}


}
