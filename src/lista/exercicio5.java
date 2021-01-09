package lista;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite aqui o comprimento do terreno(em metros): ");
		float comprimento = in.nextFloat();
		
		System.out.println("Digite aqui a largura do terreno(em metros): ");
		float largura = in.nextFloat();
		
		System.out.printf("A construção custará R$ %.2f", comprimento*largura*850);
	}

}
