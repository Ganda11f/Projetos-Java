package procedural;

import java.util.Scanner;

// Definição da classe SetGetSenacTest
public class SetGetSenacTest {

    // Método principal (ponto de entrada do programa)
    public static void main(String args[]) {
        // Criação de um objeto da classe SetGetSenac
        SetGetSenac obj = new SetGetSenac();

        // Criação de um objeto Scanner para entrada de dados
        Scanner input = new Scanner(System.in);
        String curso;

        // Solicita ao usuário que digite o nome do curso
        System.out.print("Digite o curso:");
        curso = input.nextLine();

        // Chama o método setter para atribuir o nome do curso ao objeto
        obj.setNomeCurso(curso);

        // Chama o método getter para obter o nome do curso do objeto
        String recebe = obj.getNomeCurso();

        // Exibe o nome do curso obtido
        System.out.println("Curso:" + recebe);
        
        obj.setNomeCurso("GTI");
    }

} // Fim da classe
