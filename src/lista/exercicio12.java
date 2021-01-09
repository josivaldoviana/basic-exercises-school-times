package lista;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o acumulado do dia?");
		double acumulo = in.nextDouble();
		
		double normal = acumulo*.55;
		double estudante = acumulo*.45;
		
		System.out.printf("Foram %.1f pagantes normais.\n", normal/30);
		System.out.printf("Foram %.1f estudantes.", estudante/15);
	}

}
