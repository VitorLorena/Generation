package br.com.generation.aula01;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

public class Ex01PS {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int dias, meses, anos, idade;

            System.out.println("Quantos anos você tem? ");
            anos = leia.nextInt();

            System.out.println("E meses? ");
            meses = leia.nextInt();

            System.out.println("E dias? ");
            dias = leia.nextInt();

            idade = (anos * 365) + (meses * 30) + dias;

            System.out.println("A sua idade em dias é: " + idade);

            leia.close();
    }

}