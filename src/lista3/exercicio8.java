package lista3;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			fatorial*=i;
		}
		System.out.printf("%d! = %d", numero, fatorial);
	}

}
