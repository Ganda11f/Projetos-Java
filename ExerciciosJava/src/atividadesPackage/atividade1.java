package atividadesPackage;
import java.util.Scanner;
public class atividade1 {
	//cria o scanner
	Scanner input = new Scanner (System.in);
    
	public int A;
    public int B;
    public int C;
    public void LerValores() {
	//pega os valores do teclado
	System.out.println("Digite o valor de A: ");
	int A = input.nextInt();
	System.out.println("Digite o valor de B: ");
	int B = input.nextInt();
	System.out.println("Digite o valor de C: ");
	int C = input.nextInt();
	
	int x = A + B;
	//verifica se o valor de A+B é menor que C
	if(A + B < C) {
		System.out.println("A soma de A + B é: " + x);
		System.out.println("A soma de A + B é menor que C");
	} else {
		System.out.println("A soma de A + B é: " + x);
		System.out.println("A soma de A + B é maior que C");
	}
	}
}

