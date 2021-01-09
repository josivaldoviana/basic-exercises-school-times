package lista4;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		System.out.println("Digite 10 números: ");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
		}
		
		System.out.println("Esolha uma posição(1 a 10): ");
		int posicao1 = in.nextInt();
		System.out.println("Esolha outra posição(1 a 10): ");
		int posicao2 = in.nextInt();
		
		System.out.printf("%d + %d = %d\n", numeros[posicao1-1], numeros[posicao2-1], numeros[posicao1-1]+numeros[posicao2-1]);
		System.out.printf("%d - %d = %d\n", numeros[posicao1-1], numeros[posicao2-1], numeros[posicao1-1]-numeros[posicao2-1]);
		System.out.printf("%d * %d = %d\n", numeros[posicao1-1], numeros[posicao2-1], numeros[posicao1-1]*numeros[posicao2-1]);
		System.out.printf("%d / %d = %.2f\n", numeros[posicao1-1], numeros[posicao2-1], (double)numeros[posicao1-1]/numeros[posicao2-1]);
		System.out.printf("%d ^ %d = %.2f\n", numeros[posicao1-1], numeros[posicao2-1], java.lang.Math.pow(numeros[posicao1-1], numeros[posicao2-1]));
		
	}

}
