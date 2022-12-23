package desafios.desafio4;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de palavras: ");
		int linhas = sc.nextInt();
		sc.nextLine();
		for (int c = 0; c < linhas; c++) {
			System.out.print("Palavra: ");
			String encript = sc.nextLine().toUpperCase();
				 
			StringBuilder descript = new StringBuilder();
			
			descript.append(encript.substring(encript.length()/2));
			descript.append(encript.substring(0, encript.length()/2));
			
			System.out.println(descript.reverse());
		}
		
		sc.close();
		
	}
}
