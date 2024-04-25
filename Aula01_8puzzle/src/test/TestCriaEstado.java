package test;

import entity.Estado;
import entity.Tabuleiro;

public class TestCriaEstado {
	
	public static void main(String[] args) {
		Tabuleiro t = new Tabuleiro(
				 new int[][]{
					 {8,1,3},
					 {0,2,4},
					 {7,6,5}
					 }
				);
		Estado e = new Estado(t);
		
		System.out.println(e);
	}

}
