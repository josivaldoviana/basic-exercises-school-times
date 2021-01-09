package lista3;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int ajudador;
		
		System.out.println("População cidade A= ");
		int populacaoA = in.nextInt();
		
		System.out.println("Taxa de crescimento cidade A (%) =");
		double taxaA = in.nextDouble();
		
		System.out.println("População cidade B= ");
		int populacaoB = in.nextInt();
		
		System.out.println("Taxa de crescimento cidade B (%) =");
		double taxaB = in.nextDouble();
		
		if(taxaA == taxaB) {
			if(populacaoA == populacaoB) {
				System.out.println("As cidades estão crescendo iguais.");
			}
			else if(populacaoB > populacaoA) {
				System.out.println("A população da cidade A nunca ultrapassará a da cidade B");
			}else {
				System.out.println("A população da cidade B nunca ultrapassará a da cidade A");
			}
		}else {
			if(taxaA > taxaB) {
				ajudador=0;
				if(populacaoA == populacaoB) {
					while(populacaoA < populacaoB) {
						populacaoA *= (1+(taxaA/100));
						populacaoB *= (1+(taxaB/100));
						++ajudador;
					}
					System.out.printf("A população da cidade A ultrapassará a da cidade B em %d anos.", ajudador);
					
				}else if(populacaoB > populacaoA){
					ajudador=0;
					while(populacaoA < populacaoB) {
						populacaoA *= (1+(taxaA/100));
						populacaoB *= (1+(taxaB/100));
						++ajudador;
					}
					System.out.printf("A população da cidade A ultrapassará a da cidade B em %d anos.", ajudador);
				}else {
					System.out.println("A população da cidade B nunca ultrapassará a da cidade A");
				}
			}else {
				if(populacaoA == populacaoB) {
					ajudador=0;
					while(populacaoB < populacaoA) {
						populacaoA *= (1+(taxaA/100));
						populacaoB *= (1+(taxaB/100));
						++ajudador;
					}
					System.out.printf("A população da cidade B ultrapassará a da cidade A em %d anos.", ajudador);
					
				}else if(populacaoA > populacaoB){
					ajudador=0;
					while(populacaoB < populacaoA) {
						populacaoA *= (1+(taxaA/100));
						populacaoB *= (1+(taxaB/100));
						++ajudador;
					}
					System.out.printf("A população da cidade B ultrapassará a da cidade A em %d anos.", ajudador);
					
				}else {
					System.out.println("A população da cidade A nunca ultrapassará a da cidade B");
				}
			}
		}
	}

}
