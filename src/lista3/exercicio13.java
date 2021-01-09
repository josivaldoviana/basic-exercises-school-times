package lista3;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			if(i != 10) {
				System.out.printf("\n\n*******TABUADA DO %d COMPLETA*******\nPRÓXIMA\n\n",i);
			}else {
				System.out.printf("\n\n*******TABUADA DO %d COMPLETA*******\nFIM\n\n",i);
			}
		}
	}

}
