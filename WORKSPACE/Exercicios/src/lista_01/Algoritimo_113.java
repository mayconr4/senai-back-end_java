package lista_01;

import java.util.Scanner;

public class Algoritimo_113 {

	public static void main(String[] args) {
		
		
		int num_01,num_02;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_02 = ler.nextInt();     	
		
		if(num_01 > num_02) {
			System.out.println(num_01+" "+num_02);
		}else if (num_02 > num_01) {
			System.out.println(num_02+" "+num_01);
		} else {
			System.out.println("São iguais");
		}
		
		
		
	

	}

}
