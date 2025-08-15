package lista_01;

import java.util.Scanner;

public class Algoritimo_115 {

	public static void main(String[] args) {
		
		double num_01,num_02,exponienciacao,raizQuadrada;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num_01= ler .nextDouble();
		
		System.out.println("Digite um numero");
		num_02= ler .nextDouble();
		
		if(num_01 < num_02 ) {
			exponienciacao = Math.pow(num_01,2 );
			
			System.out.println("exponienciação: "+exponienciacao);
		}else if(num_02 < num_02) {
			
			exponienciacao = Math.pow(num_02,2 );
			
			System.out.println("exponienciação: "+exponienciacao);
		} else if(num_01 > num_02) {
			raizQuadrada = Math.sqrt(num_02);
			
			System.out.println("Raiz quadrada: "+raizQuadrada);
		}else if(num_02 > num_01) {
			raizQuadrada = Math.sqrt(num_02);
			
			System.out.println("Raiz quadrada: "+raizQuadrada);
		}else {
			System.err.println("São iguais: ");
		}

	}

}
