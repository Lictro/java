import java.util.Scanner;
public class Eje3{
	public static void main(String[]args){
		Scanner rd = new Scanner(System.in);
		char OP;
		int num1 , num2;
		int t = 0;
		System.out.println("Seleccione + para Sumar");
		System.out.println("Seleccione - para Restar");
		System.out.println("Seleccione * para Multiplicar");
		System.out.println("Seleccione / para Dividir");
		OP = rd.next().charAt(0);
		System.out.println("Primer Numero:");
		num1 = rd.nextInt();
		System.out.println("Segundo Numero:");
		num2 = rd.nextInt();
			if(OP == '+'){
			t = num1 + num2;
			}else if(OP == '-'){
			t = num1 - num2;
			}else if(OP == '*'){
			t = num1 * num2;
			}else if(OP == '/'){
			t = num1 / num2;
			}else{
			System.out.println(num1+""+num2);	
			}
		System.out.println("Resultado= " + t);
	}
}