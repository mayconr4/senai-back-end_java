package lista_01;

import java.util.Scanner;

public class Algoritimo_107 {

	public static void main(String[] args) {
		
		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = ler.nextLine();
		char prenome = nome.charAt(4);
		
		if(nome.equals("JOSÉ")) {
			System.out.println(nome);
		}
		
		

	}

}
