package lista2;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int prejuizo = 0;
		
		System.out.println("Voc� planeja beber? (v/f)");
		String beber = in.next();
		System.out.println("Voc� planeja comer? (v/f)");
		String comer = in.next();
		System.out.println("Voc� planeja contratar transporte? (v/f)");
		String transporte = in.next();
		System.out.println("Quantas pessoas sair�o com voc�?");
		int pessoas = in.nextInt();
		
		if(("v").equals(beber)) {
			prejuizo+=80;
		}
		if(("v").equals(comer)) {
			prejuizo+=60;
		}
		if(("v").equals(transporte)) {
			prejuizo+=15;
		}
		if(pessoas < 1) {
			pessoas = 1;
		}
		System.out.printf("O gasto estimado da noite � %d reais.", prejuizo*pessoas);
	}

}
