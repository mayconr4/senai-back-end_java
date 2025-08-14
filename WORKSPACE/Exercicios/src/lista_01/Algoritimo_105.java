package lista_01;

import java.util.Scanner;

public class Algoritimo_105 {

	public static void main(String[] args) {
		
		String estado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a silga od seu estado");
		estado = ler.nextLine();
		
	if(estado.equals("SP") || estado.equals("Sp") || estado.equals("sp")) {
		System.out.println("paulista");
		
	}else if(estado.equals("RJ") || estado.equals("Rg") || estado.equals("rg")) {
		System.out.println("carioca");
		
	}else if (estado.equals("MG") || estado.equals("Mg") || estado.equals("mg")) {
		System.out.println("mineiro");
		
	}else {
		System.out.println("Outros estados");
	}
	}

}
