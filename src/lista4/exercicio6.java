package lista4;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int ajudador = 0;
		
		char[] vogais = new char[5];
		
		System.out.println("Digite as letras: ");
		for (int i = 0; i < vogais.length; i++) {
			vogais[i] = in.next().charAt(0);
		}
		for (int i = 0; i < vogais.length; i++) {
			if(vogais[i] == 'a' || vogais[i] == 'e' || vogais[i] == 'i' || vogais[i] == 'o' || vogais[i] == 'u') {
				ajudador++;
			}
		}
		System.out.printf("Foram lidas %d vogais\n", ajudador);
		System.out.print("As vogais estão nas posições: ");
		for (int i = 0; i < vogais.length; i++) {
			if(vogais[i] == 'a' || vogais[i] == 'e' || vogais[i] == 'i' || vogais[i] == 'o' || vogais[i] == 'u') {
				System.out.printf("%d ", i+1);
			}
		}
	}

}
