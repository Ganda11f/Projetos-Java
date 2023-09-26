package atividadesPackage;
import java.util.Scanner;
public class atividade5 {
public void dobroTriplo () {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite um valor: ");
	int num = input.nextInt();
	
	if (num > 0) {
		System.out.println("O dobro de "+num+" é "+num*2);
	}else {
		System.out.println("O triplo de "+num+" é "+num*3);
	}
}
}
