package Exercicios;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] idade = new int[20];
		int contagem = 0;
		
		for(int i = 0; i < idade.length; i++) {
			System.out.printf("Digite a idade %d: ", i + 1);
			idade[i] = entrada.nextInt();
		
			if(idade[i] >= 18) {
				contagem++;
			}
		}
		
		System.out.println("Dentre as idades digitadas, " +contagem+ "pessoas são maiores de idade.");
	}
}