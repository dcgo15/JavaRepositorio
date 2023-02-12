package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// VARIAVEIS
		
		double num1, num2, soma;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("=========Calculadora=========");
		System.out.print("Digite a operação(+ , -, *, / ):");
		
		String opera = teclado.next();
		System.out.println(opera);
		
		System.out.print("Digite o numero 1:");
		
		num1 = teclado.nextDouble();
		
		System.out.print("Digite o numero 2:");
		
		num2 = teclado.nextDouble();
		
		soma = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		
		if (opera.equals("+")) {
			System.out.println("Resposta = " + formatador.format(soma));
		} else if (opera.equals("-")) {
			System.out.println("Resposta = " + formatador.format(sub));
		} else if (opera.equals("*")) {
			System.out.println("Resposta = " + formatador.format(mult));
		} else if (opera.equals("/")) {
			System.out.println("Resposta = " + formatador.format(div));
		}
		
		teclado.close();
		
	}

}
