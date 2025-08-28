package Metodos;

import java.util.Scanner;

public class UsandoMetodos {
	// variavel de escopo global
	 String endereco;  
	 String nome;
	 double total; 

	public void solicitar() {
		System.out.println("vazio sem parametro: ");
		//Variavel de escopo local
		String nome;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um nome:");
		nome = ler.nextLine();
		System.out.println(nome);
		System.out.println("=============================");
	}
	
	public void solicitar(String endereco) {
		//Variavel de escopo local
		System.out.println("vazio com parametro: ");
				String nome;
				this.endereco = endereco;
				Scanner ler = new Scanner(System.in);
				System.out.println("Digite um nome:");
				nome = ler.nextLine();
				System.out.println(nome);
				System.out.println(this.endereco);
				System.out.println("==================");
	}
	
	public String devolver(String endereco) {
		System.out.println("Com retorno de String variavel global");
		this.endereco = endereco;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um endereco: ");
		endereco = ler.nextLine();		
		return this.endereco;
	}
	
	public double total(double n1, double n2) {
		double total;
		this.total = n1/n2;
		return this.total;
	}
	
	public double total(double n1, double n2, double n3) {
		double total;
		this.total = (n1+n2+n3)/3;
		return this.total;
	}

}
