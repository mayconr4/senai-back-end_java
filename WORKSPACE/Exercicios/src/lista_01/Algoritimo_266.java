package lista_01;

import java.util.Scanner;

public class Algoritimo_266 {

	public static void main(String[] args) {
		int acm=0;
		String nome;
		char primeiroCaractere;
		boolean condicao = true;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sim para continuar e FIM para terminar: ");
		nome = ler.nextLine(); 		
		
		while(true) {
			if(!(nome.equals("FIM"))) {
				
				System.out.println("Digite um nome: ");
				nome = ler.nextLine();
				primeiroCaractere = nome.charAt(0);      		
				System.out.println("O primeiro Carcatere de "+nome+" é: "+primeiroCaractere+"\n");
			}else {
				break;
			}
		}
		System.out.println("Termino do loop");
	}

}
