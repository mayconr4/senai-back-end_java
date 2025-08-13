package lista_01;

import java.util.Scanner;

public class Algoritimo_57 {

	public static void main(String[] args) {
		
		double PR_1, PR_2,truncada,arrendondada, soma,max ,min;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Prova 1: ");
		PR_1 = ler.nextDouble();
		
		System.out.println("Prova 2: ");
		PR_2 = ler.nextDouble();
		
		max = Math.max(PR_1, PR_2)+1;
		min = Math.min(PR_1,PR_2 )-1;
		truncada = (max+min)/2;          	
	   
		
		System.out.println(truncada);
		
		
		
		
		
		
		
		
		

	}

}
