package dip.problema;

public class GeradorDeNotaFiscal {

	private final EnviadorDeEmail email;
	private final NotaFiscalDao dao;
	
	public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDao dao) {
		this.email = email;
		this.dao = dao;
	}
	
	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();
		NotaFiscal notaFiscal = new NotaFiscal(valor, impostoSimplesSobreO(valor));
		
		email.enviarEmail(notaFiscal);
		dao.persiste(notaFiscal);
		
		return notaFiscal;
	}
	
	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
