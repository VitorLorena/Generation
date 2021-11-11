package br.com.generation.entrega;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] pont = new int[5];
		int mp = 0;
		
		for(int i = 0; i < pont.length; i++) {
			System.out.println("Digite a " + (i + 1) + "° pontuação: ");
			pont[i] = entrada.nextInt();
				if(pont[i] > mp) {
					mp = pont[i];
				}
		}
		
		System.out.println("\nA maior pontuação é: " + mp);
		
		entrada.close();
	}

}