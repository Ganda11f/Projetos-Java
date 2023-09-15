package atividadesPackage;
import java.util.Scanner;
public class atividade8 {
public static void main (String args[]) {
	Scanner input = new Scanner (System.in);
	
	//capturando dados do teclado
	 System.out.println("Digite o primeiro valor: ");
	 int num1 = input.nextInt();
	 System.out.println("Digite o segundo valor: ");
	 int num2 = input.nextInt();
	 System.out.println("Digite o terceiro valor: ");
	 int num3 = input.nextInt();
	 //definindo ordem das váriaveis
     int maior, meio, menor;
     if (num1 > num2 && num1 > num3) {
         maior = num1;
         if (num2 > num3) {
             meio = num2;
             menor = num3;
         } else {
             meio = num3;
             menor = num2;
         }
     } else if (num2 > num1 && num2 > num3) {
         maior = num2;
         if (num1 > num3) {
             meio = num1;
             menor = num3;
         } else {
             meio = num3;
             menor = num1;
         }
     } else {
         maior = num3;
         if (num1 > num2) {
             meio = num1;
             menor = num2;
         } else {
             meio = num2;
             menor = num2;
         }
     } //fim else
     //printando valores na tela
     System.out.printf("Valores em ordem decrescente "+ maior +" "+ meio +" "+ menor);
     }
}
