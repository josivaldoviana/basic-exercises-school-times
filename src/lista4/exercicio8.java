package lista4;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String numero = "";
		
		System.out.println("Informe os 5 dígitos do número em binário: ");
		
		for (int i = 0; i < 5; i++) {
			char binario = in.next().charAt(0);
			numero+= binario;
		}
		System.out.printf("Na base decimal, esse número é %d", Integer.parseInt(numero,2));
	}

}
