package Exercicios;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float ValorReal;
		float CotacaoDolar;
		float ValorDolar;
		
		System.out.println("Converta o seu dinheiro em D�lar para Real! /n");
		
		System.out.println("Digite o valor em D�lar: \n");
		ValorDolar = entrada.nextFloat();
		
		System.out.println("Digite a cota��o do D�lar hoje: \n");
		CotacaoDolar = entrada.nextFloat();
		
		ValorReal = ValorDolar * CotacaoDolar;
		
		System.out.println(ValorDolar + " dol�res, na cota��o de " + CotacaoDolar + ", s�o iguais � R$: " + ValorReal);
	}
}