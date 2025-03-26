package Aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("o primeiro numero e maior");
		}else {
			System.out.println("o segundo numero e maior");
		}
	}

}
