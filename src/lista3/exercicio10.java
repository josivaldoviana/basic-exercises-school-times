package lista3;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual a medida da base?");
		int base = in.nextInt();
		System.out.println("Qual a medida da altura?");
		int altura = in.nextInt();
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
