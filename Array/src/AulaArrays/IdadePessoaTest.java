package AulaArrays;
import java.util.Scanner;
public class IdadePessoaTest {
public static void main (String args[]) {
	Scanner input = new Scanner(System.in);
	idadePessoa obj = new idadePessoa(3);
	
	System.out.println("INICIANDO PREENCHIMENTO DOS VETORES");
	obj.Preenchimento();
	
	System.out.println("INICIANDO MOSTRAR VETORES");
	obj.mostraVetores();
	
	System.out.println("INICIANDO qtdMaioreIdades");
	int qtdMaiorIdade = obj.QtdMaioresdeIdade();
	System.out.println("Existe "+ qtdMaiorIdade +" maiores de idade.");
	
	System.out.println("INICIANDO NomesMaioresdeIdade");
	obj.NomeMaioresIdade();
	
	System.out.println("INICIANDO Pesquisar Nome");
	System.out.println("Digite um nome para buscar: ");
	String nome = input.next();
	obj.PesquisarPorNome(nome);
	
	System.out.println("INICIANDO Pesquisar Idade");
	System.out.println("Digite uma idade para buscar: ");
	int idade = input.nextInt();
	obj.PesquisarPorIdade(idade);
	
	
	
	
	
	
}
}
