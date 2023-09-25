package aula4;

import java.util.Scanner;

public class SenacTest {
public static void main(String args[]) {
	try (Scanner input = new Scanner(System.in)) {
		System.out.print("Digite o nome do curso: ");
		String nome= input.nextLine();
		Senac objeto = new Senac(nome);
		objeto.Mensagem();
		
		System.out.print("Digite o novo curso: ");
		nome = input.nextLine();
		objeto.setNomeCurso(nome);
		objeto.Mensagem();
	}
	
}
}