package br.com.generation.repeticao;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade, sexo, muln = 0, homa = 0, carac, cal = 0;
		int ocal = 0, nerQ = 0, calde = 0, pes = 1;
		
		System.out.println("Digite os dados coletados na pesquisa: ");
		
		while(pes <= 150) {
		System.out.println("Qual a idade? ");
		idade = in.nextInt();
		System.out.println("Digite 1 se a pessoa é feminino.");
		System.out.println("Digite 2 se a pessoa é masculino.");
		System.out.println("Digite 3 se a pessoa é outros.");
		sexo = in.nextInt();
		System.out.println("Digite 1 se a pessoa é calma.");
		System.out.println("Digite 2 se a pessoa é nervosa.");
		System.out.println("Digite 3 se a pessoa é agressiva.");
		carac = in.nextInt();
		
		if(carac == 1){
			cal = cal + 1;
		}
		if(sexo == 1 && carac == 2) {
			muln = muln + 1;
		}
		if(sexo == 2 && carac == 3) {
			homa = homa + 1;
		}
		if(sexo == 3 && carac == 1) {
			ocal = ocal + 1;
		}
		if(idade >= 40 && carac == 2) {
			nerQ = nerQ + 1;
		}
		if(idade <= 18 && carac == 1) {
			calde = calde + 1;
		}
		pes++;
		
		}
		
		System.out.println("O número de pessoas calmas é: " + cal);
		System.out.println("O número de mulheres nervosas é: " + muln);
		System.out.println("O número de homens agressivos é: " + homa);
		System.out.println("O número de outros calmos é: " + ocal);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nerQ);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calde);
		
		in.close();
	}

}