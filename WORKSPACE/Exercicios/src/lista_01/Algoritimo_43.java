package lista_01;

import java.util.Scanner;

public class Algoritimo_43 {

	public static void main(String[] args) {
		double base = 10,num_01,exponiente, logaritimo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01 = ler.nextInt();
		
		exponiente = Math.pow(base, num_01);
		
		logaritimo = Math.log(exponiente);
		
				
		
		
		
		System.out.println("Resultado: "+logaritimo+"\n");
		
	}

}
