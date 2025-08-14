package lista_01;

import java.util.Scanner;

public class Algoritimo_102 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if (numero >20) {
			System.out.println("é maior que 20");
		} else if(numero ==20) {
			System.out.println("é Igual que 20");
		}else {
			System.out.println("é menor que 20");
		}

	}

}
