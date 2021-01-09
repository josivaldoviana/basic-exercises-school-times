package lista;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos pedreiros estão disponíveis?");
		int disponiveis = in.nextInt();
		
		double horas = 8*72/disponiveis;
		
		System.out.printf("Os %d pedreiros levam %.1f horas para terminar o muro.", disponiveis, horas);
	}

}
