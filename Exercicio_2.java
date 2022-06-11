package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double numero = 0;
		boolean dividir = false;
		System.out.println("Escolha um número: ");
		numero = entrada.nextDouble();
		
		if(numero % 2 == 0){
			System.out.println("Este é divisível por 2");
			dividir = true;
		}if(numero % 5 == 0){
			System.out.println("Este é divisível por 5");
			dividir = true;
		}if(numero % 10 == 0 ) {
			System.out.println("Este é divisível por 10");
			dividir = true;
		}else if(dividir == false){
			System.out.println("Este não é divisível por nenhum dos números apresentados.");
		}
		
	}

}