package br.com.generation.repeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int idade = 0, menor = 0, maior = 0;

	while(idade != -99) {
		System.out.println("Digite a sua idade: ");
		idade = in.nextInt();
		
		if(idade < 21 && idade >= 0) {
			menor = menor + 1;
		}
		else if(idade > 50) {
			maior = maior + 1;
		}
	}
	System.out.println(menor + " Pessoas tem menos de 21 anos");
	System.out.println(maior + " Pessoas tem mais de 50 anos");
	
	
		in.close();
	}

}
