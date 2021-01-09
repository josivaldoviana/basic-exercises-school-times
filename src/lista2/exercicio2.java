package lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual sua primeira nota?");
		double nota = in.nextDouble();
		System.out.println("Qual sua segunda nota?");
		double nota2 = in.nextDouble();
		
		double media = (nota+nota2)/2;
		
		System.out.println((media >= 7) ? "Sua média foi "+media+"\nParabéns você foi aprovado!" 
		: "Sua média foi "+media+"\nInfelizmente, você não foi aprovado.");
	}

}
