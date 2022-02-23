import java.util.Scanner;
public class VetorSoma {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int i = 0, j = 0, a[], b[], c[];
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i ++) {
			System.out.println("Digite o" + (i+1) + "número da sequência 1: ");
			a[i] = in.nextInt();
		}
		for (i=0; i<TAM; i ++) {
			System.out.println("Digite o" + (i+1) + "número da sequência 2: ");
			b[i] = in.nextInt();
		}
		for (j=0; j<TAM; j ++) {
			for (i=0; i<TAM; i ++) {
				c[i] = a[i] + b[i];

			}
		}
		System.out.print("A somatória dos números é igual a: ");
		for (i=0; i<TAM; i ++) {
			System.out.print(c[i] + " ");
		}
	}

}
