package Exercicios;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float ValorReal;
		float CotacaoDolar;
		float ValorDolar;
		
		System.out.println("Converta o seu dinheiro em Dólar para Real! /n");
		
		System.out.println("Digite o valor em Dólar: \n");
		ValorDolar = entrada.nextFloat();
		
		System.out.println("Digite a cotação do Dólar hoje: \n");
		CotacaoDolar = entrada.nextFloat();
		
		ValorReal = ValorDolar * CotacaoDolar;
		
		System.out.println(ValorDolar + " doláres, na cotação de " + CotacaoDolar + ", são iguais à R$: " + ValorReal);
	}
}