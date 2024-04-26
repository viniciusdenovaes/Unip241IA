package solver.heuristica_avaliacao;

import entity.Tabuleiro;
import solver.EspacoDeEstados;
import solver.Estado;

public class HeuristicaAvaliacao0 implements HeuristicaAvaliacao {

	@Override
	public double avaliaEstado(Estado estado) {
		return 0;
	}

}
