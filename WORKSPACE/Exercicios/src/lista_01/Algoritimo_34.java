package lista_01;

import java.util.Scanner;

public class Algoritimo_34 {

	public static void main(String[] args) {
		int numero, antecessor,sucessor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		
		System.out.println("O numero: "+numero+"\nO seu antecessor é: "+antecessor+"\nE seu sucessor é: "+sucessor);
		
		

	}

}
