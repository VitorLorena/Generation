package br.com.generation.aula01;

import java.util.Scanner;

/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/


public class Ex04PS {
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Escreva o Valor A: ");
		a = leia.nextInt();
		
		System.out.println("Escreva o Valor B: ");
		b = leia.nextInt();
		
		System.out.println("Escreva o Valor C: ");
		c = leia.nextInt();
		
		r = (int) Math.pow((a+b),2.0);//(a+b)*(a+b);
				
		s = (int) Math.pow((b+c),2.0);//(b+c)*(b+c);
		
		d = (r+s)/2;
		
		System.out.println("O resultado da expressão é: " + d);
		
		leia.close();
	}	
}