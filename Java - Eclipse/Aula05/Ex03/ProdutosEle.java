package br.com.generation.Ex03;

public class ProdutosEle {
	
	//Atributos
	String Fabricante;
	boolean funcionando, situacao;
	
	
	//METODOS
	
	void usado() {
		if(situacao == true && funcionando == true) {
			System.out.println("O produto � usado mas est� em perfeitas condi��es.");
		}
		
	}
	
	void novo() {
		if(situacao == false && funcionando == true) {
			System.out.println("O produto � novo e est� funcionando normalmente.");
		}
		else if(funcionando == false) {
			System.out.println("O produto n�o est� funcionando.");
		}
	}
	
	
	//ESTADO
	
	void estado() {
		
		System.out.println("Foi a " + this.Fabricante + " que fabricou o produto.");
		
	}
	
	
}