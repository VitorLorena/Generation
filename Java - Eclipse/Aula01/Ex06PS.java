package br.com.generation.aula01;

import java.util.Scanner;

/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles.*/

public class Ex06PS {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double x1, x2, y1, y2;
		double a, b, total;
		
		System.out.println("Digite o primeiro ponto X: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o primeiro ponto Y: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o segundo ponto X: ");
		x2 = leia.nextDouble(); 
		
		System.out.println("Digite o segundo ponto Y: ");
		y2 = leia.nextDouble();
		
		a = Math.pow((x2 - x1), 2);
		b = Math.pow((y2 - y1), 2);
		
		total = Math.sqrt((a + b));
		
		System.out.println("O resultado do calculo �: " + total);
		
		leia.close();
		

	}

}