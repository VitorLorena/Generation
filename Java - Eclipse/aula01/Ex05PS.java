package br.com.generation.aula01;


/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2, 3 e 5,
respectivamente.*/

public class Ex05PS {

    public static void main(String[] args) {

        int nota1 = 2;
        int nota2 = 3;
        int nota3 = 5;
        double media;

            System.out.println("A primeira nota �: " + nota1);

            System.out.println("\nA segunda nota �: " + nota2);

            System.out.println("\nA terceira nota �: " + nota3);

            media = ((nota1 + nota2+ nota3) / 3.0);

            System.out.println("\nA m�dia do aluno �: " + media);

    }

}