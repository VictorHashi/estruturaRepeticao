package estruturaRepeticao;

import java.util.Iterator;
import java.util.Scanner;

public class Exe29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tab = 0;		
		int ini = 0;
		int fim = 0;
		
		System.out.print("\nImprimir tabuada no nº ");
		tab = scan.nextInt();
		
		do {
			
			if(ini>fim)
				System.out.println("O fim deve ser maior que o início");
			
			System.out.print("\nInício em: ");
			ini = scan.nextInt();
			System.out.print("\nFim em: ");
			fim = scan.nextInt();
			
		} while (ini>fim);
		
		for (int x = ini; x <= fim; x++) {
			System.out.println(tab +" x "+ x +" = "+ tab*x);
		}

	}

}
