import java.util.Scanner;

 public class SalLiquido {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aulas;
		float hora, desc, sal;
		System.out.println("Insira o valor da hora aula:");
		hora = input.nextFloat();
		System.out.println("Insira o número de aulas dadas: ");
		aulas = input.nextInt();
		System.out.println("Insira o percentual de desconto:");
		desc = input.nextFloat();
		sal = hora*aulas;
		sal = sal-(sal/100*desc);
		System.out.println(sal);
		input.close();
	}
}


