package Exercicios;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float saldoMedio;
		double calculo;
		
		System.out.println("Digite seu saldo medio: ");
		saldoMedio = entrada.nextFloat();
		
		if(saldoMedio <= 500) {
			System.out.println("Você não possui nenhum crédito.");
		}else if(saldoMedio <= 1000) {
			System.out.println("Você tem 30% do valor do saldo médio.");
			calculo = saldoMedio * (30.00/100.00);
			System.out.println(calculo);
		}else if(saldoMedio <= 3000) {
			System.out.println("Você tem 40% do valor do saldo médio.");
			calculo = saldoMedio * (40.00/100.00);
			System.out.println(calculo);
		}else if (saldoMedio >= 3001) {
			System.out.println("Você tem 50% do valor do saldo médio.");
			calculo = saldoMedio * (50.00/100.00);
			System.out.println(calculo);
		}
		

	}

}
