package Aula13;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com o tamanha do arquivo");
		double tamArquivo = sc.nextDouble();
		
		System.out.println("entre com a velocidade da internet:");
		double velInternet = sc.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo de download: "+tempo);
	}

}
