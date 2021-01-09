package lista;

import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome aqui:");
		String primeiroNome = in.next();
		
		System.out.println("Digite seu segundo nome aqui:");
		String segundoNome = in.next();
		
		System.out.printf("%s, %s", segundoNome, primeiroNome);
	}
}
