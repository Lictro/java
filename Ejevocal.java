import java.util.Scanner;
public class Ejevocal{
	public static void main(String[]args){
	Scanner rd = new Scanner(System.in);
	System.out.println("Ingrese una letra:");
	String entrada;
	char letra;
	entrada = rd.next();
	letra = entrada.charAt(0);
		if(letra == "a"){
		System.out.println("Es Vocal");
		}
		if (letra == "e"){
		System.out.println("Es Vocal");	
		}
		if (letra == "i"){
		System.out.println("Es Vocal");
		}
		if (letra == "o"){
		System.out.println("Es Vocal");
		}
		if (letra == "u"){
		}else{
		System.out.println("Es Consonante");
		}	
	}	
}