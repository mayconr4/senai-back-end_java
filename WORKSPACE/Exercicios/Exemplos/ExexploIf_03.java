package Exemplos;

import javax.swing.JOptionPane;

public class ExexploIf_03 {

	public static void main(String[] args) {

		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite A idade"));
		
		if (idade >=16 && idade<=18 || idade>=60 && idade <=70) {
			JOptionPane.showMessageDialog(null, "Voto facultativo");
		} else {
			JOptionPane.showMessageDialog(null, "Não pode Votar");
		}
		

	}

}
