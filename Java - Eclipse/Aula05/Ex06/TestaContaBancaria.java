package br.com.generation.Ex06;

public class TestaContaBancaria {
	
	public static void main(String[] args) {
		
	ContaBancaria c1 = new ContaBancaria();
	ContaBancaria c2 = new ContaBancaria();
	
	c1.banco = "Caixa";
	c1.conta = 1985;
	c1.saldo = 110.0;
	c1.retirada = 50.0;
	c1.retira();
	System.out.println("\n");
	c1.estado();
	
	System.out.println("\n=====================================\n");
	
	c2.banco = "itaú";
	c2.conta = 1993;
	c2.saldo = 20.0;
	c2.retirada = 50.0;
	c2.retira();
	System.out.println("\n");
	c2.estado();

	}

}
