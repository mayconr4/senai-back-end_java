package Exemplo_01;

import javax.swing.JOptionPane;

public class Exemplo_input_03 {

	public static void main(String[] args) {
		int numero_01 ,numero_02,soma; 	
		
		numero_01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		numero_02 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		soma = numero_01 + numero_02;
		
		JOptionPane.showMessageDialog(null, "O total da soma é: "+soma);
		
		
		
		

	}

}
