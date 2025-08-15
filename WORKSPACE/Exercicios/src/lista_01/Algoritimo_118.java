package lista_01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Algoritimo_118 {

	public static void main(String[] args) {
		
		int num_01,num_02,num_03;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_02 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_03 = ler.nextInt();
		
		int[] ordem = {num_01,num_02,num_03};
		
		Arrays.sort(ordem);
		
		/*for (int i = 0; i < ordem.length; i++) {
			int j = ordem[i];
			System.out.println(j);
		}*/
		
		for (int num : ordem) {
		    System.out.print(num + " ");
		}

		
		
		

	}

}
