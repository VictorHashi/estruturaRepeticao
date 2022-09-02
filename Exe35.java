package estruturaRepeticao;

import java.util.Scanner;

public class Exe35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean finished = false;
		
		int cod = 0;
		int qtd = 0;
		float preco = 0;
		float total = 0;
		
		char answer = 'n';
		
		do {
			
			
			
			System.out.print("\nInforme o código do produto: ");
			cod = scan.nextInt();
			System.out.print("\nInforme a quantidade: ");
			qtd = scan.nextInt();
			
			switch (cod) {
			case 100: {
				preco = 1.2f;
				break;
			}
			case 101: {
				preco = 1.3f;
				break;
			}
			case 102: {
				preco = 1.5f;
				break;
			}
			case 103: {
				preco = 1.2f;
				break;
			}
			case 104: {
				preco = 1.3f;
				break;
			}
			case 105: {
				preco = 1.0f;
				break;
			}
			default:
				break;
			}
			
			total+= (preco*qtd);
			
			
			System.out.println("\nEncerrar pedido (S/N) ?");
			answer = scan.next().charAt(0);
			
			if (answer == 's') {
				finished = true;
			}
			
		} while (!finished);
		
		System.out.println("\nPreço final: "+total);
		
	}

}
