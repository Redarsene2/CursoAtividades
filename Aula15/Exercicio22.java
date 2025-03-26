package Aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (KG) de morango: ");
		double qtdMorango = sc.nextDouble();
		
		System.out.println("Entre com a quantidade (KG) de maça: ");
		double qtdMaca = sc.nextDouble();
		
		double precoKGMorango = 0;
		if (qtdMorango <=5 ) {
			precoKGMorango = 2.5;
		} else {
			precoKGMorango = 2.2;
		}
		
		double precoKGMaca = 0;
		if (qtdMaca <= 5) {
			precoKGMaca = 1.8;
		} else {
			precoKGMaca = 1.5;
		}
		double precoTotalMorango = qtdMorango * precoKGMorango;
		double precoTotalMaca = qtdMaca * precoKGMaca;
		
		double precoParcial = precoKGMorango + precoKGMaca;
		double precoTotal = 0;
		
		if ((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		System.out.println("preco total = "+precoTotal);
	}

}
