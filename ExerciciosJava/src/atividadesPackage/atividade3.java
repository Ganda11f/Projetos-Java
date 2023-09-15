package atividadesPackage;
import java.util.Scanner;
public class atividade3 {
public static void main(String args []) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite um valor qualquer: ");
	int num = input.nextInt();
	
	if (num %2 == 0) {
		System.out.println(num + " o número é PAR");
	}else {
		System.out.println(num + " o número é ÍMPAR");
	}
}

}

