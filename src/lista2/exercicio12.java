package lista2;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o dia da primeira data: ");
		int dia1 = in.nextInt();
		System.out.println("Digite o mês da primeira data: ");
		int mes1 = in.nextInt();
		System.out.println("Digite o ano da primeira data: ");
		int ano1 = in.nextInt();
		System.out.println("Digite o dia da segunda data: ");
		int dia2 = in.nextInt();
		System.out.println("Digite o mês da segunda data: ");
		int mes2 = in.nextInt();
		System.out.println("Digite o ano da segunda data: ");
		int ano2 = in.nextInt();
		
		if(ano2 < ano1) {
			System.out.printf("%d/%d/%d, %d/%d/%d", dia2, mes2, ano2, dia1, mes1, ano1);
		}else if(ano2==ano1) {
			if(mes2 < mes1) {
				System.out.printf("%d/%d/%d, %d/%d/%d", dia2, mes2, ano2, dia1, mes1, ano1);
			}else if(mes2==mes1) {
				if(dia2 < dia1) {
					System.out.printf("%d/%d/%d, %d/%d/%d", dia2, mes2, ano2, dia1, mes1, ano1);
				}else if(dia2 == dia1) {
					System.out.println("ai vamo ter que apelar para hora? sai fora");
					System.out.printf("%d/%d/%d, %d/%d/%d", dia1, mes1, ano1, dia2, mes2, ano2);
				}else {
					System.out.printf("%d/%d/%d, %d/%d/%d", dia1, mes1, ano1, dia2, mes2, ano2);
				}
			}else {
				System.out.printf("%d/%d/%d, %d/%d/%d", dia1, mes1, ano1, dia2, mes2, ano2);
			}
		}else {
			System.out.printf("%d/%d/%d, %d/%d/%d", dia1, mes1, ano1, dia2, mes2, ano2);
		}
	}

}
