package procedural;
import java.util.Scanner;
public class ParOuImpar {

	public static void main(String args[]) {	
	Scanner input = new Scanner(System.in);
	
	int num;
	
	System.out.print("Digite o primeiro valor:");
	num = input.nextInt();
	if(num % 2 == 0) {
	System.out.printf("%d é par\n",num);}
	else {
		System.out.printf("%d é impar\n",num);
	}
	
	}//fim classe
}//fim classe
