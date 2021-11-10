package br.com.generation.aula01;


/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5,
respectivamente.*/

public class Ex05PS {

    public static void main(String[] args) {

        int nota1 = 2;
        int nota2 = 3;
        int nota3 = 5;
        double media;

            System.out.println("A primeira nota é: " + nota1);

            System.out.println("\nA segunda nota é: " + nota2);

            System.out.println("\nA terceira nota é: " + nota3);

            media = ((nota1 + nota2+ nota3) / 3.0);

            System.out.println("\nA média do aluno é: " + media);

    }

}