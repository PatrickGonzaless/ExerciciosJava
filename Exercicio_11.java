package Exercicios;
import java.util.Scanner;
public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String nome;
		float salarioFixo;
		int nVendas;
		float comissao;
		float valorComissao;
		
		System.out.println("Digite o nome do vendedor: ");
		nome = entrada.next();
		
		System.out.println("Digite o salario fixo do vendedor: ");
		salarioFixo = entrada.nextFloat();
		
		System.out.println("Digite o total de vendas do vendedor no final do m�s: " );
		nVendas = entrada.nextInt();
		
		valorComissao = (float) (nVendas * (15.00/100.00));
		comissao = (float) (salarioFixo + nVendas * (15.00/100.00));
		
		System.out.println("O vendedor " +nome+ ", com sal�rio fixo de R$" +salarioFixo+ " "
				+ "ganhou R$" +valorComissao+ " de comiss�o no final desse m�s, totalizando R$: " +comissao+".");
		
	}

}
