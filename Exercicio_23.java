package Exercicios;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;

		for(int i = 0; i < numero.length; i++) {
			System.out.printf("Digite um número %d: ", i + 1);
			numero[i] = entrada.nextInt();
		
			if(numero[i] >= 0 && numero[i] <= 100 ) {
				contador1++;
			}
			if(numero[i] >= 101 && numero[i] <= 200 ) {
				contador2++;
			}
			if(numero[i] >= 201) {
				contador3++;
			}
		}
		
		System.out.println(contador1 + " números estão entre 100.");
		System.out.println(contador2 + " números estão entre 101 e 200.");
		System.out.println(contador3 + " números são maiores que 200.");
	}
}