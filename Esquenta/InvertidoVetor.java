import java.util.Scanner;
public class InvertidoVetor {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n, temp, inve;
		
		System.out.println("Insira algum número inteiro de três algarismos: ");
		n = input.nextInt();
		for(inve = 0;n!=0;) {
			temp = n%10;
			inve = inve*10+temp;
			n = n/10;
		}
		System.out.println("Número invertido: "+inve);
		input.close();
	}
}
