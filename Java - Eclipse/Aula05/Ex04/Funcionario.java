package br.com.generation.Ex04;

public class Funcionario {
	
	//ATRIBUTOS
	String nome;
	int ANE, idade;
	
	
	//METODOS
	void Aposentadoria() {
		if(ANE >= 20) {
			System.out.println("O funcionário já pode se aponsetar.");
		}
	}
	
	void Promocao() {
		if(ANE >= 5) {
			System.out.println("O funcionário será promovido.");
		}
	}
	
	
	//ESTADO
	void estado() {
		System.out.println("Funcionário: " + this.nome);
		System.out.println("Idade do funcionário: " + this.idade);
		System.out.println("Anos que o funcionario está na empresa: " + this.ANE);
		
	}
	
}