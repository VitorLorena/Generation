package br.com.generation.condicional;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, raiz, potencia;

        System.out.println("Escreva um n�mero: ");
        numero = scan.nextInt();

        if(numero % 2 == 0) {
            raiz = (int) Math.sqrt(numero);
            System.out.println("\nEste n�mero � par, e sua ra�z quadrada �: " + raiz);
        }
        if(numero % 2 != 0) {
            potencia = (int) Math.pow(numero, 2.0);
            System.out.println("\nEste num�ro � �mpar, e elevado ao quadrado �: " + potencia);
        }
    scan.close();
    }

}