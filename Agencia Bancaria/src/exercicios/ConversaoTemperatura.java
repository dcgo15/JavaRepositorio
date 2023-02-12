package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {
	
	public static void main(String[] args) {
		//variaveis
		double c,f;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada
		System.out.println("Conversão de temperatura");
		System.out.print("Digite a temperatura em fahrenheint: ");
		f = teclado.nextDouble();
		//processamento
		c = (5 * (f - 32)) / 9;
		//saida
		System.out.println("Temperatura em celsius: " + 
formatador.format(c) + "C");
		teclado.close();
		
	}
}
