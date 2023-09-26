package atividadesPackage;

import java.util.Scanner;

public class atividade10Test {
	public static void main(String args[]) {
		atividade10 obj = new atividade10();
		double valor, valorFinal;
		int condicao;
		Scanner input = new Scanner (System.in);
		System.out.print("Digite o valor da etiqueta: ");
		valor = input.nextDouble();
		System.out.println("Digite o tipo de pagamento: ");
		condicao= input.nextInt();
		valorFinal=obj.core(valor,condicao);
		System.out.println("O valor final é "+ valorFinal);
	}
}
