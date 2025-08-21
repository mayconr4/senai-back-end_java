package lista_01;

import java.util.Scanner;

public class Algoritimo_265 {

	public static void main(String[] args) {
		int acm=0,numeros;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numeros = ler.nextInt();
		
		while (true) {
			if (numeros == 0) {      
				
				break;
			}else if(numeros>=100 && numeros<=200) {
				acm= acm+1;
			}
			System.out.println("Digite um numero : ");
			numeros = ler.nextInt();
		}
		System.out.println("Foram digitados : "+acm);
		
	}

}
