package br.com.generation.Ex05;

public class TestaPatinete {
	
	public static void main(String[] args) {

		Patinete p1 = new Patinete();
		Patinete p2 = new Patinete();
		
		p1.marca = "volo";
		p1.Motorizado = false;
		p1.Dobravel = true;
		p1.estado();
		p1.moto();
		p1.dobra();
		
		System.out.println("\n===================================\n");
		
		p2.marca = "Bravus";
		p2.Motorizado = true;
		p2.Dobravel = false;
		p2.estado();
		p2.moto();
		p2.dobra();
			
		}

}
