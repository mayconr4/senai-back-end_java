package lista_01;

import java.util.Scanner;

public class Algoritimo_106 {

	public static void main(String[] args) {
		
		String nome;
		
		
		Scanner ler =   new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = ler.nextLine();
		char primeiraLetra = nome.charAt(0);

		
		
		if(primeiraLetra == 'A' || primeiraLetra == 'a') {
			System.out.println(nome);
		}
		
		
		
	}

}
