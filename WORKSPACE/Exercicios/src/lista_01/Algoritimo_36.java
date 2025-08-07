package lista_01;

import java.util.Scanner;

public class Algoritimo_36 {

	public static void main(String[] args) {
		
		int numero_01,numero_02,soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero_01 = ler.nextInt();
		
		System.out.println("Digite um numero: ");
		numero_02 = ler.nextInt();
		
		soma = numero_01+numero_02;
		
		System.out.println("A soma destes dois numeros é: "+soma);
		
	}

}
