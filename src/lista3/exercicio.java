package lista3;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double soma = in.nextDouble();
		System.out.println("Quer fornecer outro?(s/n)");
		String resposta = in.next();
		
		while(("s").equals((resposta).toLowerCase())) {
			System.out.println("Digite um n�mero: ");
			soma += in.nextDouble();
			System.out.println("Quer fornecer outro?(s/n)");
			resposta = in.next();
		}
		
		System.out.println("A soma dos n�meros � "+ soma);
	}

}
