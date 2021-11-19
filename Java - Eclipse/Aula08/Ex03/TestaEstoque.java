package br.com.generation.colections;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {

			
			EstoqueLoja el1 = new EstoqueLoja("Ervilha", 03.22);
			EstoqueLoja el2 = new EstoqueLoja("Milho", 04.22);
			EstoqueLoja el3 = new EstoqueLoja("Azeitona", 05.22);
			
			ArrayList<EstoqueLoja> EstoqueLoja = new ArrayList();	
			EstoqueLoja.add(el1);
			EstoqueLoja.add(el2);
			EstoqueLoja.add(el3);
			
			System.out.println(EstoqueLoja);

	}

}
