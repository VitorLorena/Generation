package br.com.generation.Ex07;

public class Paciente {
	
	//ATRIBUTOS
	String nome, doença;
	int idade;
	boolean remedio;
	
	
	//METODOS
	void alta() {
		if(remedio == true) {
			System.out.println("O paciente já foi medicado e está liberado.");
		}
		else {
			System.out.println("O paciente ainda não foi medicado, deve continuar esperando.");
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Paciente: " + this.nome);
		System.out.println("idade: " + this.idade);
		System.out.println("Porque estava no hospital? " + this.doença);
		
		
	}
}
