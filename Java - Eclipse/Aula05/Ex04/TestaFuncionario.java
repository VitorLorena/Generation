package br.com.generation.Ex04;

public class TestaFuncionario {
	
	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "Giuliano";
		f1.idade = 45;
		f1.ANE = 20;
		f1.estado();
		f1.Aposentadoria();
		
		System.out.println("\n==========================================\n");
		
		f2.nome = "Roger Guedes";
		f2.idade = 25;
		f2.ANE = 5;
		f2.estado();
		f2.Promocao();
		
	}

}
