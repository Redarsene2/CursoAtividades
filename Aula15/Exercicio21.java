package Aula15;

import java.util.Scanner;

public class Exercicio21 {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidaded de litros vendidos");
		double litros = sc.nextDouble();
		
		System.out.println("Entre com o tipo de combustível");
		String tipo = sc.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		
		if(tipo.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			total = litros * precoAlc;
			
			
		} else if (tipo.contentEquals("g")) {
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			total = litros * precoGas;
		}
		totalDesc = (total / 100) * percDesconto;
		
		double precoApagar = total - totalDesc;
		
		System.out.println("Valor a ser pago: "+precoApagar);
	}
}
