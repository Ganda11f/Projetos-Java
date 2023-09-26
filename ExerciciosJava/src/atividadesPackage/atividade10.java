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
}
