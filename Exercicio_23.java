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
			System.out.printf("Digite um n�mero %d: ", i + 1);
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
		
		System.out.println(contador1 + " n�meros est�o entre 100.");
		System.out.println(contador2 + " n�meros est�o entre 101 e 200.");
		System.out.println(contador3 + " n�meros s�o maiores que 200.");
	}
}