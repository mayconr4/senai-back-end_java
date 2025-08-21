package lista_01;

import java.util.Scanner;

public class Algoritimo_263 {

	public static void main(String[] args) {
		int numero,acm=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero positivo: ");
		numero = ler.nextInt();
		
		while (true) {
			if (numero >=0) {
				acm = acm+=1;
			}else {
				break;
			}
			System.out.println("Digite um numero Positivo: ");
			numero = ler.nextInt();
			
		} 		
		System.out.println("Total de numeros Digitados: "+acm);
	}

}
