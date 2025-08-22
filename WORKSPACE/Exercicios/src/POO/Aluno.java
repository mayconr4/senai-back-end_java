package POO;

import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		
		String op;
		int num_01,num_02;
		ChatGPT calculadora = new ChatGPT(); 		
		
		op = JOptionPane.showInputDialog("Digite uma operação  + - * /");
		
		
		switch (op) {
		case "+":   		
			calculadora.soma();	
			
			break;
		case "-":  			
			calculadora.subtracao();	
			
			break;
		case "*": 
			
			calculadora.multiplicacao();	
			
			break;
		case "/": 
			
			calculadora.divisao();
			
			break;      	
		
		default:
			throw new IllegalArgumentException("Tente novamente: ");
		}
		
		
	}

	

}
