package lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String nome = in.next();
		
		System.out.println("Qual seu sexo?(m/f)");
		String sexo = in.next();
		
		System.out.println(
		("m").equals(sexo) ? "Bom dia, senhor "+nome : "Bom dia, senhora "+nome
		);
	}

}
