package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// VARIAVEIS
		double total, desconto, totalDesconto, valorPago, troco;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada1
		System.out.println("PDV");
		System.out.print("Valor total: ");
		total = teclado.nextDouble();
		System.out.println("Desconto total: ");
		desconto = teclado.nextDouble();
		//processamento
		totalDesconto= total - (desconto * total) / 100;
		//saida1
		System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto));
		//entrada2
		System.out.println("________________________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		//processamento2
		troco = valorPago - totalDesconto;
		System.out.println("Troco: R$" + formatador.format(troco));
		teclado.close();

	}

}
