package Exercicios;

import java.util.*;
public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int CodPeca1;
		int CodPeca2;
		float VlPeca1;
		float VlPeca2;
		int QntPeca1;
		int QntPeca2;
		float IPI;
		float calculo;
		
		System.out.println("Digite o c�digo da primeira pe�a: ");
		CodPeca1 = entrada.nextInt();
		System.out.println("Digite o c�digo da segunda pe�a: ");
		CodPeca1 = entrada.nextInt();
		
		System.out.println("Digite o valor da primeira pe�a: ");
		VlPeca1 = entrada.nextFloat();
		System.out.println("Digite o valor da segunda pe�a: ");
		VlPeca2 = entrada.nextFloat();
		
		System.out.println("Digite a quantidade da primeira pe�a: ");
		QntPeca1 = entrada.nextInt();
		System.out.println("Digite a quantidade da segunda pe�a: ");
		QntPeca2 = entrada.nextInt();
		
		System.out.println("Digite o IPI: ");
		IPI = entrada.nextFloat();
		
		calculo = (VlPeca1 * QntPeca1 + VlPeca2 * QntPeca2) * (IPI/100 + 1);
		
		System.out.println("O valor total a ser pago �: R$ " + calculo);
	}
}


