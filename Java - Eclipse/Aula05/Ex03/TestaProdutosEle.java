package br.com.generation.Ex03;

public class TestaProdutosEle {

	public static void main(String[] args) {
		
		ProdutosEle p1 = new ProdutosEle();
		ProdutosEle p2 = new ProdutosEle();
		ProdutosEle p3 = new ProdutosEle();
		
		p1.Fabricante = "LG";
		p1.funcionando = true;
		p1.situacao = true;
		p1.estado();
		p1.usado();
		
		System.out.println("\n====================================\n");
		
		p2.Fabricante = "Philco";
		p2.funcionando = false;
		p2.situacao = false;
		p2.estado();
		p2.novo();
		
		System.out.println("\n====================================\n");
		
		p3.Fabricante = "Acer";
		p3.funcionando = true;
		p3.situacao = false;
		p3.estado();
		p3.novo();

	}

}