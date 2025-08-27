package Polimorfismo;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa("Docinho", "Rua Chesira maltauro", "docinho@gmail.com");
		System.out.println("Forma sem variavel"+
				"\nNome: "+pessoa.getNome()+
				"\nEndereço"+pessoa.getEndereco()+
				"\nEmail: "+pessoa.getEmail());
		
		
		System.out.println("\nDigite o seu nome: ");
		pessoa.setNome(ler.nextLine());
		
		
		System.out.println("Digite o seu endereço: ");
		pessoa.setEndereco(ler.nextLine());
		
		System.out.println("Digite o seu email");
		pessoa.setEmail(ler.nextLine());
		

		System.out.println("Configuração alterada;"+
				"\nNome: "+pessoa.getNome()+
				"\nEndereço"+pessoa.getEndereco()+
				"\nEmail: "+pessoa.getEmail());
	}

}
