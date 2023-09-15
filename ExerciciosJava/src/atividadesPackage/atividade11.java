package atividadesPackage;
import java.util.Scanner;
public class atividade11 {
	
	public static void main (String args[]) {
		//criação do scanner
		Scanner input = new Scanner(System.in);
		

		
		//declaração de váriaveis
		double media = nota1 + nota2 + nota3 / 2;
		double ma =(nota1 + nota2*2 + nota3*3+media)/7;
		int aluno = 0;
		int contador = 0;
		
		while (contador <= 10) {
			aluno+=contador;
			contador++;
			//leitura dos dados do teclado
			System.out.println("Digite a primeira nota: ");
			double nota1 = input.nextDouble();
			System.out.println("Digite a segunda nota: ");
			double nota2 = input.nextDouble();
			System.out.println("Digite a terceira nota: ");
			double nota3 = input.nextDouble();
			System.out.printf( contador + " A média de aproveitamendo do aluno foi de: %.2f",ma);
			System.out.println();
		}
		
		
		
		
	}

}
