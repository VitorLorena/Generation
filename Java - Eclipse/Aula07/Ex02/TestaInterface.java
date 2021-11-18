package br.com.generation.polimorfismo;

public class TestaInterface {

	public static void main(String[] args) {
		
		//Extends -----> pra herança
		//Implements --> pra usar interface
		
		
		Cachorro meuCachorro = new Cachorro();
		Cavalo meuCavalo = new Cavalo();
		Preguiça meuPreguiça = new Preguiça();
		
		meuCachorro.somAnimal();
		
		meuCavalo.somAnimal();
		
		meuPreguiça.somAnimal();
		
	}

}