package atividadesPackage;
import java.util.Scanner;
public class atividade2 {
	public void lerValores() {
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
			System.out.println("\nNome: "+nome+"\n Sexo: "+sexo+"\n Estado cívil: "+ecp+"\n Anos de casamento: "+anos);
		}else {
			System.out.println("\nNome: "+nome+"\n Sexo: "+sexo+"\n Estado cívil: "+ecp);
		}
		
	}

}
