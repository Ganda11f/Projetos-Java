package AulaArrays;
import java.util.Scanner;
public class idadePessoa {
//declaração dos atriburos
		protected String Nomes[];
		protected int Idades[];
//declaração contrutor
		public idadePessoa(int tamanho) {
			Nomes = new String[tamanho];
			Idades = new int[tamanho];
		}//fim do metodo contrutor
		
		public void Preenchimento() {
			Scanner input = new Scanner(System.in);
			for(int contador =0; contador< Nomes.length;contador++) {
				System.out.print("Digite o nome: ");
				Nomes[contador]= input.next();
				System.out.print("Digite a Idade: ");
				Idades[contador]= input.nextInt();
			}
		}//fim do metodo
		
		//imprime os vetores de Nomes e Idades 
		public void mostraVetores() {
			for (int contador =0; contador< Nomes.length;contador++) {
			System.out.println(Nomes[contador]+" possui "+Idades[contador]+" anos.");
			}	
				}//fim do metodo
		
		public int QtdMaioresdeIdade() {
		int qtd=0;
			for (int contador =0; contador< Nomes.length;contador++) {
				if(Idades[contador]>=18) {
					qtd++;
				}//fim if
		}//fim for
			return qtd;
		}//fim metodo
		
		public void NomeMaioresIdade() {
			for (int contador =0; contador< Nomes.length;contador++) {
				if(Idades[contador]>=18) {
					System.out.println(Nomes[contador]+" é maior de idade");
					}
			}
		}//fim metodo
		
		//lista todos os nomes presentes no vetor Nomes
		public void PesquisarPorNome(String nome) {
			for (int contador =0; contador< Nomes.length;contador++) {
			if(nome.equals(Nomes[contador])) {
				System.out.println( nome+ " está na posição: "+contador);
			}
			}
		}//fim metodo
		
		//lista todas as idades presentes no vetor Idades
				public void PesquisarPorIdade(int idade) {
					for (int contador =0; contador< Nomes.length;contador++) {
					if(idade==(Idades[contador])) {
						System.out.println( idade+ " está na posição: "+contador);
					}
					}
				}//fim metodo
		
}// fim class
