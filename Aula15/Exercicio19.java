package Aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número");
		int num2 = sc.nextInt();
		
		System.out.println("Entre com a operação (+ - / *): ");
		String operacao = sc.next();
		
		double resultado = 0;
		boolean valida = true;
		
		
		switch(operacao ){
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
			default: 
			System.out.println("Operação invalida"); 
			valida = false; break;
		}
		if (valida) {
			
			System.out.println("Resultado: " +resultado);
			
			if (resultado >= 0) {
				System.out.println("Resultado Positivo");
			} else {
				System.out.println("Resultado Negativo");
			}
			if (resultado % 2 == 0) {
				System.out.println("Resultado par");
			} else {
				System.out.println("Resultado impar");
			}
		}
		
	}

}
