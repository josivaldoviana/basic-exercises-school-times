package lista2;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual seu sexo? (M/F)");
		String sexo = in.next();
		System.out.println("Com que idade come�ou a contribuir?");
		int idade = in.nextInt();
		if(("M").equals((sexo).toUpperCase())) {
			System.out.println("Voc� s� ter� direito a se aposentar aos 65 anos.");
			if(65-idade < 30 && 65-idade > 24) {
				System.out.println("Com essa idade voc� ter� direito a 70% do benef�cio.");
			}else if(65-idade < 35 && 65-idade > 29){
				System.out.println("Com essa idade voc� ter� direito a 77,5% do benef�cio.");
			}else if(65-idade < 40 && 65-idade > 34) {
				System.out.println("Com essa idade voc� ter� direito a 87,5% do benef�cio.");
			}else if(65-idade >= 40) {
				System.out.println("Com essa idade voc� ter� direito a 100% do benef�cio.");
			}else {
				System.out.println("Inv�lido");
			}
			System.out.printf("Voc� precisa trabalhar at� os %d anos ter direito a todo o benef�cio.", idade+40);
		}else {
			System.out.println("Voc� s� ter� direito a se aposentar aos 62 anos.");
			if(62-idade < 30 && 62-idade > 24) {
				System.out.println("Com essa idade voc� ter� direito a 70% do benef�cio.");
			}else if(62-idade < 35 && 62-idade > 29){
				System.out.println("Com essa idade voc� ter� direito a 77,5% do benef�cio.");
			}else if(62-idade < 40 && 62-idade > 34) {
				System.out.println("Com essa idade voc� ter� direito a 87,5% do benef�cio.");
			}else if(62-idade >= 40) {
				System.out.println("Com essa idade voc� ter� direito a 100% do benef�cio.");
			}else {
				System.out.println("Inv�lido");
			}
			System.out.printf("Voc� precisa trabalhar at� os %d anos ter direito a todo o benef�cio.", 40+idade);
		}
	}

}
