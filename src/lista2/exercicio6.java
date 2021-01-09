package lista2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
		try{
			System.out.println("Qual seu peso?");
			 peso = in.nextDouble();
			
			System.out.println("Qual sua altura?");
			 altura = in.nextDouble();
			 imc = peso / (altura*altura);
			
		}catch(Exception e) {
			System.out.println("[ERRO]");
			System.out.println("Ao invés de usar o ponto como separador das casas decimais, tente usar vírgula");
			imc = 0;
		}
		
		if(imc < 1) {
			System.out.println("Inválido");
		}
		else if(imc < 17) {
			System.out.println("IMC = "+imc);
			System.out.println("Muito abaixo do peso");
		}else if(imc < 18.5) {
			System.out.println("IMC = "+imc);
			System.out.println("Abaixo do peso");
		}else if(imc < 25) {
			System.out.println("IMC = "+imc);
			System.out.println("Peso normal");
		}else if(imc < 30) {
			System.out.println("IMC = "+imc);
			System.out.println("Acima do peso");
		}else if(imc < 35) {
			System.out.println("IMC = "+imc);
			System.out.println("Obesidade I");
		}else if(imc < 40) {
			System.out.println("IMC = "+imc);
			System.out.println("Obesidade II (severa)");
		}else if(imc >= 40) {
			System.out.println("IMC = "+imc);
			System.out.println("Obesidade III (mórbida)");
		}
	}
}
