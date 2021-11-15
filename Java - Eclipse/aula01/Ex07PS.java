package br.com.generation.aula01;

import java.util.Scanner;

/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/

public class Ex07PS {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double a, b, c, d, e, f;
        double x,y;

            System.out.println("Qual é o valor de A: ");
            a = leia.nextDouble();
            System.out.println("Qual é o valor de B: ");
            b = leia.nextDouble();
            System.out.println("Qual é o valor de C: ");
            c = leia.nextDouble();
            System.out.println("Qual é o valor de D: ");
            d = leia.nextDouble();
            System.out.println("Qual é o valor de E: ");
            e = leia.nextDouble();
            System.out.println("Qual é o valor de F: ");
            f = leia.nextDouble();

            x =((c*e) - (b*f)) / ((a*e) - (b*d));
            y =((a*f) - (c*d)) / ((a*e) - (b*d));

            System.out.println("\nValor de X: " + x + "\nValor de Y: " + y);

            leia.close();
    }

}