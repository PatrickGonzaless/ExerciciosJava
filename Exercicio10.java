package Exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double salario;
		double calculo;
		double resultado;
		
		System.out.println("Informe seu salário: ");
		salario = entrada.nextDouble();
		calculo = salario * (1.50/100.00);
		resultado = calculo + salario;
		System.out.println("O seu salário com nosso ajuste, é " + resultado);
		
	}

}
