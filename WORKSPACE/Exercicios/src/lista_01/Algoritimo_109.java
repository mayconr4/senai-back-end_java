package lista_01;

import java.util.Arrays;
import java.util.Scanner;

public class Algoritimo_109 {

	public static void main(String[] args) {
		
		
		String nome_01,nome_02;
		
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digte o seu nome embaralhadamente");
		nome_01 = ler.nextLine();
		
		System.out.println("Digte o seu nome embaralhadamente");
		nome_02 = ler.nextLine();
		
		String[] ordemAlfabetica_01 = nome_01.split("");
		String[] ordemAlfabetica_02 = nome_02.split("");
		
		
		Arrays.sort(ordemAlfabetica_01);
		Arrays.sort(ordemAlfabetica_02);
		
		String ordenado = String.join("", ordemAlfabetica_01);
		String ordenado_02 = String.join("", ordemAlfabetica_02);
		
		System.out.println("Seu nome é: "+ordenado);
		System.out.println("Seu nome é: "+ordenado_02);
		
		
		
		
		
		
		
		
		
		

	}
	
	
	

}
