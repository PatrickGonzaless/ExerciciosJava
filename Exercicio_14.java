package Exercicios;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numero = 0;
		int soma = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um n�mero:");
			numero = entrada.nextInt();
			
			soma = soma + numero;	
			
		}
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		
	

	}

}
