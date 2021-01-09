package lista3;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int ajudador = 1;
		
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d ", ajudador++);
				if(numero+1==ajudador) {
					break;
				}
			}
			System.out.println();
			if(numero+1==ajudador) {
				break;
			}
		}
	}

}
