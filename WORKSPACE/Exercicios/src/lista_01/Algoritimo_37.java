package lista_01;

import java.util.Scanner;

public class Algoritimo_37 {

	public static void main(String[] args) {
		int num_01,num_02,produto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num_01 = ler.nextInt();
		
		System.out.println("Digite um numero: ");
		num_02 = ler.nextInt();
		
		produto = num_01 * num_02;
		
		System.out.println("O produto destes dois numeros é: "+produto);

	}

}
