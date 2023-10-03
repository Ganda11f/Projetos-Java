package matriz;
import java.util.Scanner;
	public class matriz01Test {
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
			matriz01 obj = new matriz01();
			double matriz[][] = new double [2][2];
			for( int i = 0; i < matriz[0].length; i ++) {
				for(int j =0;j < matriz[1].length; j ++ ) {
					System.out.printf("Digite o valor na linha %d e coluna %d:\n",i,j);
					matriz[i][j]=input.nextDouble();
				}//for da coluna
			}//for da linha
			
			System.out.println("Imprimindo matriz");
			for( int i = 0; i < matriz[0].length; i ++) {
				for(int j =0;j < matriz[1].length; j ++ ) {
					System.out.printf("O valor na linha %d e coluna %d = %.2f\n",i,j,matriz[i][j]);
				}//fim da coluna
			}//fim da linha
			
			System.out.println("Imprimindo matriz");
			for( int i = 0; i < matriz[0].length; i ++) {
				for(int j =0;j < matriz[1].length; j ++ ) {
					System.out.printf("%.0f ",matriz[i][j]);
				}//fim da coluna
				System.out.println();
			}//fim da linha
			
			//chamar atualizar
			matriz = obj.atualizar(matriz, 0, 1);
			
			System.out.println("Imprimindo matriz");
			for( int i = 0; i < matriz[0].length; i ++) {
				for(int j =0;j < matriz[1].length; j ++ ) {
					System.out.printf("%.0f ",matriz[i][j]);
				}//fim da coluna
				System.out.println();
			}//fim da linha
			
		}//fim do main
		
}// fim classe
