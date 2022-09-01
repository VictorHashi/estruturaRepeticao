package estruturaRepeticao;

import java.util.Scanner;

public class Exe34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int count100 = 0;
		int count75 = 0;
		int count50 = 0;
		int count25 = 0;
		
		do {
			
			System.out.print("\nNúmero: ");
			num = scan.nextInt();
			
			if (num < 100) {
				if (num > 75) {
					count100++;
				}else {
					if (num > 50) {
						count75++;
					}else {
						if (num > 25) {
							count50++;
						}else {
							count25++;
						}
					}
				}
			}
			
		} while (num >= 0);
		
		System.out.println("0-25: " + count25);
		System.out.println("26-50: " + count50);
		System.out.println("51-75: " + count75);
		System.out.println("76-200: " + count100);

	}

}
