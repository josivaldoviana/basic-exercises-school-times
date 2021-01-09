package lista2;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite os três números: ");
		int primeiro = in.nextInt();
		int segundo = in.nextInt();
		int terceiro = in.nextInt();
		
		int ajudador = 0;
		
		if(terceiro < segundo) {
			ajudador = terceiro;
			terceiro = segundo;
			segundo = ajudador;
			ajudador = 0;
		}
		if(segundo < primeiro) {
			ajudador = segundo;
			segundo = primeiro;
			primeiro = ajudador;
			ajudador = 0;
		}
		if(terceiro < segundo) {
			ajudador = terceiro;
			terceiro = segundo;
			segundo = ajudador;
		}
		
		System.out.printf("%d, %d, %d",primeiro, segundo, terceiro);
	}

}
