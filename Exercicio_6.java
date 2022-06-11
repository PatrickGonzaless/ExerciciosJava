package Exercicios;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		int sucessor;
		int antecessor;
		
		System.out.println("Digite um numero: ");
		numero =  entrada.nextInt();
		sucessor = numero + 1;
		antecessor = numero - 1;
		
		System.out.println("O antecessor do número digitado é " 
				+ antecessor + "e o sucessor, " + sucessor);
		
		

	}

}
