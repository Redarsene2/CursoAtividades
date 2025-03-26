package Aula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma letra");
		String letra = sc.next();
		
		if (letra.length() > 1){
			System.out.println("Não e uma letra válida");
		} else{
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
			}
			
		
	}
	}
}
