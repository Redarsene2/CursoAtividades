package Aula13;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o primeiro número ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número ");
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		System.out.println("O resultado foi: "+result);
	}

}
