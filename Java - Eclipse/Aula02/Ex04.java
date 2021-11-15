package br.com.generation.condicional;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, raiz, potencia;

        System.out.println("Escreva um número: ");
        numero = scan.nextInt();

        if(numero % 2 == 0) {
            raiz = (int) Math.sqrt(numero);
            System.out.println("\nEste número é par, e sua raíz quadrada é: " + raiz);
        }
        if(numero % 2 != 0) {
            potencia = (int) Math.pow(numero, 2.0);
            System.out.println("\nEste numéro é ímpar, e elevado ao quadrado é: " + potencia);
        }
    scan.close();
    }

}