package lista4;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("[%d] = ", i+1);
			numeros[i] = in.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		media = soma/numeros.length;
		
		System.out.println("A média foi "+media);
	}

}
