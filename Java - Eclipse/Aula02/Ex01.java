package br.com.generation.condicional;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3, maior;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = entrada.nextInt();

        maior = num1;

        if(num2 > maior) {
            maior = num2;
        }
        if(num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número digitado foi: " + maior);

        entrada.close();
    }
}