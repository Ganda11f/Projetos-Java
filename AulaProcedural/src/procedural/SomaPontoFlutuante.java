package procedural;
import java.util.Scanner;
public class SomaPontoFlutuante {
	public static void main(String args[]) {
		//Entrada de dados
		Scanner input = new Scanner(System.in);
		double num1, num2, soma;
		//Saida de dados
		System.out.print("Digite o primeiro valor:");
		num1= input.nextDouble();
		System.out.print("Digite o segundo valor:");
		num2= input.nextDouble();
		soma= num1 + num2;
				System.out.println("Total:" +soma);
				System.out.printf("O valor é:%.2f", soma);
	}

}
