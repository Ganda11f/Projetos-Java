package AulaArrays;

public class InitArray3 {
	public static void main (String args[]) {
		final int tamanhoArray = 11;
		int array []= new int [tamanhoArray];
		
		for (int contador =0; contador < array.length; contador ++) {
			array[contador]=2* contador +2;
			
			System.out.println("Indice: " + contador+" Valor: "+array[contador]);
		}
	}

}
