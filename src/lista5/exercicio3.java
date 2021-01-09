package lista5;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		String[][] tabuleiro = new String[8][8];

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = "x";
			}
		}

		System.out.println("Qual a coluna inicial do bispo?");
		String coluna = in.next();

		System.out.println("Qual a linha inicial do bispo?");
		int linha = in.nextInt();

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				if(i- (linha-1) == (coluna(coluna)-1) - j || (coluna(coluna)-1) + i == (linha-1) + j) {
					tabuleiro[i][j] = "o";
				}
				if(j==(coluna(coluna)-1)  && i== (linha-1)) {
					tabuleiro[i][j] = "B";
				}
			}
		}

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				System.out.printf("%s ", tabuleiro[i][j]);
			}
			System.out.println();
		}
	}

	public static int coluna(String texto) {
		switch (texto) {
		case "a": {
			return 1;
		}
		case "b": {
			return 2;
		}
		case "c": {
			return 3;
		}
		case "d": {
			return 4;
		}
		case "e": {
			return 5;
		}
		case "f": {
			return 6;
		}
		case "g": {
			return 7;
		}
		case "h": {
			return 8;
		}
		default:
			return -1;
		}
	}

}
