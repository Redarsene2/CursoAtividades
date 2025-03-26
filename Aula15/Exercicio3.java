package Aula15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com uma letra (F ou M)");
		String input = sc.next();
	
		if(input.equalsIgnoreCase("f")){
			System.out.println("F - Feminino");
		}else if (input.equalsIgnoreCase("m")){
			System.out.println("M - masculino");
		}else {
			System.out.println("Sexo invalido");
		}
			
			
	}

}
