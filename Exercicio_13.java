package Exercicios;

import java.util.*;
public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
			double C;
			double F;
			
			System.out.println("Digite uma temperatura em Celsius: ");
			C = entrada.nextDouble();
			
			F = (1.8 * C) + 32;//32 = 160/5
			
			System.out.println(C + "°C convertido para Fahrenheit é " + F + "°");

	}

}
