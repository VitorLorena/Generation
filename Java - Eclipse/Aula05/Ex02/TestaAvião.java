package br.com.generation.Ex02;

public class TestaAvi�o {

	public static void main(String[] args) {
		
		Avi�o aviao1 = new Avi�o();
		
		
		aviao1.empresa = "Dornier GmbH";
		aviao1.modelo = "Domier 228";
		aviao1.quantLugares = 19;
		aviao1.voar(413);
		
		System.out.println("O nome da empresa �: " + aviao1.empresa);
		System.out.println("O Modelo �: " + aviao1.modelo);
		System.out.println("A quantidade de Lugares: " + aviao1.quantLugares);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Velocidade m�xima: " + aviao1.velocidade + "Km/h");
		
		aviao1.pousar(62);
		System.out.println("Velocidade de cruzeiro: " + aviao1.velocidade + "Km/h");
	}

}