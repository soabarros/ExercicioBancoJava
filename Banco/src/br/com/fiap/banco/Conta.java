package br.com.fiap.banco;

public class Conta {
	String nomeCliente;
	String cpfCliente;
	int numeroConta;
	double saldo;

	public Conta(String nomeCliente, String cpfCliente, int numeroConta, double saldoInicial) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldoInicial;
	}

	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente ou valor inválido.");
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor de depósito inválido.");
		}
	}

	public void transferir(Conta contaDestino, double valor) {
		if (valor > 0 && saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta "
					+ contaDestino.getNumeroConta());
		} else {
			System.out.println("Transferência falhou. Verifique o saldo ou o valor.");
		}
	}

	public void consultarSaldo() {
		System.out.println("Saldo atual da conta " + numeroConta + ": R$" + saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
