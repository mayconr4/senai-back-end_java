package bomba_da_agua;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsaBomba {

	public static void main(String[] args) throws InterruptedException {
		
		String op;
		
		Scanner ler = new Scanner(System.in);
		Bomba bombaDeAgua = new Bomba();      	
		
		op = JOptionPane.showInputDialog("deseja ligar a Bomba");
		
		switch (op) {
		case "sim": 
			
			bombaDeAgua.ligar(false);
			
			break;
		case "não":	
			
			JOptionPane.showMessageDialog(null,"OK");
		default:
			throw new IllegalArgumentException("Tente novamente: ");
		} 		
		

	}

}
