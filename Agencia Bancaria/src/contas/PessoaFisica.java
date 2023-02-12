package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Daniel Gomes");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println("--------------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Dan Gomes");
		cc2.setSaldo(2000);
		System.out.println("Cliente: " + cc2.getCliente());
		
		cc2.exibirSaldo();
		cc2.deposito(500);
		cc2.exibirSaldo();
		System.out.println("--------------------------");
		System.out.println("Transferência");
		System.out.println("Cliente: " + cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente:" + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente:" + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("--------------------------");
		System.out.println("Relato Gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas"+ relatorio);
		
	}

}
