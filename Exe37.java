package estruturaRepeticao;

import java.util.Scanner;

public class Exe37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char gabarito[] = new char[10];
		char respostas[] = new char[10];
		char answer;
		
		int count = 0;
		int acertos = 0;
		int maxAcertos = 0;
		int minAcertos = 0;
		int somaNota = 0;
		float mediaNota = 0;
		
		boolean encerrar = false;
		
		for (int x = 0; x < gabarito.length; x++) {
			System.out.print("\nInforme a resposta correta da questão "+(x+1));
			gabarito[x] = scan.next().charAt(0);
		}
		
		while (!encerrar) {
			count++;
			for (int x = 0; x < respostas.length; x++) {
				if (respostas[x] == gabarito[x])
					acertos++;
			}
			
			somaNota += acertos;
			acertos = 0;
			
			if (acertos > maxAcertos)
				maxAcertos = acertos;
			
			if (count == 1 || acertos < minAcertos)
				minAcertos = acertos;
			
			System.out.print("\nEncerrar (S/N)?");
			answer = scan.next().charAt(0);
			
			if (answer == 's')
				encerrar = true;			
			
		}
		
		mediaNota = (float)somaNota/(float)count;
		
		System.out.println("Maior nota: "+maxAcertos);		
		System.out.println("Menor nota: "+minAcertos);
		System.out.println("Total de alunos: "+count);
		System.out.println("Média: "+ mediaNota);

	}

}
