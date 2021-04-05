package lsp.problema;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {
	
	public static void main(String[] args) {
		
		ContaComum c1 = new ContaComum();
		c1.deposita(50);
		ContaDeEstudante c2 = new ContaDeEstudante();
		c2.deposita(20);
		List<ContaComum> contasDoBanco = Arrays.asList(c1,c2);
		
		for (ContaComum conta : contasDoBanco) {
			conta.rende();
			
			System.out.println("Novo saldo: " + conta.getSaldo());
			
		}
	}

}
