package dip.problema;

public class NotaFiscal {

	private double valor;
	private double valrComImposto;

	public NotaFiscal(double valor, double valorComImposto) {
		this.valor = valor;
		this.valrComImposto = valorComImposto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValrComImposto() {
		return valrComImposto;
	}

	public void setValrComImposto(double valrComImposto) {
		this.valrComImposto = valrComImposto;
	}

}
