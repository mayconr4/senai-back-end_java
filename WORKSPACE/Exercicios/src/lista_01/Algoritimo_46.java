package lista_01;

import java.util.Scanner;

public class Algoritimo_46 {

	public static void main(String[] args) {
		double saldo, reajuste,novoSaldo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o saldo ");
		saldo = ler.nextInt();  	
		
		reajuste = (saldo*2)/100; 
		novoSaldo = reajuste +saldo;
		
		
		
		
		System.out.println(novoSaldo);
		
		
		
		// Sysout atalho de System.out.println();

	}

}
