package br.com.fiap.banco;

public class Conta {
	private int numeroConta;
	private double saldo;
	private Cliente cliente;

	// constructor ctrl + 3 (generate constructor)

	// metodos ctrl + 3 (getters and setters)

	public Conta(String nomeCliente, int numeroConta, double saldo, Cliente cliente) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.setCliente(cliente);
	}

	public Conta(int numeroConta, double saldo, Cliente cliente) {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(Conta contaDestino, double valor) {
		if (this.sacar(valor)) {
			contaDestino.depositar(valor);
		}
	}

	public void consultarSaldo() {
		System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);
	}

	public void exibirSaldo() {
		System.out.println("Numero do cliente: " + numeroConta);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("----------------");
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
