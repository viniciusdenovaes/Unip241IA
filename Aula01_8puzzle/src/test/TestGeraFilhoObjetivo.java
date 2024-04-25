package test;

import java.util.Collection;

import entity.Estado;
import entity.Tabuleiro;

public class TestGeraFilhoObjetivo {
	
	public static void main(String[] args) {
		Tabuleiro t = new Tabuleiro(
				 new int[][]{
					 {1,0,3},
					 {8,2,4},
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
			System.out.println("eh objetivo? "+f.isObjetivo());
		}

	}

}
