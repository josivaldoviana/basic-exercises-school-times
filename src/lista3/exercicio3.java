package lista3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int maior = 0;
		System.out.println("Digite os cinco números: ");
		
		for(int i = 0; i < 5; i++) {
			int numero = in.nextInt();
			maior = (numero > maior) ? numero : maior;
		}
		System.out.println("O maior foi "+maior);
	}

}
