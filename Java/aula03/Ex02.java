package br.com.generation.repeticao;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
		int n , par = 0, impar = 0, i = 10, num;
		
		for(n = 1; n <= i; n++) {
			System.out.println("Digite um numero: ");
			num = in.nextInt();
			
			if(num % 2 == 0) {
				par = par + 1;	
			}
			if(num % 2 != 0) {
				impar = impar + 1;
			}
		}
		
		System.out.println("A sequencia tem: " + par + " numeros pares.");
		System.out.println("A sequencia tem: " + impar + " numeros impares.");
		
		in.close();
	}
}