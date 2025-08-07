package Exemplo_01;

import java.util.Scanner;

public class Exemplo_input_01 {

	
	
	public static void main(String[] args) {
		int numero01;
		int numero02;
		int soma;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		numero01 = ler.nextInt();
		
		System.out.println("Digite outro numero");
		numero02 = ler.nextInt();
		
		soma = numero01 + numero02;
		
		System.out.println("A soma destes numeros é "+soma);                   	
		
	
		
	}
}
