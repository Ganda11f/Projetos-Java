package AulaArrays;

public class InitArray4Test {
public static void main(String args[]) {
	InitArray4 obj = new InitArray4();
	double recebeArray[];
	double recebeTotal;
	recebeArray = obj.PopulaVetor(6);
	recebeTotal = obj.Somatorio(recebeArray);
	System.out.println("\n");
	System.out.println("Resultado: " +recebeTotal);
}
}
