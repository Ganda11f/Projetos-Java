package AulaArrays;

public class InitArray2 {
	public static void main (String args []) {
		int array[]= {10,20,30,40,50,60};
		
		System.out.println("A terceira posição é: "+array[2]);
		System.out.printf("Indice%7s", "Array");
		for(int contador=0;contador <array.length;contador++) {
			System.out.printf("\n%d%10d", contador, array[contador]);
		}
	}
}
