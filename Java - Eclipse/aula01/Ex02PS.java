package br.com.generation.aula01;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

public class Ex02PS {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int dias, meses, anos, dia;

            System.out.println("Qual a sua idade em dias? ");
            dias = leia.nextInt();

            anos = (dias/365);
            meses = (dias%365)/30;
            dia = (dias%365)%30;

            System.out.println("Você tem: " + anos + " anos, " + meses + " meses e " + dia + " dias de idade.");

            leia.close();
    }

}