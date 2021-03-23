package dip.solucao;

import java.util.List;

public class GeradorDeNotaFiscal {

	List<AcaoAposGerarNota> acoes;
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}
	
	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();
		NotaFiscal notaFiscal = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		acoes.forEach(acao -> acao.executa(notaFiscal));
		
		return notaFiscal;
	}
	
	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
