package procedural;
import java.util.Scanner;

public class SomaSimples {

	public static void main(String args[]) 
	{
	Scanner input= new Scanner(System.in);
	int num1, num2, soma;
	
	System.out.print("Digite o primeiro valor:");
	num1= input.nextInt();
	System.out.print("Digite o segundo valor:");
	num2= input.nextInt();
	soma= num1 + num2;
	System.out.println("O resultado da some é:"+soma);
		}
}
