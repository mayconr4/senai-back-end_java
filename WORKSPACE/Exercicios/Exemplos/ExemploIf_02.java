package Exemplos;

import javax.swing.JOptionPane;

public class ExemploIf_02 {

	public static void main(String[] args) {
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		if (idade>=16 && idade<=17) {
			JOptionPane.showMessageDialog(null, "Não Pode votar");
		} else {
			JOptionPane.showMessageDialog(null, "Pode votar");
		}	
	}

}
