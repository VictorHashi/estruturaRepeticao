package estruturaRepeticao;

import java.util.Scanner;

public class Exe32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int interactions = 5;
		int cod = 0;
		int numVei = 0;
		int numAcid = 0;
		int somaAcid = 0;
		float mediaAcid = 0;
		int cont2000 = 0;
		int maxAcid = 0;
		int maxAcidCod = 0;
		int minAcid = 0;
		int minAcidCod = 0;
		int somaVei = 0;
		float mediaVei = 0;
		
		for (int x = 0; x < interactions; x++) {
					
			System.out.print("\nCódigo: ");
			cod = scan.nextInt();
			System.out.print("\nVeículos de passeio: ");
			numVei = scan.nextInt();
			System.out.print("\nAcidentes: ");
			numAcid = scan.nextInt();
			
			somaVei += numVei;
			
			if (x == 0) {
				maxAcid = numAcid;
				maxAcidCod = cod;
				minAcid = numAcid;
				minAcidCod = cod;
			}
			
			if (numAcid > maxAcid) {
				maxAcid = numAcid;
				maxAcidCod = cod;
			}
			
			if (numAcid < minAcid) {
				minAcid = numAcid;
				minAcidCod = cod;
			}
			
			if (numVei>=2000) {
				somaAcid+=numAcid; 
				cont2000++;
			}
			
		}
		
		mediaVei = (float)somaVei/(float)interactions;
		mediaAcid = (float)somaAcid/(float)cont2000;
		
		System.out.println("Maior índice de acidentes na cidade "+ maxAcidCod +" com "+ maxAcid +" acidentes");
		System.out.println("Menor índice de acidentes na cidade "+ minAcidCod +" com "+ minAcid +" acidentes");
		System.out.println("Média de "+ mediaVei +" veiculos por cidade");
		System.out.println("Media de acidentes em cidades grandes: "+ mediaAcid);

	}

}
