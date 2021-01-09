package lista2;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		int idade = in.nextInt();
		
		if(idade < 19 || idade > 69) {
			System.out.println("Infelizmente vc não pode ser um doador.");
		}else {
			System.out.println("Qual seu peso?");
			int peso = in.nextInt();
			
			if(peso < 50) {
				System.out.println("Infelizmente vc não pode ser um doador.");
			}else {
				System.out.println("Você fez alguma tatuagem no último ano? (VERDADEIRO ou FALSO).");
				String tatuagem = in.next();
				
				if(("VERDADEIRO").equals((tatuagem).toUpperCase())) {
					System.out.println("Infelizmente vc não pode ser um doador.");
					
				}else {
					System.out.println("Você ingeriu álcool nas últimas horas? (VERDADEIRO ou FALSO).");
					String alcool = in.next();
					
					if(("VERDADEIRO").equals((alcool).toUpperCase())) {
						System.out.println("Infelizmente vc não pode ser um doador.");
					}else {
						System.out.println("Parabéns, você pode doar sangue.");
					}
				}
			}
		}
	}

}
