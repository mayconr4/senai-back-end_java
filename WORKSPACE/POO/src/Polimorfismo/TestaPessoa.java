package Polimorfismo;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Pessoa usuario = new Pessoa("Huguinho","patapolis","huiguinho@gmail.com");
		Pessoa usuaria = new Pessoa("Lindinha");              
		
		
		System.out.println("\nDigite o seu nome: ");
		pessoa.setNome(ler.nextLine());
		
		  	System.out.println("Digite o seu endereço: ");
		pessoa.setEndereco(ler.nextLine());
		
		System.out.println("Digite o seu email");
		pessoa.setEmail(ler.nextLine());
		

		System.out.println("\nConfiguração alterada;"+
				"\nNome: "+pessoa.getNome()+
				"\nEndereço: "+pessoa.getEndereco()+
				"\nEmail: "+pessoa.getEmail());
		
		System.out.println("\nConfiguração alterada;"+
				"\nNome: "+usuario.getNome()+
				"\nEndereço: "+usuario.getEndereco()+
				"\nEmail: "+usuario.getEmail());   
		
		System.out.println("\nConfiguração alterada;"+
				"\nNome: "+usuaria.getNome());
	}
	
	

}
