package atividadesPackage;
import java.util.Scanner;
public class atividade7 {
	public static void main (String args[]) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite um valor caso for par somar 5, caso ímpar somar 8: ");
	double var = input.nextFloat();
	
	if ((var +5) %2 == 0) {
		System.out.println("O valor inserido é par "+(var+5));
	} else {
		System.out.println("O valor inserido é ímpar "+ (var+8));
	}
	}
}
