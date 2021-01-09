package lista3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int ajudador = 0;
		
		System.out.println("Quantas pessoas?");
		int quantidade = in.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe seu sexo (f/m):");
			String resposta = in.next();
			System.out.println("Informe seu nome:");
			String nome = in.next();
			
			if(("f").equals((resposta).toLowerCase())){
				ajudador+=1;
				System.out.println("Bem vindo, sra. "+nome);
			}else {
				System.out.println("Bem vindo, sr. "+nome);
			}
		}
		System.out.println("Homens cumprimentados: "+ (quantidade-ajudador));
		System.out.println("Mulheres cumprimentadas: "+ (ajudador));
	}

}
