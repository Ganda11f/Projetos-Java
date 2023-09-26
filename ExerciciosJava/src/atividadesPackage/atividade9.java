package atividadesPackage;
import java.util.Scanner;
public class atividade9 {
	public void Imc () {
// criando scanner
		Scanner input =new Scanner (System.in);
	
		//obtendo valores do teclado
		System.out.println("++++++++++++++++Cálculo de IMC++++++++++++++++");
		System.out.println("Digite a sua altura: ");
		double alt = input.nextDouble();
		System.out.println("Digite o seu peso: ");
		double peso = input.nextDouble();
		double resultado = peso/(alt*alt);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		if (resultado < 18.5) {
			System.out.println("Abaixo do peso.");
		}else if (resultado > 18.5 && resultado < 25) {
			System.out.println("Peso normal.");
		}else if (resultado > 25 && resultado < 30) {
			System.out.println("Acima do peso");
		} else if (resultado > 30 ){
			System.out.println("Obeso");
		}else {
			System.out.println("Error! valor inválido.");
		}
	}

}
