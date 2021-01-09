package lista3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double nota1 = 0, nota2 = 0;
		
		System.out.println("Informe a quantidade de alunos: ");
		int quantidade = in.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.printf("Digite as notas do aluno %d:\n", i);
			nota1 += in.nextDouble();
			nota2 += in.nextDouble();
		}
		System.out.println("A média da turma foi: "+(nota1+nota2)/(quantidade*2));
	}

}
