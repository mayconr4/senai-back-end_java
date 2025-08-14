package lista_01;

import java.util.Scanner;

public class Algoritimo_103 {

	public static void main(String[] args) {
		int anoNascimento,anoAtual=2025,idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento");
		anoNascimento = ler.nextInt();
		
		idade = anoNascimento - anoAtual;
		
		System.out.println(idade);
		
		if(anoNascimento ==1905) {
			System.out.println("Para de mentir");
		}
		
		
		
		
		
		
	}

}
