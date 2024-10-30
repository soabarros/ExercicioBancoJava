package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	private double saldoInvestimentos;
	
	public ContaCorrente(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta);
	}

	public double getSaldoInvestimentos() {
		return saldoInvestimentos;
	}

	public void setSaldoInvestimentos(double saldoInvestimentos) {
		this.saldoInvestimentos = saldoInvestimentos;
	}
}
