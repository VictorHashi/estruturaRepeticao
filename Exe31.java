package estruturaRepeticao;

import java.util.Scanner;

public class Exe31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int interactions = 10;
		int cod = 0;
		int height = 0;
		int codAlto = 0;
		int altAlto = 0;
		int codBaixo = 0;
		int altBaixo = 0;
		
		boolean firstInteraction = true;
		
		for (int x = 0; x < interactions; x++) {
			
			System.out.print("\nCódigo: ");
			cod = scan.nextInt();
			System.out.print("\nAltura: ");
			height = scan.nextInt();
			
			if (firstInteraction) {
				 codAlto = cod;
				 altAlto = height;
				 codBaixo = cod;
				 altBaixo = height;
				 
				 firstInteraction = false;
			}
			
			if (height > altAlto) {
				codAlto = cod;
				altAlto = height;
			}
			if (height < altBaixo) {
				codBaixo = cod;
				altBaixo = height;
			}
			
		}
		
		System.out.println("Mais alto: "+ codAlto +" com "+ altAlto +"cm");
		System.out.println("Mais baixo: "+ codBaixo +" com "+ altBaixo +"cm");

	}

}
