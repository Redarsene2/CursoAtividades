package Aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c,f;
		
		System.out.println("Digite a temperatura em Celcius");
		c = sc.nextDouble();
		
		f = (1.8 * c) + 32;
		
		System.out.println("a temperatura de "+c+" em celcius e de "+f+"F°");

	}

}
