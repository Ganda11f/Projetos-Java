package aula4;

public class Senac {
String nomeCurso;

//construct
public Senac (String nome) {
	nomeCurso = nome;
}
public void setNomeCurso(String nome) {
	nomeCurso =nome;
}
public String getNomeCurso() {
	return nomeCurso;
}
public void Mensagem() {
	System.out.println("Bem-vindo ao Curso: "+ getNomeCurso());
}//end method
}//end class Senac
