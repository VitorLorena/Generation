package br.com.generation.repeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, soma = 0;
		
		do {
			System.out.println("digite um número... Ou digite 0 para sair.");
			i = in.nextInt();
			
				soma = soma + i;
				

		} while(i != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
		
		in.close();

	}

}