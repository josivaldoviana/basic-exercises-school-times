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
		
		System.out.println((media >= 7) ? "Sua m�dia foi "+media+"\nParab�ns voc� foi aprovado!" 
		: "Sua m�dia foi "+media+"\nInfelizmente, voc� n�o foi aprovado.");
	}

}
