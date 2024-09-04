package Aula13;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado: ");
		double lado = sc.nextDouble();
		
		//area = lado * lado
		double area = Math.pow (lado, 2);
		
		System.out.println("A área do quadrado e: "+area);
		System.out.println("O dobro da area área do quadrado e: "+ (area * 2));
	}

}
