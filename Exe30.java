package estruturaRepeticao;

import java.util.Scanner;

public class Exe30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cod = 0;
		int height = 0;
		int codAlto = 0;
		int altAlto = 0;
		int codBaixo = 0;
		int altBaixo = 0;
		int weight = 0;
		int codGordo = 0;
		int pesGordo = 0;
		int codMagro = 0;
		int pesMagro = 0;
		int somaAlt = 0;
		float mediaAlt = 0;
		int somaPes = 0;
		float mediaPes = 0;
		int contInteraction = 0;
		
		boolean firstExec = true;
		
		System.out.print("\nCodigo: ");
		cod = scan.nextInt();
		
		do {
					
			contInteraction++;
			
			System.out.println("\nAltura: ");
			height = scan.nextInt();
			somaAlt += height;
			
			if (height>altAlto) {
				altAlto = height;
				codAlto = cod;
			}
			if (height<altBaixo) {
				altBaixo = height;
				codBaixo = cod;
			}
			
			
			System.out.println("\nPeso: ");
			weight = scan.nextInt();
			somaPes += weight;
			
			if (weight>pesGordo) {
				pesGordo = weight;
				codGordo = cod;
			}
			if (weight<pesMagro) {
				pesMagro = weight;
				codMagro = cod;
			}
			
			if(firstExec) {
				altAlto = height;
				codAlto = cod;
				altBaixo = height;
				codBaixo = cod;
				pesGordo = weight;
				codGordo = cod;
				pesMagro = weight;
				codMagro = cod;
				
				firstExec = false;
			}			
			
			System.out.print("\nCodigo: ");
			cod = scan.nextInt();
			
			
		} while (cod != 0);
		
		mediaAlt = (float)somaAlt/(float)contInteraction;
		mediaPes = (float)somaPes/(float)contInteraction;
		
		System.out.println("Mais alto: "+ codAlto +" com "+ altAlto +"cm");
		System.out.println("Mais baixo: "+ codBaixo +" com "+ altBaixo +"cm");
		System.out.println("Mais pesado: "+ codGordo +" com "+ pesGordo +"kg");
		System.out.println("Mais leve: "+ codMagro +" com "+ pesMagro +"kg");
		System.out.println("Média de altura: "+ mediaAlt);
		System.out.println("Média de peso: "+ mediaPes);

	}

}
