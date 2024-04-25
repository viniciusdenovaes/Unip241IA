package test;

import java.util.Collection;

import entity.Estado;
import entity.Tabuleiro;
import solver.BuscaEspaco;

public class TesteBusca {
	public static void main(String[] args) {
		Tabuleiro t = new Tabuleiro(
				 new int[][]{
					 {1,0,3},
					 {8,2,4},
					 {7,6,5}
					 }
				);
		Estado e = new Estado(t);
		
		BuscaEspaco be = new BuscaEspaco(e);
		
		be.solve();
		

	}


}
