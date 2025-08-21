package lista_01;

import java.util.Scanner;

public class Algoritimo_264 {

	public static void main(String[] args) {
		int soma = 0 ,media,numero,acm=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero Positivo: ");
		numero = ler.nextInt();
		
		while (true) {
			if (numero>=0) { 				
				
				soma = soma+numero;
				acm = acm+1;
			}else { 
				break;
				}
			System.out.println("Digite um numero Positivo: ");
			numero = ler.nextInt();
		}
		media = soma/acm;
		System.out.println("A média é: "+media);
		

	}

}
