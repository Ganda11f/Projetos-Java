package atividadesPackage;
import java.util.Scanner;
public class atividade2 {
	public static void main (String args[]) {
		//criação do scanner
		Scanner input = new Scanner(System.in);
		
		//capturando valores do teclado
		System.out.println("Digite o seu nome: ");
		String nome = input.nextLine();
		System.out.println("Digite o seu sexo (M) masculino (F) feminino: ");
		String sexo =input.nextLine();
		System.out.println("Digite o seu estado cívil: ");
		String ecp= input.nextLine();
		if (sexo.equals ("F") && ecp.equals("casada")) {
			System.out.println("Anos de casamento:");
			double anos = input.nextFloat();
		}
	}

}
