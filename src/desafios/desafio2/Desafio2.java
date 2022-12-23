package desafios.desafio2;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		// trabalhar com dois arrays
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor: ");
		Double val =  sc.nextDouble();
		sc.close();
		int c100 = 0, c50 = 0, c20 = 0, c10 = 0, c5 = 0, c2 = 0;
		int m1 = 0, m05 = 0, m025 = 0, m010 = 0, m005 = 0, m001 = 0;
		
		while (val > 0) {
		
			if (val >= 100) {
				val -= 100;
				c100++;
			}
			else if (val >= 50) {
				val -= 50;
				c50++;
			}
			else if (val >= 20) {
				val -= 20;
				c20++;
			}
			else if (val >= 10) {
				val -= 10;
				c10++;
			}
			else if (val >= 5) {
				val -= 5;
				c5++;
			}
			else if (val >= 2) {
				val -= 2;
				c2++;
			}
			else if (val >= 1) {
				val--;
				m1++;
			}
			else if (val >= 0.5) {
				val -= 0.5;
				m05++;
			}
			else if (val >= 0.25) {
				val -= 0.25;
				m025++;
			}
			else if (val >= 0.1) {
				val -= 0.1;
				m010++;
			}
			else if (val >= 0.05) {
				val -= 0.05;
				m005++;
			}
			else if (val >= 0.01) {
				val -= 0.01;
				m001++;
			}
			else {
				val = 0.0;
			}
		}
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$100.00\n", c100);
		System.out.printf("%d nota(s) de R$50.00\n", c50);
		System.out.printf("%d nota(s) de R$20.00\n", c20);
		System.out.printf("%d nota(s) de R$10.00\n", c10);
		System.out.printf("%d nota(s) de R$5.00\n", c5);
		System.out.printf("%d nota(s) de R$2.00\n", c2);
		System.out.println("Moedas:");
		System.out.printf("%d moeda(s) de R$1.00\n", m1);
		System.out.printf("%d moeda(s) de R$0.50\n", m05);
		System.out.printf("%d moeda(s) de R$0.25\n", m025);
		System.out.printf("%d moeda(s) de R$0.10\n", m010);
		System.out.printf("%d moeda(s) de R$0.05\n", m005);
		System.out.printf("%d moeda(s) de R$0.01", m001);
		
	}

}
