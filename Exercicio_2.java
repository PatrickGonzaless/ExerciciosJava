package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double numero = 0;
		boolean dividir = false;
		System.out.println("Escolha um n�mero: ");
		numero = entrada.nextDouble();
		
		if(numero % 2 == 0){
			System.out.println("Este � divis�vel por 2");
			dividir = true;
		}if(numero % 5 == 0){
			System.out.println("Este � divis�vel por 5");
			dividir = true;
		}if(numero % 10 == 0 ) {
			System.out.println("Este � divis�vel por 10");
			dividir = true;
		}else if(dividir == false){
			System.out.println("Este n�o � divis�vel por nenhum dos n�meros apresentados.");
		}
		
	}

}