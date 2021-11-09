package br.com.generation.condicional;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite três número: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();


        if(num1 <= num2 && num2 <= num3) {
                System.out.println("A ordem crescente é : " + num1 + " " + num2 + " " + num3);
            }
        else if(num1 <= num2 && num3 <= num2) {
                System.out.println("A ordem crescente é: " + num1 + " " + num3 + " " + num2);
            }
        else if(num2 <= num1 && num1 <= num3) {
                System.out.println("A ordem crescente é: " + num2 + " " + num1 + " " + num3);
            }
        else if(num2 <= num3 && num3 <= num1) {
                System.out.println("A ordem crescente é: " + num2 + " " + num3 + " " + num1);
            }
        else if(num3 <= num1 && num1 <= num2) {
                System.out.println("A ordem crescente é: " + num3 + " " + num1 + " " + num2);
        }
        else {
                System.out.println("A ordem crescente é: " + num3 + " " + num2 + " " + num1);
            }
        entrada.close();
    }

}