package lista;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro item:");
		double preco1 = in.nextDouble();
		System.out.println("Digite o preço do segundo item:");
		double preco2 = in.nextDouble();
		System.out.println("Digite o preço do terceiro item:");
		double preco3 = in.nextDouble();
		System.out.printf("O total das compras foi %.2f reais\n", preco1+preco2+preco3);
		System.out.printf("O desconto vai ser de %.2f reais\n", (preco1+preco2+preco3)*.2);
		System.out.printf("O cliente deve pagar %.2f reais", (preco1+preco2+preco3)-(preco1+preco2+preco3)*.2);
	}

}
