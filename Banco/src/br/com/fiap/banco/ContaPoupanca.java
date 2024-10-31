package br.com.fiap.banco;

public class ContaPoupanca extends Conta {

	private double saldoInvestimento;

	public ContaPoupanca(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta);
	}

	// investir
	public void investimentocorrente(String produto, double valor) {
		if (this.sacar(valor)) {

			switch (produto) {
			case "CDB":
				this.saldoInvestimento += valor * (1 + 0.01);
				break;
			case "LCI":
				this.saldoInvestimento += valor * (1 + 0.009);
				break;
			case "LCA":
				this.saldoInvestimento += valor * (1 + 0.008);
				break;
			default:
				System.out.println("Tipo invalido ");
			}
		}

	}

	@Override
	public void exibirSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Numero do cliente: " + numeroConta);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Data de nascimento: "+this.dataNasc);
		System.out.println("Data de abertura conta: "+this.dataAberturaConta);
		System.out.println("Saldo investimento "+ this.saldoInvestimento);
		System.out.println("Saldo total "+ this.saldo);
		System.out.println("----------------");
		
	}

	public double getSaldoInvestimento() {
		return saldoInvestimento;
	}

	public void setSaldoInvestimento(double saldoInvestimento) {
		this.saldoInvestimento = saldoInvestimento;
	}

}
