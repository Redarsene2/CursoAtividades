package Aula13;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2,num3,num4,media;
		System.out.println("A nota do primeiro bimestre");
		num1 = sc.nextDouble();
		
		System.out.println("A nota do segundo bimestre");
		num2 = sc.nextDouble();
		
		System.out.println("A nota do terceiro bimestre");
		num3 = sc.nextDouble();
		
		System.out.println("A nota do quarto bimestre");
		num4 = sc.nextDouble();
		
		media = (num1 + num2 + num3 + num4 ) / 4;
		
		System.out.println("a media ficou em: "+media);
	}
}
