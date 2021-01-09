package lista3;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int fibo = 0;
		int nacci = 1;
		int ajudador = 0;
		
		System.out.println("Qual o valor de X? ");
		int valorX = in.nextInt();
		
		System.out.printf("%d, %d, ", fibo, nacci);
		for(int i = 0; i < valorX-2; i++) {
			int sequence = 0;
			
			ajudador = fibo+nacci;
			sequence = nacci;
			nacci = ajudador;
			fibo = sequence;
			
			System.out.printf("%d, ", ajudador);
		}
		System.out.print("Série de Fibonacci");
	}

}
