package lista_01;

import java.util.Scanner;

public class Algoritimo_117 {

	public static void main(String[] args) {
		
		int num_01,num_02,num_03,Nomemaior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_02 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_03 = ler.nextInt();
		
		
		if(num_01 > num_02 && num_01 >num_03) {
			System.out.println("è maior");
			Nomemaior = num_01;
		}else if (num_03 > num_02 && num_03 > num_01) {
			System.out.println("è maior");
			Nomemaior = num_03;
		}else if (num_02 > num_03 && num_02 >num_01) {
			System.out.println("é maior");
			Nomemaior = num_02;
		} else {
			System.out.println("são iguais");
		}

	}

}
