package Exemplo_01;

import javax.swing.JOptionPane;

public class Exemplo_input_02 {

	public static void main(String[] args) {
		int numero_01 ,numero_02,soma; 		
		String aux;
		
		aux = JOptionPane.showInputDialog(null,"Digite um numero: ");
		numero_01 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog(null,"Digite outro numero: ");
		numero_02 = Integer.parseInt(aux);
		
		soma = numero_01 + numero_02;
		
		JOptionPane.showMessageDialog(null,"a soma do numero 1 ("+numero_01+")\nMais a soma do numero 2("+numero_02+")\né "+soma );
		
		
		

	}

}
