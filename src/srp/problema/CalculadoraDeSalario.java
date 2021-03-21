package srp.problema;

import static srp.problema.Cargo.DBA;
import static srp.problema.Cargo.DESENVOLVEDOR;

public class CalculadoraDeSalario {
	
	/* PROBLEMAS: PARA CADA NOVO CARGO, UMA NOVA VERIFICAÇÃO 
	SERÁ ADICIONADA. A CLASSE NÃO PARA DE CRESCER */
	
	public double calcula(Funcionario funcionario) {
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorCento(funcionario);
		}
		
		if (DBA.equals(funcionario.getCargo())) {
			return quizeOuVinteCincoPorCento(funcionario);
		}
		
		throw new RuntimeException("Funcionário inválido");
	}

	private double dezOuVintePorCento(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000.0) {
			return funcionario.getSalario() * 0.8;
		} else {
			return funcionario.getSalario() * 0.9;
		}
	}
	
	private double quizeOuVinteCincoPorCento(Funcionario funcionario) {
		if (funcionario.getSalario() > 2000.0) {
			return funcionario.getSalario() * 0.75;
		} else {
			return funcionario.getSalario() * 0.85;
		}
	}

}
