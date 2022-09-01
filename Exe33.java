package estruturaRepeticao;

import java.util.Scanner;

public class Exe33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o valor da dívida: ");
		float divida = scan.nextInt();
		
		System.out.println("\nValor     Juros     Qtd Parcelas     Valor Parcela");
		System.out.println((divida *1)+"     "+(divida * 0)+"     1     "+ (divida/1));
		System.out.println((divida *1.1)+"     "+(divida * 0.1)+"     3     "+ (divida/3));
		System.out.println((divida *1.15)+"     "+(divida * 0.15)+"     6     "+ (divida/6));
		System.out.println((divida *1.2)+"     "+(divida * 0.2)+"     9     "+ (divida/9));
		System.out.println((divida *1.25)+"     "+(divida * 0.25)+"     12     "+ (divida/12));
	}

}
