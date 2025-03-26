package Aula15;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro preço:");
		double preco1 = sc.nextDouble();
		
		System.out.println("Entre com o segundo preço:");
		double preco2 = sc.nextDouble();
		
		System.out.println("Entre com o terceiro preço:");
		double preco3 = sc.nextDouble();
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("compre o produto 1");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("compre o produto 2");
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("compre o produto 3");
		}

	}

	}


