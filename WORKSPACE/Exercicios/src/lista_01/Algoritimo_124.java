package lista_01;

import java.util.Scanner;

public class Algoritimo_124 {

	public static void main(String[] args) {
		
		int num_01,num_02,num_03,verifica_01,verifica_02,verifica_03;
		String classifica_triangulo;
		boolean exemplo = true;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_02 = ler.nextInt();
		
		System.out.println("Digite um numero");
		num_03 = ler.nextInt();
		
		int[]lados = {num_01,num_02,num_03};
		
		for(int lado:lados) {
			
			verifica_01 =  lados[0]+ lados[1];
			verifica_02 =  lados[0]+ lados[2];
			verifica_03 =  lados[1]+ lados[2];
			
			if ( verifica_01 > num_03 && verifica_02 > num_02 && verifica_03 > num_03) {
				System.out.println("podem ser um lado de um triangulo ");        		
				
				Retangulo(lados[0],lados[1],lados[2]);
				Acutangulo(lados[0],lados[1],lados[2]);
				Obtusangulo(lados[0],lados[1],lados[2]);
				
			}else {
				System.out.println("Não podem ser um lado de um triangulo ");
			}
			break;	
			
			}    	

	}
	
	public static  int Retangulo(int a, int b, int c) {       		
		
		if(!(a == b) && !(c == b) && !(c == a) ) {
			
			System.out.println("è um Triangulo Escaleno: ");     		
		}
		
		return a;
	} 
	
	
	public static int Acutangulo(int a, int b, int c) {
		if (a == b &&  b == a && !(c == b) && !(c == a)   ){
			
			System.out.println("è um Triangulo Isóceles: ");
		}  	 		
		return a;
	}
	
	
	public static int Obtusangulo(int a, int b, int c) {       		
		
		if(a == b && c == b && c == a  ) {
			
			System.out.println("è um Triangulo Equilátero: ");     			
		} 		
		return a;
	}
	
	

	

}
