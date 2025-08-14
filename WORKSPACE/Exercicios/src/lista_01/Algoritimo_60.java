package lista_01;

import java.util.Scanner;

public class Algoritimo_60 {

	public static void main(String[] args) {
		
		int termo_1,termo_2,razao,termo_10;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um termo: ");
		termo_1 = ler.nextInt();
		
		
		System.out.println("Digite um termo: ");
		termo_2 = ler.nextInt();
		
		razao = termo_1 - termo_2 ;
		
		termo_10 = termo_1 + (11-1)*razao;      		 
		
		System.out.println("O decimo termo é"+termo_10);
		
		
		
		

	}

}
