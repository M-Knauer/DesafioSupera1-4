package desafios.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores serão digitados? ");
		Integer linhas = sc.nextInt();
		
		for (int c = 0; c < linhas; c++) {
			System.out.print("Valor: ");
			int val = sc.nextInt();
			
			if (val % 2 == 0) {
				pares.add(val);
			} else {
				impares.add(val);
			}
		}
		sc.close();
		
		pares.sort((n1, n2) -> n1.compareTo(n2));
		impares.sort((n1, n2) -> n2.compareTo(n1));
		
		List<Integer> allNumbers = new ArrayList<>();
		pares.forEach(n -> {allNumbers.add(n);});
		impares.forEach(n -> {allNumbers.add(n);});
		
		allNumbers.forEach(n -> {System.out.println(n);});
	}
}