package Aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Entre com o tipo da carne");
		System.out.println("1 - file duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		int tipo = sc.nextInt();
		
		System.out.println("Entre com a quantidade (KG):");
		double qtd = sc.nextDouble();
		
		double precoKG = 0;
		if (tipo == 1) {
			
			System.out.println(qtd + "kg - file duplo");
			
			if (qtd < 5) {
				precoKG = 4.9;
			} else {
				precoKG = 5.8;
			}
		} else if (tipo == 2 ) {
	
			System.out.println(qtd + "kg - alcatra");
			if (qtd < 5) {
				precoKG = 5.9;
			} else {
				precoKG = 6.8;
			}
		} else if (tipo == 3 ) {
			System.out.println(qtd + "kg - picanha");
			if (qtd < 5) {
				precoKG = 6.9;
			} else {
				precoKG = 7.8;
			}
		}
			double total = qtd * precoKG; 
			System.out.println(qtd + "kg * " + precoKG + " = " +total );
			
			System.out.println("Compra sera no cartao? Digite 1 para sim:");
			int cartao = sc.nextInt();
			
			if (cartao == 1) {
				double desconto = (total / 100) * 5;
				System.out.println("Desconto de: "+desconto);
				System.out.println("Valor a pagar: " + (total - desconto));
			} else {
				System.out.println("Valor a pagar: " +total);
			}
	}
}
