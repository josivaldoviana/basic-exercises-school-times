package lista2;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		int idade = in.nextInt();
		System.out.printf("maior de idade = %b", idade>=18);
	}

}
