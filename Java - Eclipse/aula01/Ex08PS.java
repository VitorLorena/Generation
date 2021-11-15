package br.com.generation.aula01;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

public class Ex08PS {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int fabrica, consumidor;

            System.out.println("Qual o custo de fábrica do carro é? ");
            fabrica = leia.nextInt();

            consumidor = ((fabrica / 100) * 28) + ((fabrica / 100) * 45) + fabrica;

            System.out.println("Então o valor do carro é: " + consumidor);

            leia.close();
    }

}