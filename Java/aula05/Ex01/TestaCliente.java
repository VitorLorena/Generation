package br.com.generation.Ex01;

public class TestaCliente {

	public static void main(String[] args) {
		
		//Instanciar o objeto
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c1.nome = "Leonardo";
		c1.cadastro = "3091";
		c1.idade = 19;

		c2.nome = "Fagner";
		c2.cadastro = "2389";
		c2.idade = 32;
		
		c3.nome = "Romero";
		c3.cadastro = "1111";
		c3.idade = 29;
		
		System.out.println("Nome do cliente: " + c1.nome);
		System.out.println("Cadastro do cliente: " + c1.cadastro);
		System.out.println("Idade do cliente: " + c1.idade);
		c1.comprar();
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Nome do cliente: " + c2.nome);
		System.out.println("Cadastro do cliente: " + c2.cadastro);
		System.out.println("Idade do cliente: " + c2.idade);
		c1.pagar();
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Nome do cliente: " + c3.nome);
		System.out.println("Cadastro do cliente: " + c3.cadastro);
		System.out.println("Idade do cliente: " + c3.idade);
		c1.atendimento();
		
	}

}
