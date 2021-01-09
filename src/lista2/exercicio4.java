package lista2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		
		System.out.println(
		numero%2==0 ? numero+" é par.": numero+" é impar"
		);
	}

}
