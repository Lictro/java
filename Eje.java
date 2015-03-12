import java.util.Scanner;
public class Eje{
	public static void main(String[]args){
	Scanner rd = new Scanner(System.in);
	System.out.println("Ingrese un numero:");
	int num;
	String tipo = "Neutro";
	num = rd.nextInt();
		if(num > 0){
		tipo = "Positivo";
		}else if(num < 0){
		tipo = "Negativo";
		}
	System.out.println(tipo);
	}	
}