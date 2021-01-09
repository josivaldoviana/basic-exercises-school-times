package lista5;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[][] matrizA = new int[2][2];
		int[][] matrizB = new int[2][2];
		int[][] matrizR = new int[2][2];
		
		
		System.out.println("Informe a matriz A 2 x 2:");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				matrizA[i][j] = in.nextInt();
			}
		}
		System.out.println("Informe a matriz B 2 x 2:");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				matrizB[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < matrizR.length; i++) {
			for (int j = 0; j < matrizR.length; j++) {
				matrizR[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		System.out.println("Matriz resultante:");
		for (int i = 0; i < matrizR.length; i++) {
			for (int j = 0; j < matrizR.length; j++) {
				System.out.printf("%d ",matrizR[i][j]);
			}
			System.out.println();
		}
	}

}
