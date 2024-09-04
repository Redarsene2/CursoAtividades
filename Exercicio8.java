package Aula13;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Valor/Hora");
		double valorHora = sc.nextDouble();
		
		System.out.println("Entre com o entre com a quantidade de horas trabalhadas");
		double horas = sc.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salario e de: "+salario);
	}

}
