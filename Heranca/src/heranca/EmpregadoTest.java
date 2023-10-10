package heranca;

public class EmpregadoTest {
	
public static void main(String args[]) {
	EmpregadoComissionado obj = new EmpregadoComissionado("Manoel","Chaves", "030.991.092-56",23890.4,0.05);
	System.out.printf("Empregado: %s%s\n",obj.getprimeiroNome(), obj.getultimoNome());
	System.out.println("CPF: "+obj.getCpf());
	System.out.println("Total de vendas: " +obj.getvendasBruta());
	System.out.println("Taxa de comissão: " +obj.getporcentagemComissao());
	System.out.printf("Salário: %.2f \n",obj.salario());
}
}
