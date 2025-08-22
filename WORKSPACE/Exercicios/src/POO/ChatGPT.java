package POO;

import javax.swing.JOptionPane;

public class ChatGPT {
	
	
	double num_01,num_02,total;

	public void  soma() {
	num_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: ")); 		
	num_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));	
		
	total = num_01 + num_02;
	
	JOptionPane.showMessageDialog(null, "O total da soma è : "+total);
	
	} 
	
	public void  subtracao() {
	num_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: ")); 		
	num_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));	
		
	total = num_01 - num_02;
	
	JOptionPane.showMessageDialog(null, "O total da subtração è : "+total);
	
	}  	
	
	public void  multiplicacao() {
	num_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: ")); 		
	num_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));	
		
	total = num_01 * num_02;
	
	JOptionPane.showMessageDialog(null, "O total da Multiplicação è : "+total); 	
	}  	
	
	
	public void  divisao() {
	num_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: ")); 		
	num_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));	
		
	total = num_01 / num_02;
	
	JOptionPane.showMessageDialog(null, "O total da divisao è : "+total);
	
	} 
	
	
}
