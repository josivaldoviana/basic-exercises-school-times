package lista;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("------------******------------");
		System.out.println("PROGRAMA PARA ENCONTRAR RAÍZES");
		System.out.println("------------******------------");
		
		System.out.println("Digite na respectiva sequência o coeficiente de A, B e C");
		
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		
		float dentroRaiz = (b*b) - (4*a*c);
		double raiz = Math.sqrt(dentroRaiz);
		
		if(dentroRaiz > 0) {
			System.out.printf("As raízes da equação (%.1f)*x^2 + (%.1f)*x + (%.1f) são %.1f e %.1f.",a,b,
			c, (-b + raiz)/(2*a), (-b - raiz)/(2*a));
		}else if(dentroRaiz == 0){
			System.out.printf("A raíz da equação (%.1f)*x^2 + (%.1f)*x + (%.1f) é %.1f.",a,b,
			c, (-b + raiz)/(2*a));
		}else {
			System.out.println("Inválido");
		}
	}

}
