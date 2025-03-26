package Aula15;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double nota1 = sc.nextDouble();
		
		System.out.println("entre com a segunda nota");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2 ) / 2;
		
		if (media == 10){
			System.out.println("aprovado com distinção");
		} else if (media >= 7) {
			System.out.println("aprovado");
		}else {
			System.out.println("reprovado");
		}

	}

}
