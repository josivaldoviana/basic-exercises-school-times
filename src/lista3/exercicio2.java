package lista3;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			if(i%2 != 0) {
				System.out.printf("%d, ",i);
			}
		}
		System.out.print("Impares");
	}

}
