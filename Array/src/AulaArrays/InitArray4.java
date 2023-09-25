package AulaArrays;
import java.util.Scanner;
public class InitArray4 {

	public double[] PopulaVetor(int TamanhoVetor) {
		double array[] = new double [TamanhoVetor];
		Scanner input = new Scanner(System.in);
		
		for(int contador = 0; contador < array.length;contador++) {
			System.out.print("Digite o valor: ");
			array[contador]= input.nextDouble();
		}
		
		return array;
	}//fim populavetor
	public double Somatorio(double array[]) {
		double total=0.0;
		
		for (int contador = 0; contador < array.length; contador++) {
			total= total + array[contador];
		}
		
		return total;
	}// fim somatorio
}
