package atividadesPackage;

import java.util.Scanner;
public class atividade10 {
	public double core(double valor, int condicao) {
		double valorFinal;
		switch (condicao) {
		case 1: valorFinal= valor - 0.1*valor;
		break;
		case 2: valorFinal= valor - 0.15 *valor;
		break;
		case 3: valorFinal= valor;
		break;
		default:
			valorFinal=valor + 0.1*valor;
			break;
		}//fim switch
		return valorFinal;
	}//fim core
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
