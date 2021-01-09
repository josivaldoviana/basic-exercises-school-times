package lista4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String[] nomes = new String[5];
		String[] numeros = new String[5];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("Digite o nome [%d]:",i+1);
			nomes[i] = in.next();
			System.out.printf("Digite o número [%d]:",i+1);
			numeros[i] = in.next();
		}
		
		int posicao = 0;
		while(true) {
			System.out.println("Digite uma posição: ");
			posicao = in.nextInt();
			if(posicao < -1 || posicao > 5) {
				System.out.println("Essa posição não é válida");
				System.out.println("Digite uma posição: ");
				posicao = in.nextInt();
			}
			if(posicao == -1) {
				System.out.println("FIM DE PROGRAMA");
				return;
			}
			System.out.printf("%s, %s\n", nomes[posicao-1], numeros[posicao-1]);
		}
	}

}
