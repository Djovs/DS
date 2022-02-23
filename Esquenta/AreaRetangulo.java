import java.util.Scanner;
public class AreaRetangulo {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double a, b, h;
		
		System.out.println("Insira o valor da base: ");
		b = input.nextDouble();
		
		System.out.println("Insira o valor da altura: ");
		h = input.nextDouble();
		a = b*h;
		
		System.out.println("A area e igual a: "+a);
	}
	
	

}
