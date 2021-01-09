package lista4;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		System.out.println("Digite 10 números: ");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
		}
		System.out.print("ordem original: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		System.out.print("ordem inversa: ");
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i]+" ");
		}
	}

}
