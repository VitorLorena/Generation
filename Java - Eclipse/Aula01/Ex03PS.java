package br.com.generation.aula01;

import java.util.Scanner;

/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class Ex03PS {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int segundos, minutos, horas, segundo;

            System.out.println("Qual a dura��o do evento em segundos? ");
            segundos = leia.nextInt();

            horas = (segundos/3600);
            minutos = (segundos%3600)/60;
            segundo = (segundos%3600)%60;

            System.out.println("O evento tem: " + horas + " horas, " + minutos + " minutos e " + segundo + " segundos de dura��o.");

            leia.close();
    }

}