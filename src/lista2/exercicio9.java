package lista2;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a velocidade permitida: ");
		double permitida = in.nextDouble();
		System.out.println("Informe a velocidade do motorista: ");
		double motorista = in.nextDouble();
		
		if(motorista/permitida <= 1) {
			System.out.println("N�o precisa pagar multa");
		}
		else if(motorista/permitida < 1.3) {
			System.out.println("(infra��o m�dia) multa de 85 reais");
		}else if(motorista/permitida < 1.6) {
			System.out.println("(infra��o grave) multa de 127 reais");
		}else if(motorista/permitida > 1.5) {
			System.out.println("(infra��o grav�ssima) multa de 574 reais");
		}else{
			System.out.println("Inv�lido");
		}
	}

}
