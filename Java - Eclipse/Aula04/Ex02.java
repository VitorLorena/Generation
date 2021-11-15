package br.com.generation.entrega;

import java.util.Scanner;

public class Ex02 {
	
		
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
					
					int[] dado = new int[10];
			        int soma = 0, media = 0, maiorp = 0;

			        for(int i = 0; i < 10; i++){
			            System.out.println("Qual número o dado caiu da " + (i + 1) + " vez? ");
			            dado[i] = leia.nextInt();
			            soma = soma + dado[i];
			            media = soma / (i+1);

			            if(dado[i] == 0 || dado[i] >= 7){
			                System.out.println("Esse número não existe no dado. Faça novamente!");
			                
			            }
			            if(dado[i] == 6){
			                maiorp = maiorp + 1;
			            }
			            if(i == 9){
			            	System.out.println("\nA média dos dados sao: " + media);
			            	System.out.println("O dado caiu com o maior valor " + maiorp + " vezes");

			            }
		}
			            
			        leia.close();
	}

}