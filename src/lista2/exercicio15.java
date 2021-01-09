package lista2;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double media = 0;
		
		System.out.println("Informe as três notas: ");
		try {
			
			double nota = in.nextDouble();
			double nota2 = in.nextDouble();
			double nota3 = in.nextDouble();
			
			media = (nota+nota2+nota3)/3;
		}catch(Exception e) {
			System.out.println("[ERROR]");
			System.out.println("Ao invés de usar ponto como separação das casas decimais, use vírgula");
			media = 0;
		}
		
		System.out.printf("Sua média foi %.1f.\n", media);
		if(media < 4) {
			System.out.println("Você foi reprovado");
		}else if(media >= 7) {
			System.out.println("Você foi aprovado");
		}
		else {
			System.out.println("Você precisa de "+notaFinal(media));
		}
	}
	public static double notaFinal(double valor) {
		return (5-valor*.6)/.4;
	}
}
