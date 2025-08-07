package Exemplo_02;

import java.util.Iterator;
import java.util.Scanner;

public class Operadores__02 {

	public static void main(String[] args) {
		
		int i=0, numero, amostra;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero da tabuada");
		numero = ler.nextInt(); 		
		
		while (i<11) { 			
			
		amostra = numero * i;
			
		System.out.println(numero+"*"+i+" = "+amostra);
			i = i+1;
		}
		System.out.println("\n"); 		
	
		        int numerob = 2;

		        System.out.println(numerob + " x 1 = " + (numerob * 0));
		        System.out.println(numerob + " x 1 = " + (numerob * 1));
		        System.out.println(numerob + " x 2 = " + (numerob * 2));
		        System.out.println(numerob + " x 3 = " + (numerob * 3));
		        System.out.println(numerob + " x 4 = " + (numerob * 4));
		        System.out.println(numerob + " x 5 = " + (numerob * 5));
		        System.out.println(numerob + " x 6 = " + (numerob * 6));
		        System.out.println(numerob + " x 7 = " + (numerob * 7));
		        System.out.println(numerob + " x 8 = " + (numerob * 8));
		        System.out.println(numerob + " x 9 = " + (numerob * 9));
		        System.out.println(numerob + " x 10 = " + (numerob * 10));         
		        
	}

}
