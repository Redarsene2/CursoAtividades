package Aula13;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double altura, pesoIdealHomi, pesoIdealMule;

        System.out.println("Digite seu sexo, sendo H para homens e M para mulheres:");
        String sexo = sc.next().toUpperCase(); 

        System.out.println("Digite sua altura (em metros):");
        altura = sc.nextDouble();

      
        pesoIdealHomi = (72.7 * altura) - 58;
        pesoIdealMule = (62.1 * altura) - 44.7;


        if (sexo.equals("H")) {
            System.out.printf("Sendo um homem, o seu peso ideal é: %.2f kg%n", pesoIdealHomi);
        } else if (sexo.equals("M")) {
            System.out.printf("Sendo uma mulher, o seu peso ideal é: %.2f kg%n", pesoIdealMule);
        } else {
            System.out.println("Você digitou um sexo inválido.");
        }

		}
	}
