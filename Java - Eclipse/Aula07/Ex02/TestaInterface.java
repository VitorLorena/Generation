package br.com.generation.polimorfismo;

public class TestaInterface {

	public static void main(String[] args) {
		
		//Extends -----> pra heran�a
		//Implements --> pra usar interface
		
		
		Cachorro meuCachorro = new Cachorro();
		Cavalo meuCavalo = new Cavalo();
		Pregui�a meuPregui�a = new Pregui�a();
		
		meuCachorro.somAnimal();
		
		meuCavalo.somAnimal();
		
		meuPregui�a.somAnimal();
		
	}

}