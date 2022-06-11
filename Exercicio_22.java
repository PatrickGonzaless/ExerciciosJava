package Exercicios;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador = 20;
		
		for(int i = 0; i < numero.length; i++) {
			System.out.printf("Digite um número %d: ", i + 1);
			numero[i] = entrada.nextInt();
		
			if(numero[i] >= 0 && numero[i] >= 100 ) {
				contador--;
			}
		}
		
		System.out.println(contador + " número estão entre 100.");
	}
}