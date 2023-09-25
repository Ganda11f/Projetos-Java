package aula4;

public class Conta {
	
	private double balanco;//armazena o saldo
	//contruct
	public Conta(double b) {
		if(b > 0.0) {
			balanco = b;
		}
	}//fim do construct

	public void deposito(double valor) {
		balanco += valor;
	}
	public void Sacar(double valor) {
		if (valor <= balanco) {
			balanco -= valor;
		}else {
			System.out.println("Saldo Insuficiente");
			}
	}
	public double getBalanco() {
		return balanco;
	}
}
