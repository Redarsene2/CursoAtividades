package Aula13;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c,f;
		
		System.out.println("Digite a temperatura em Farenheit");
		f = sc.nextDouble();
		
		c = (5 * (f-32) / 9);
		
		System.out.println("a temperatura de "+f+" em celcius e de "+c+"°");
	}

}
