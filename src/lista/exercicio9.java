package lista;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius?");
		int temperatura = in.nextInt();
		
		System.out.printf("C = %d\n", temperatura);
		System.out.printf("K = %d\n", temperatura+273);
		System.out.printf("F = %.1f", 1.8*temperatura+32);
	}

}
