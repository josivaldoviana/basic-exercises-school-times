package lista2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos quil�metros o carro percorre por litro?");
		double km = in.nextDouble();
		System.out.println("Quantos litros tem no carro atualmente?");
		int litros = in.nextInt();
		System.out.println("Qual dist�ncia (em Km) voc� deseja percorrer?");
		double distancia = in.nextDouble();
		
		double necessario = distancia/km;
		
		if(litros < necessario) {
			System.out.printf("Voc� precisa abastecer %.1f litros", necessario-litros);
		}else {
			System.out.println("Voc� n�o precisa abastecer");
		}
	}

}
