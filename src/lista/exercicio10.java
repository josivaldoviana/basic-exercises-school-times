package lista;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual a dist�ncia em KM?");
		double distancia = in.nextDouble();
		
		System.out.println("Dist�ncia em KM = "+distancia);
		System.out.printf("%.1f km � equivalente a %.1f passos.", distancia, distancia/.00082);
	}

}
