package lista;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		float nota1 = in.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		float nota2 = in.nextFloat();
		System.out.println("Digite sua teceira nota: ");
		float nota3 = in.nextFloat();
		
		System.out.printf("Sua média foi %.2f pontos", (nota1+nota2+nota3)/3);
	}

}
