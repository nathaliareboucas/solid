package srp;

import static srp.Cargo.DESENVOLVEDOR;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario) {
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}
		
		if (Cargo.DBA.equals(funcionario.getCargo())) {
			return quizeOuVinteCincoPorcento(funcionario);
		}
		
		return 0;
	}

	private double dezOuVintePorcento(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000.0) {
			return funcionario.getSalario() * 0.8;
		} else {
			// TODO: aqui
			return funcionario.getSalario() * 0.9;
		}
	}
	
	private double quizeOuVinteCincoPorcento(Funcionario funcionario) {
		if (funcionario.getSalario() > 2000.0) {
			return funcionario.getSalario() * 0.75;
		} else {
			return funcionario.getSalario() * 0.85;
		}
	}

}
