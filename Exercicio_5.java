package Exercicios;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner (System.in);
			
			int idade;
			
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			if(idade < 16) {
				System.out.println("Não eleitor.");
			}else if(idade >= 18 && idade <= 65) {
				System.out.println("Eleitor obrigatório.");
			}else {
				System.out.println("Eleitor facultativo.");
			}
		}
	}
