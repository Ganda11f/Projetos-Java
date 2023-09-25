package AulaArrays;

public class InitArray {
public static void main () {
	int array[]= new int[10];
	
	System.out.printf("%s%7s", "Indice", "Valor");
	for(int contador=0;contador <array.length;contador++) {
		System.out.printf("\n%d%10d", contador, array[contador]);
	}
}
}
