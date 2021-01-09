package lista5;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[][] dados = new int[4][4];
		int soma = 0;;
		
		System.out.println("Informe os dados");
		for (int i = 0; i < dados.length; i++) {
			for (int j = 0; j < dados.length; j++) {
				dados[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < dados.length; i++) {
			for (int j = 0; j < dados.length; j++) {
				if(i==j) {
					soma +=  dados[i][j];
				}
			}
		}
		System.out.println("A soma da diagonal principal é "+ soma);
	}

}
