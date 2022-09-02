-package estruturaRepeticao;

import java.util.Iterator;
import java.util.Scanner;

public class Exe36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int candidato[] = new int[6];
		
		boolean finished = false;
		
		int voto = 0;
		int count = 0;
		
		while (!finished) {
			
			System.out.println("\nInforme seu voto");
			voto = scan.nextInt();
			count++;
			
			switch (voto) {
			case 0:{
				finished = true;
			}
			case 1: {
				candidato[0]++;
				
			}
			case 2: {
				candidato[1]++;
				
			}
			case 3: {
				candidato[2]++;
				
			}
			case 4: {
				candidato[3]++;
				
			}
			case 5: {
				candidato[4]++;
				
			}			
			
			default:
				candidato[5]++;
			}
			
		}
		
		for (int x = 0; x < candidato.length-2; x++) {
			System.out.println("Candidato "+ x + ": "+ candidato[x]);			
		}
		
		System.out.println("Nulos: "+ candidato[4]+"("+((float)candidato[4]/(float)count)+"%)");
		System.out.println("Branco: "+ candidato[5]+"("+((float)candidato[5]/(float)count)+"%)");
		
	}

}
