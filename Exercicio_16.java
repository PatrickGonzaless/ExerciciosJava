package Exercicios;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int idade = 0;
		int soma = 0;
		int media = 0;
		
		
		for(int i = 1; i <= 20; i++) {
			System.out.println("Digite uma idade:");
			idade = entrada.nextInt();
			
			soma = soma + idade;	
			
			media = soma / 20;
		}
		
		System.out.println("A media das idades digitadas é: " + media);
		
	

	}


	}

