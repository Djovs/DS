import java.util.Scanner;
public class PrecodaVenda {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float valor, por, venda;
		String cont="Sim";
		while (! cont.equals("Nao")) {
			System.out.println("Coloque o valor do produto:");
			valor = input.nextFloat();
			System.out.println("Coloque o valor da margem de lucro:");
			por = input.nextFloat();
			por = por/100*valor;
			venda = valor+por;
			System.out.println("Valor de venda do produto: "+venda);
			System.out.println("Deseja continuar? (Sim/Não)?");
			cont = input.next();
		}
		input.close();
	}
}

