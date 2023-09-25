package aula4;

public class ContaTest {
	
	public static void main(String args[]) {
		Conta conta1 = new Conta(1234.21);
		Conta conta2 = new Conta(-12);
		System.out.println("Valor da conta 1: "+conta1.getBalanco());
		System.out.println("Valor da conta 2: "+conta2.getBalanco());
		
		conta2.deposito(123.32);
		System.out.println("Valor da conta 2: "+conta2.getBalanco());
		
		conta2.Sacar(200);
		System.out.println("Valor da conta 2: "+conta2.getBalanco());	}

}
