package lista_01;

import java.util.Arrays;
import java.util.Scanner;

public class Algoritimo_120 {

	public static void main(String[] args) {
		
		int num_01,num_02,num_03,maior, intermediario,menor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_02 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_03 = ler.nextInt();
		
		int[]numeros = {num_01,num_02,num_03};             	
		
		for(int numero: numeros) {
			Arrays.sort(numeros);
			
			maior  = numeros[2];
			intermediario = numeros[1];
			menor = numeros[0];
			
			System.out.println("Menor: "+menor+
					"\nIntermediário: "+intermediario+
					"\nMaior: "+maior);
			break;
		}
		

	}

}
