package Exercicios;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador = 0;
		
		for(int i = 0; i < numero.length; i++) {
			System.out.printf("Digite o número %d: ", i + 1);
			numero[i] = entrada.nextInt();
		
			if(numero[i] >= 8) {
				contador++;
			}
		}
		
		System.out.println(contador + "números são menorres que 8.");
	}
}