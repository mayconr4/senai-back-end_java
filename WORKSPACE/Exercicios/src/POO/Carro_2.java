package POO;

import java.util.Scanner;

public class Carro_2 {

	public static void main(String[] args) {
		
		
		Veiculo fiat = new Veiculo();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o modelo: ");
		fiat.setModelo(ler.next());
		
		System.out.println("Modelo do veiculo: "+fiat.getModelo());
	}

}
