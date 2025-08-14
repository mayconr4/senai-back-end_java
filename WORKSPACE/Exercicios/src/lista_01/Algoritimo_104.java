package lista_01;

import java.util.Scanner;

public class Algoritimo_104 {

	public static void main(String[] args) {
		
		String nome,sexo;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digte o seu sexo: ");
		sexo = ler.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		
		if(sexo == "feminino"   || sexo == "Feminino" && idade <25) {
			System.out.println(nome+" Aceita ");
		}else {
			System.out.println(nome+" Não aceita");
		}
		

	}

}
