package br.com.generation.Ex05;

public class Patinete {

	//ATRIBUTOS
	String marca;
	boolean Dobravel, Motorizado;
	
	//METODOS
	void moto() {
		if(Motorizado == true) {
			System.out.println("O patinete é motorizado.");
		}
		else {
			System.out.println("O patinete não é motorizado.");
		}
	}
	
	void dobra() {
		if(Dobravel == true) {
			System.out.println("O patinete é dobrável.");
		}	
		else {
			System.out.println("O patinete não é dobrável.");
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Marca: " + this.marca);
	}
	
}

