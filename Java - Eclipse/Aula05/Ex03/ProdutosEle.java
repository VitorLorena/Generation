package br.com.generation.Ex03;

public class ProdutosEle {
	
	//Atributos
	String Fabricante;
	boolean funcionando, situacao;
	
	
	//METODOS
	
	void usado() {
		if(situacao == true && funcionando == true) {
			System.out.println("O produto é usado mas está em perfeitas condições.");
		}
		
	}
	
	void novo() {
		if(situacao == false && funcionando == true) {
			System.out.println("O produto é novo e está funcionando normalmente.");
		}
		else if(funcionando == false) {
			System.out.println("O produto não está funcionando.");
		}
	}
	
	
	//ESTADO
	
	void estado() {
		
		System.out.println("Foi a " + this.Fabricante + " que fabricou o produto.");
		
	}
	
	
}