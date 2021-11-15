package br.com.generation.repeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, media = 0, soma = 0, numtotal = 0;
		
		do {
			System.out.println("digite um número... Ou digite 0 para sair.");
			i = in.nextInt();
			
			if(i % 3 == 0) {
				numtotal++;
				soma = soma + i;
				
				media = soma / numtotal;
			}

		} while(i != 0);
		
		System.out.println("A média dos valores multiplos de 3 é:  " + media);
		
		in.close();

	}

}