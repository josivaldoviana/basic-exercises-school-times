package lista;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("De quanto é seu salário?");
		float salario = in.nextFloat();
		
		System.out.println("Quantas horas vc trabalha por dia?");
		int horas = in.nextInt();
		
		System.out.printf("Considerando um mês de 30 dias, você recebe R$ %.2f reais por hora",
		salario/horas/30);
	}

}
