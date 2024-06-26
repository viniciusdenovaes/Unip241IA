package solver;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import entity.Estado;
import estruturas.EstadosAbertos;

public class BuscaEspaco {
	
	 Estado inicial;
	 EstadosAbertos estadosAbertos;
	 
	 
	 public BuscaEspaco(Estado aInicial, EstadosAbertos ea) {
		 this.inicial = aInicial;
		 this.estadosAbertos = ea;
		 estadosAbertos.push(this.inicial);
		 
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
//			 estadosFechados.add(e);
			 Collection<Estado> filhos = e.geraFilhos();
			 for(Estado filho: filhos) {
//				 if(!estadosFechados.contains(filho))
					 estadosAbertos.push(filho);
			 }
		 }
		 
		 System.out.println("nao encontrou solucao");
		 
		 return null;
		 
	 }

}
