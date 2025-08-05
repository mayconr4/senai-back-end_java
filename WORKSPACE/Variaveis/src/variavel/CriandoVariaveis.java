package variavel;

import javax.swing.JOptionPane;

public class CriandoVariaveis {

	public static void main(String[] args) {
		byte pequeno = 127;//Byte
		short maior = 32767;
		int numero = 2_147_483_647;// Integer
		float fracionado = 1.7f; 
		double monetario = 8_147_483_649.00;
		long infinity =  9_223_372_036_854_775_807l;
		char letra = 'a';
		boolean quest = false;
		
		String aux  = JOptionPane.showInputDialog(null,"Digite um numero: ");
		JOptionPane.showMessageDialog(null, "Valor String "+aux);
		numero = Integer.parseInt(aux);
		JOptionPane.showMessageDialog(null, "Valor convertido "+numero);
		
		
		
		
		
	}

}
