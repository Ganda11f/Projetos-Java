package procedural;

import java.util.Scanner;;

public class OperadoresRelacionais {

	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int num1,num2;
	
	System.out.print("Digite o primeiro valor:");
	num1= input.nextInt();
	System.out.print("Digite o segundo valor:");
	num2= input.nextInt();
	
	if(num1 == num2) {
		System.out.printf("%d == %d \n", num1,num2);
	}//fimse
	if (num1 != num2) {
		System.out.printf("%d != %d \n", num1,num2);
	}//fimse
	if(num1 > num2) {
		System.out.printf("%d > %d \n", num1,num2);
	}//fimse
	if(num1 >= num2) {
		System.out.printf("%d >= %d \n", num1,num2);
	}//fimse
	if(num1<num2) {
		System.out.printf("%d < %d \n", num1,num2);
	}//fimse
	if(num1<=num2) {
		System.out.printf("%d <= %d \n", num1,num2);
	}//fimse
}//fim main
}//fim classe
