package matriz;

public class listaArgumentos {
	public double media(double... numeros) {
		double total = 0.0;
		for(double numero:numeros) {
			total=total +numero;
		}//fim for
		return total / numeros.length;
	}//fim metodo
	
	// novo exc
	public void MostrarArray(int []array, String descricao) {
		System.out.printf("%s\n ",descricao);
		for(int i: array)
			System.out.printf("%d ", i);
		System.out.println();
		
	}//fim metodo
}//fim da classe
