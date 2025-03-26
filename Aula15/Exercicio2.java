package Aula15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = sc.nextInt();
		
		if(num >= 0){
		System.out.println("O número informado é positivo");
		} else {
			System.out.println("O número informado é negativo");
		}

	}

}
