package matriz;

public class listaArgumentosTest {
public static void main(String[] args) {
	listaArgumentos obj = new listaArgumentos();
	double d1=10,d2=20,d3=30,d4=40;
	int entrada[]= {1,2,5,3,10,20,34};
	System.out.println("Média de d1 e d2: "+obj.media(d1,d2));
	System.out.println("Média de d1, d2 e d3: "+obj.media(d1,d2,d3));
	System.out.println("Média de d1, d2, d3 e d4: "+obj.media(d1,d2,d3,d4));
	
	
	obj.MostrarArray(entrada, "**************** Testando Array *******************");
}//fim do main


}//fim da classe
