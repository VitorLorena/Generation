package br.com.generation.colections;

public class EstoqueLoja {
	
	private String Produto;
	private double Validade;

	public EstoqueLoja(String produto, double validade) {
		super();
		this.Produto = produto;
		this.Validade = validade;
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public double getValidade() {
		return Validade;
	}

	public void setValidade(double validade) {
		Validade = validade;
	}

	@Override
	public String toString() {
		return "\n[Produto= " + Produto + ", Validade= " + Validade + "]";
	}

}
