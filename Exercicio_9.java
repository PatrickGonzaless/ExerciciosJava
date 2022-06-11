package Exercicios;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int salarioMinimo = 1212;
		double salarioUsuario;
		double qntSalarioMinimo;
		
	System.out.println("Informe seu salário: ");
	salarioUsuario = entrada.nextDouble();
	qntSalarioMinimo = salarioUsuario / salarioMinimo;
	
	System.out.println("No seu salário de R$" +salarioUsuario+ ", cabem " +qntSalarioMinimo+ " salários mínimos.");

	}

}
