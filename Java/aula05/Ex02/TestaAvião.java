package br.com.generation.Ex02;

public class TestaAvião {

	public static void main(String[] args) {
		
		Avião aviao1 = new Avião();
		
		
		aviao1.empresa = "Dornier GmbH";
		aviao1.modelo = "Domier 228";
		aviao1.quantLugares = 19;
		aviao1.voar(413);
		
		System.out.println("O nome da empresa é: " + aviao1.empresa);
		System.out.println("O Modelo é: " + aviao1.modelo);
		System.out.println("A quantidade de Lugares: " + aviao1.quantLugares);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Velocidade máxima: " + aviao1.velocidade + "Km/h");
		
		aviao1.pousar(62);
		System.out.println("Velocidade de cruzeiro: " + aviao1.velocidade + "Km/h");
	}

}