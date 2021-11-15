package br.com.generation.entrega;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double[][] n1 = new double[3][3];
		double soma = 0, somaD = 0;
		
		for(int x = 0; x < n1.length; x++) {
			for(int y = 0; y < n1[x].length; y++) {
				
				System.out.println("Digite um número: ");
				n1[x][y] = in.nextDouble();
				soma = soma + n1[x][y];
				
				if(x ==y) {
					somaD = somaD + n1[x][y];
				}
				
			}
		}
			
			System.out.println("A soma dos valores da matrix é: " + soma);
			System.out.println("\nE soma da diagonal é: "+ somaD);
			
			in.close();
	}

}