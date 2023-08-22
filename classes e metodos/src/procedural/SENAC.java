package procedural;
import java.util.Scanner;

public class SENAC {
	
	public void MostrarMensagem(String s) {
		System.out.println("Bem-vindo ao curso:"+s);
	}//fim do método MM

	public static void main(String args[]) {
		//scanner capturando dados de saída
		Scanner input= new Scanner(System.in);
		SENAC obj = new SENAC();//chamar classe
		String nomeCurso;
		
		System.out.print("Digite o nome do curso:");
		//capturando informações do teclado
		nomeCurso= input.nextLine();
		
		obj.MostrarMensagem(nomeCurso);
		
	}// fim do main
}//fim da classe SENAC
