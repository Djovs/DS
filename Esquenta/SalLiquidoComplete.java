import java.util.Scanner;
public class SalLiquidoComplete {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aulas;
		
		float hora;
		double desc, sal;
		
		System.out.println("Insira o valor da hora de  aula:");
		hora = input.nextFloat();
		
		System.out.println("Insira o número das aulas dadas: ");
		aulas = input.nextInt();
		
		sal = hora*aulas;
		if(sal<=1212) {
			desc = 7.5;
		}else if(sal>=1212.01 && sal<=2427.35) {
			desc = 9;
		}else if(sal>=2427.36 && sal<=3641.03) {
			desc= 12;
		}else if(sal>=3641.04 && sal<=7087.22) {
			desc = 14;
		}else if(sal>=7087.23 && sal<=12136.79) {
			desc = 14.5;
		}else if(sal>=12136.80 && sal<=24273.57) {
			desc = 16.5;
		}else if(sal>=24273.58 && sal<=47333.46) {
			desc = 19;
		}else {
			desc = 22;
		}
		sal = sal-(sal/100*desc);
		System.out.println("Valor Liquido: "+sal);
		input.close();
	}
}
