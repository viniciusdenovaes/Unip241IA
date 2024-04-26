package solver;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import entity.Tabuleiro;
import entity.estruturas.EstadoAbertos;
import entity.estruturas.Fila;

public class EspacoDeEstados {
	
	 public static final Estado OBJETIVO = new Estado(
			 new Tabuleiro(
					 new int[][]{
						 {1,2,3},
						 {8,0,4},
						 {7,6,5}
						 }
					 ));
	 
	 Estado inicial;
	 EstadoAbertos estadosAbertos;
	 Set<Estado> estadosFechados;
	 
	 
	 public EspacoDeEstados(Estado aInicial, EstadoAbertos aEstruturaAbertos) {
		 this.inicial = aInicial;
		 this.estadosAbertos = aEstruturaAbertos;
		 estadosAbertos.push(this.inicial);
		 estadosFechados = new HashSet<>();
		 
	}
	 
	 public Estado solve() {
		 
		 while(estadosAbertos.size()>0) {
			 Estado e = estadosAbertos.pop();
			 System.out.println("TESTANDO ESTADO");
			 System.out.println(e);
			 if(e.isObjetivo()) {
				 System.out.println("-------------ENCONTROU SOLUCAO----------");
				 System.out.println(e);
				 return e;
			 }
			 estadosFechados.add(e);
			 Collection<Estado> filhos = e.geraFilhos();
			 for(Estado filho: filhos) {
				 if(!estadosFechados.contains(filho))
					 estadosAbertos.push(filho);
			 }
		 }
		 
		 System.out.println("nao encontrou solucao");
		 
		 return null;
	 }

}
