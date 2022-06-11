package Exercicios;

import java.util.Scanner;

public class Exercicios_21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int compra;
		int prestacao;

		System.out.println("Informe o valor da sua compra: \n");
		compra = entrada.nextInt();
		
		prestacao = compra / 5;
		
		System.out.println("O valor das suas prestações será de R$" + prestacao );
	}
}