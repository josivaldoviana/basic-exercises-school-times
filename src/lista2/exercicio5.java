package lista2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe as medidas dos tr�s lados: ");
		double lado1 = in.nextDouble();
		double lado2 = in.nextDouble();
		double lado3 = in.nextDouble();
		
		if(lado1==lado2 && lado3 == lado2) {
			System.out.println("Trata-se de um tri�ngulo equil�tero");
		}else if(lado1 == lado2 && lado3 != lado2 || lado1==lado3 && lado2 != lado1 || lado2==lado3 && lado3!=lado1){
			System.out.println("Trata-se de um tri�ngulo is�sceles");
		}else {
			System.out.println("Trata-se de um escaleno");
		}
	}

}
