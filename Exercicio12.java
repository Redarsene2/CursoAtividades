package Aula13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura");
		double altura = sc.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.print("O peso ideal para sua altura sendo "+altura+" e de "+pesoIdeal);
		
	}

}
