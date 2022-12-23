package desafios.desafio3;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor da diferença: ");
		int k = sc.nextInt();
		System.out.print("Tamanho do array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int c = 0; c < arr.length; c++) {
			System.out.printf("Valor %d: ", c+1);
			arr[c] = sc.nextInt();
		}
		
		sc.close();
		
		
		int aux = 0, cont = 0;
		for (int c = 0; c < arr.length; c++) {
			if (c != 0) {
				int res = Math.abs(arr[c] - aux);
				if (res == k) 
					cont++;
			}
			
			aux = arr[c];
		}
		System.out.println(cont);
	}

}
