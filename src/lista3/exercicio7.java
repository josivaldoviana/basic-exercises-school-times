package lista3;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite um n�mero: ");
		int numero = in.nextInt();
		
		for(int i=1; i <= numero; i++) {
			soma += i;
		}
		System.out.println("A soma dos n�meros foi igual a "+ soma);
	}

}
