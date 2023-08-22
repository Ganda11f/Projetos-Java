package procedural;

import java.util.Scanner;

// Defini��o da classe SetGetSenac
public class SetGetSenac {

    // Atributo da classe
    private String nomeCurso;

    // M�todo para atribuir um valor ao atributo nomeCurso (setter)
    public void setNomeCurso(String valor) {
        nomeCurso = valor;
    }

    // M�todo para obter o valor do atributo nomeCurso (getter)
    public String getNomeCurso() {
        return nomeCurso;
    }

    // M�todo para mostrar uma mensagem com o valor do atributo nomeCurso
    public void MostrarMensagem() {
        System.out.println("Nome do Curso: " + getNomeCurso());
    }

} // Fim da classe
