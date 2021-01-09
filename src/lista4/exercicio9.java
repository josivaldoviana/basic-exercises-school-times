package lista4;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int ajudador = 0;
		
		int[] numeros = new int[5];
		
		System.out.println("Informe até 10 números");
		
		int numero = 0;
		
		while(numero != -1){
			
			numero = in.nextInt();
			
			if(numero != -1) {
				
				numeros[ajudador] = numero;
				++ajudador;
				
				if(ajudador == numeros.length) {
					System.out.println("[LIMITE]Quer adicionar outro?(s/n)");
					String resposta = in.next();
					if(("s").equals((resposta).toLowerCase())){
						int[] data = new int[5];
						data = numeros;
						numeros = new int[10];
						for (int i = 0; i < data.length; i++) {
							numeros[i] = data[i];
						}
					}else {
						break;
					}
				}
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}
		System.out.println("\ntamanho do array: "+ numeros.length);
	}

}
