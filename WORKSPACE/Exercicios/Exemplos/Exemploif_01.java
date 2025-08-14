package Exemplos;

import javax.swing.JOptionPane;

public class Exemploif_01 {

	public static void main(String[] args) {
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		if (idade <=16) {
			JOptionPane.showMessageDialog(null, "não é adolescente");
		}else {
			JOptionPane.showMessageDialog(null, "é adolescente");
		}
		

	}

}
