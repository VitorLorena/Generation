package br.com.generation.Ex05;

public class Patinete {

	//ATRIBUTOS
	String marca;
	boolean Dobravel, Motorizado;
	
	//METODOS
	void moto() {
		if(Motorizado == true) {
			System.out.println("O patinete � motorizado.");
		}
		else {
			System.out.println("O patinete n�o � motorizado.");
		}
	}
	
	void dobra() {
		if(Dobravel == true) {
			System.out.println("O patinete � dobr�vel.");
		}	
		else {
			System.out.println("O patinete n�o � dobr�vel.");
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Marca: " + this.marca);
	}
	
}

