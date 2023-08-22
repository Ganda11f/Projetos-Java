package procedural;

import java.util.Scanner;

// Definição da classe SetGetSenac
public class SetGetSenac {

    // Atributo da classe
    private String nomeCurso;

    // Método para atribuir um valor ao atributo nomeCurso (setter)
    public void setNomeCurso(String valor) {
        nomeCurso = valor;
    }

    // Método para obter o valor do atributo nomeCurso (getter)
    public String getNomeCurso() {
        return nomeCurso;
    }

    // Método para mostrar uma mensagem com o valor do atributo nomeCurso
    public void MostrarMensagem() {
        System.out.println("Nome do Curso: " + getNomeCurso());
    }

} // Fim da classe
