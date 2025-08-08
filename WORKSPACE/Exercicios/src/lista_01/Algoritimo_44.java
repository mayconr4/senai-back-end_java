package lista_01;

import java.util.Scanner;

public class Algoritimo_44 {

	public static void main(String[] args) {
		
		double num_01, base,exponiente, logaritimo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num_01 = ler.nextInt();
		
		System.out.println("Digite a base: ");
		base = ler.nextInt();
		
		
		
	exponiente = Math.pow(base, num_01);
	
	logaritimo = Math.log(exponiente);
	
	System.out.println("Logaritimo de "+exponiente+"\nè "+logaritimo);
		

	}

}
