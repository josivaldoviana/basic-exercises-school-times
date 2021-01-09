package lista4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		boolean ta = false;
		
		String[] nomes = new String[4];
		
		System.out.println("Digite os quatro nomes: ");
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = in.next();
		}
		System.out.println("Digite o nome que quer pesquisar: ");
		String pesquisar = in.next();
		
		for (int i = 0; i < nomes.length; i++) {
			ta = (((pesquisar).toLowerCase()).equals(nomes[i].toLowerCase())) ? true : false;
			if(ta) break;
		}
		if(ta) {
			System.out.printf("%s está entre os cadastrados.", pesquisar);
		}else {
			System.out.printf("%s não está entre os cadastrados.", pesquisar);
		}
	}

}
