package br.com.generation.Ex04;

public class Funcionario {
	
	//ATRIBUTOS
	String nome;
	int ANE, idade;
	
	
	//METODOS
	void Aposentadoria() {
		if(ANE >= 20) {
			System.out.println("O funcion�rio j� pode se aponsetar.");
		}
	}
	
	void Promocao() {
		if(ANE >= 5) {
			System.out.println("O funcion�rio ser� promovido.");
		}
	}
	
	
	//ESTADO
	void estado() {
		System.out.println("Funcion�rio: " + this.nome);
		System.out.println("Idade do funcion�rio: " + this.idade);
		System.out.println("Anos que o funcionario est� na empresa: " + this.ANE);
		
	}
	
}