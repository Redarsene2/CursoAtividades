package Aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Valor/Hora");
		double valorHora = sc.nextDouble();
		
		System.out.println("Entre com o entre com a quantidade de horas trabalhadas");
		double horas = sc.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O salario bruto: : "+salarioBruto);
		System.out.println("INSS: "+inss);
		System.out.println("IR: "+ir);
		System.out.println("total de descontos: "+totalDescontos);
		System.out.println("O salario liquido"+salarioLiquido);
		
	}

}
