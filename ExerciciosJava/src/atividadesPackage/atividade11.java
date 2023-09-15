package atividadesPackage;
import java.util.Scanner;
import java.text.DecimalFormat;
public class atividade11 {
	
	public static void main (String args[]) {
		//criação do scanner
		Scanner input = new Scanner(System.in);
		


			//leitura dos dados do teclado
			System.out.println("Digite o número de identificação do aluno: ");
			int aluno = input.nextInt();
			System.out.println("Digite a primeira nota: ");
			double nota1 = input.nextDouble();
			System.out.println("Digite a segunda nota: ");
			double nota2 = input.nextDouble();
			System.out.println("Digite a terceira nota: ");
			double nota3 = input.nextDouble();
			System.out.println("Digite a média dos exercícios: ");
			double media = input.nextDouble();
			
			//Cálculo da notas
			double ma = (nota1 + nota2*2 + nota3*3 + media)/7;
			//forMatação do ma para obter menos casas decimais
			DecimalFormat df = new DecimalFormat("0.00");
			String Ma = df.format(ma);
			
			//Lógica
			if (ma >= 90) {
				System.out.println("O aluno " + aluno);
				System.out.println("Obteve as notas: "+ nota1 +" "+ nota2 +" "+ nota3);
				System.out.println("Obteve a média de exercícios de : "+ media);
				System.out.println("Obteve a média de aproveitamento de: "+ Ma);
				System.out.println("O aluno está Aprovado: A");
			}else if (ma >= 75 && ma <90) {
				System.out.println("O aluno " + aluno);
				System.out.println("Obteve as notas: "+nota1 +" "+ nota2 +" "+ nota3);
				System.out.println("Obteve a média de exercícios de : "+ media);
				System.out.println("Obteve a média de aproveitamento de: "+ Ma);
				System.out.println("O aluno está Aprovado: B");
			}else if(ma >= 60 && ma <75) {
				System.out.println("O aluno " + aluno);
				System.out.println("Obteve as notas: "+nota1 +" "+ nota2 +" "+ nota3);
				System.out.println("Obteve a média de exercícios de : "+ media);
				System.out.println("Obteve a média de aproveitamento de: "+ Ma);
				System.out.println("O aluno está Aprovado: C");
			} else if (ma >=40 && ma <60) {
				System.out.println("O aluno " + aluno);
				System.out.println("Obteve as notas: "+nota1 +" "+ nota2 +" "+ nota3);
				System.out.println("Obteve a média de exercícios de : "+ media);
				System.out.println("Obteve a média de aproveitamento de: "+ Ma);
				System.out.println("O aluno está Reprovado: D");
			} else{
				System.out.println("O aluno " + aluno);
				System.out.println("Obteve as notas: "+nota1 +" "+ nota2 +" "+ nota3);
				System.out.println("Obteve a média de exercícios de : "+ media);
				System.out.println("Obteve a média de aproveitamento de: "+ Ma);
				System.out.println("O aluno está Reprovado: E");
			}
			
			
			
		}
		
		
		
		
	}
