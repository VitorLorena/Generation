package br.com.generation.entrega;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
	
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				
				System.out.println("Digite os valores de N1: ");
				n1[l][c] = scan.nextInt();
				
				System.out.println("Digite os valores de N2: ");
				n2[l][c] = scan.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.println("Matriz M1: " + m1[l][c]);
				System.out.println("Matriz M2: " + m2[l][c]);
			}
		}
		scan.close();
	}
}