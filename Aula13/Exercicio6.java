package Aula13;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o do raio do círculo");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: "+area );

	}

}
