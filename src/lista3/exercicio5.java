package lista3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		int ajudador =0;
		
		for(int i=1; i<=numero;i++) {
			if(numero%i == 0) {
				ajudador+=1;
			}
		}
		if(ajudador==2) {
			System.out.println(numero+" EH PRIMO");
		}else {
			System.out.println(numero+" NÃO EH PRIMO");
		}
	}

}
