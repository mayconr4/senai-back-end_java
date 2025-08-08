package lista_01;

import java.util.Scanner;

public class Algoritimo_40 {

	public static void main(String[] args) {
		
		int dividendo,divisor,quociente,resto;

		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um dividendo: ");
		dividendo = ler.nextInt();
		
		System.out.println("Digite um divisor: ");
		divisor = ler.nextInt();
		
		quociente = dividendo / divisor;
		resto = dividendo % divisor;
		
		System.out.println("Dividendo: "+dividendo+
				"\nDivisor: "+divisor+
				"\nQuociente: "+quociente+
				"\nResto: "+resto);
		
		
		
		
		

	}

}
