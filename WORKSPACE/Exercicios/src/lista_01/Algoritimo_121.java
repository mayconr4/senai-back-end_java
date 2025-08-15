package lista_01;

import java.util.Arrays;
import java.util.Scanner;

public class Algoritimo_121 {

	public static void main(String[] args) {
		
		int num_01,num_02,num_03,num_04,num_05 ,maior, menor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_02 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_03 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_04 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_05 = ler.nextInt();
		
		int[]numeros = {num_01,num_02,num_03,num_04,num_05};
		
		for(int numero :numeros) {
			Arrays.sort(numeros);
			maior = numeros[4];
			
			menor = numeros[0];
			
			System.out.println("Maior: "+maior+ 
							   "\nMenor: "+menor);
			break;
			
			
		}
		
		
		
	}

}
