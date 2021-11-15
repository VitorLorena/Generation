package br.com.generation.Ex06;

public class ContaBancaria {
	
	String banco;
	int conta;
	double saldo, retirada, saldoatual = 0.0;
	
	//METODOS
	void retira() {
		if(saldo >= retirada) {
			System.out.println("Você retirou " + retirada + " reais do banco");
			saldoatual = saldo - retirada;
		}
		else {
			System.out.println("Você não tem esse dinheiro para retirada.");
			saldoatual = saldo;
		}
	}
	
	//ESTADO
	void estado() {
		System.out.println("Nome do banco: " + this.banco);
		System.out.println("Número da conta: " + this.conta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Valor retirado: " + this.retirada);
		System.out.println("Saldo atual: " + this.saldoatual);
	}
}
