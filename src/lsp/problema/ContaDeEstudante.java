package lsp.problema;

public class ContaDeEstudante extends ContaComum {
	
	@Override
	public void rende() {
		throw new RuntimeException("Conta de estudante não rende");
	}

}
