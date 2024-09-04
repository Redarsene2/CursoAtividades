package Aula13;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o primeiro numero inteiro");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero inteiro");
		int num2 = sc.nextInt();
		System.out.println("Digite o numero real");
		double num3 = sc.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1 " +resultado1);
		System.out.println("Resultado 2 " +resultado2);
		System.out.println("Resultado 3 " +resultado3);
	}
}
