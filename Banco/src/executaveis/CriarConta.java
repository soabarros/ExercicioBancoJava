package executaveis;

import br.com.fiap.banco.Cliente;
import br.com.fiap.banco.ContaPoupanca;
import br.com.fiap.banco.*;
public class CriarConta {

	public static void main(String[] args) {

		CDB cdb = new CDB ();
		LCA lca = new LCA ();
		LCI lci = new LCI();
		
		
		
		Cliente cliente1 = new Cliente("Eduardo Sousa", "edua@gmail.com", "133.365.453/32", "(12) 99831-9649", 1002,
				10000.00, "10/10/2003");
		
		ContaPoupanca cliente11 = new ContaPoupanca(cliente1, 120 );
		cliente11.depositar(10000);
		cliente11.consultarSaldo();
		cliente11.investimentocorrente("CDB", 200000000);
		cliente11.exibirSaldo();

	}
}
