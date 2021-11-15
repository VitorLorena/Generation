package br.com.generation.Ex07;

public class TestaPaciente {
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		p1.nome = "Willian";
		p1.idade = 33;
		p1.doença = "Febre.";
		p1.remedio = true;
		p1.estado();
		System.out.print("\n");
		p1.alta();
		
		System.out.println("\n=============================================\n");

		Paciente p2 = new Paciente();
		p2.nome = "Renato Augusto";
		p2.idade = 33;
		p2.doença = "Dor nas costas.";
		p2.remedio = false;
		p2.estado();
		System.out.print("\n");
		p1.alta();
	}

}
