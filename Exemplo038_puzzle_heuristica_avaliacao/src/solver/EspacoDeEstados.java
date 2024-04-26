package solver;

import java.util.Collection;

import entity.Tabuleiro;
import entity.estruturas.EstadoAbertos;
import entity.estruturas.Fila;
import solver.heuristica_avaliacao.HeuristicaAvaliacaoPecasForaLugar;

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
	 EstadoAbertos ea;
	 
	 public EspacoDeEstados(Estado aInicial, EstadoAbertos aEstruturaAbertos) {
		 this.inicial = aInicial;
		 this.ea = aEstruturaAbertos;
		 ea.push(this.inicial);
		 
	}
	 
	 public Estado solve() {
		 
		 int iteracoes = 0;
		 
		 while(ea.size()>0) {
			 Estado e = ea.pop();
			 System.out.println("TESTANDO ESTADO");
			 System.out.println("NOTA PECAS FORA: " + new HeuristicaAvaliacaoPecasForaLugar().avaliaEstado(e));
			 System.out.println("ITERACOES: " + iteracoes++);
			 System.out.println(e);
			 if(e.isObjetivo()) {
				 System.out.println("-------------ENCONTROU SOLUCAO----------");
				 System.out.println(e);
				 return e;
			 }
			 Collection<Estado> filhos = e.geraFilhos();
			 for(Estado filho: filhos) {
				 ea.push(filho);
			 }
		 }
		 
		 System.out.println("nao encontrou solucao");
		 
		 return null;
	 }

}
