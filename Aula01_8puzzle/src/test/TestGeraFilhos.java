package test;

import java.util.Collection;

import entity.Estado;
import entity.Tabuleiro;

public class TestGeraFilhos {
	
	public static void main(String[] args) {
		Tabuleiro t = new Tabuleiro(
				 new int[][]{
					 {8,1,3},
					 {0,2,4},
					 {7,6,5}
					 }
				);
		Estado e = new Estado(t);
		
		Collection<Estado> filhos = e.geraFilhos();
		
		System.out.println("pai");
		System.out.println(e);
		
		System.out.println("filhos:");
		for(var f : filhos) {
			System.out.println(f);
		}

	}

}
