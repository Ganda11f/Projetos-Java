package atividadesPackage;
import java.util.Scanner;
public class atividade4 {

	public void Abc() {
	Scanner input = new Scanner (System.in);
 
	System.out.println("Digite o valor de A: ");
	int A = input.nextInt();
	System.out.println("Digite o valor de B: ");
	int B = input.nextInt();
	int C;
	
	if (A == B) {
		C = A+B;
		System.out.println("O valor é " + C);
	} else {
		C= A*B;
		System.out.println("O valor é:" + C);
	}
	}
}
