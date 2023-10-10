package heranca;

public class EmpregadoComissionado {
	//atributos
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	private double vendasBruta;
	private double porcentagemComissao; //0 até 1
	
	//contrutor
	public EmpregadoComissionado(String pNome,String uNome, String cpf, double vendasBruta,
			double porcentagemComissao) {
		primeiroNome=pNome;
		ultimoNome=uNome;
		this.cpf = cpf;
		this.vendasBruta = vendasBruta;
		this.porcentagemComissao=porcentagemComissao;
	}//fim contrutor
	
	//sets
	public void setprimeiroNome(String a) {
		this.primeiroNome = a;
	}
	public void setultimoNome(String b) {
			this.ultimoNome = b;}
	public void setCpf(String c) {
		this.cpf = c;
	}
	public void setvendasBruta(double vendas) {
		this.vendasBruta=(vendas<0.0)?0.0:vendas;
	}
	public void setporcentagemComissao(double ptg) {
		this.porcentagemComissao = ptg;
	}
	
	//gets
	public String getprimeiroNome() {
		return primeiroNome;
	}
	public String getultimoNome() {
		return ultimoNome;
	}
	public double getvendasBruta() {
		return vendasBruta;
	}
	public String getCpf() {
		return cpf;
	}
	public double getporcentagemComissao () {
		return porcentagemComissao;
	}
	public double salario() {
		double valor = this.getvendasBruta()*this.getporcentagemComissao();
		return valor;
	}
}//fim classe
