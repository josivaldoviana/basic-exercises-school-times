package lista4;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int ajudador = 1;
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("[%d] =", i+1);
			numeros[i] = in.nextInt();
		}
		for (int i = 0; i < numeros.length-1; i++) {
			if(numeros[9] == numeros[i]) {
				++ajudador;
			}
		}
		System.out.printf("%d foi lido %d vezes", numeros[9], ajudador);
	}

}
