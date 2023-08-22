package procedural;
import java.util.Scanner;

public class SENAC {
	
	public void MostrarMensagem(String s) {
		System.out.println("Bem-vindo ao curso:"+s);
	}//fim do método MM

	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);//scanner capturando dados de saída
		SENAC obj = new SENAC();//chamar classe
		String nomeCurso;
		
		System.out.print("Digite o nome do curso:");
		nomeCurso= input.nextLine();//capturando informações do teclado
		
		obj.MostrarMensagem(nomeCurso);
		
	}// fim do main
}//fim da classe SENAC
