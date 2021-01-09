package lista4;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		System.out.println("Digite os 10 números: ");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			int array = 0;
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[i] < numeros[j]) {
					
				}else {
					array = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = array;
					
				}
			}
		}
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.printf("%d ", numeros[i]);
		}
	}

}
