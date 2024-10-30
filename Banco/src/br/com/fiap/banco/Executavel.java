package br.com.fiap.banco;

public class Executavel {
	public static void main(String[] args) {

		Conta conta1 = new Conta("Eros Machado", 1001, 1000.00, null, "01/01/1990", "12/11/2009");
		Conta conta2 = new Conta("João Silva", 1002, 2000.00, null, "10/02/2000", "12/12/2001");
		Conta conta3 = new Conta("Maria Oliveira", 1003, 3000.00, null, "13/10/2000", "12/09/1997");


		//testes de conta
		conta1.consultarSaldo();
		conta1.sacar(300.00);
		conta1.consultarSaldo();

		conta2.depositar(500.00);
		conta2.consultarSaldo();

		conta3.transferir(conta1, 1000.00);
		conta1.consultarSaldo();
		conta3.consultarSaldo();

		conta1.setSaldo(100000000);
		
		conta3.exibirSaldo();

	}
}
