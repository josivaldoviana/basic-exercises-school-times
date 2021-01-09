package lista;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("------------******------------");
		System.out.println("PROGRAMA DO VERDADEIRO OU FALSO");
		System.out.println("------------******------------");
		
		System.out.println("O Brasil é o país mais populoso do mundo.\nIsso é: ");
		String resposta = in.next();
		
		System.out.println("2+2*2 = 6\nIsso é: ");
		String resposta2 = in.next();
		
		System.out.println("Programar é divertido.\nIsso é: ");
		String resposta3 = in.next();
		
		System.out.println("Gabarito: falso, verdadeiro, verdadeiro.");
		System.out.printf("Suas respostas: %s, %s, %s.", resposta, resposta2, resposta3);
	}

}
