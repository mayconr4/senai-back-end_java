package Desafios;

import javax.swing.JOptionPane;

public class Desafio_03 {

	public static void main(String[] args) {
		
		double nivel,percentual_desconto;
		String mensalidade;
		int dia;
		
		mensalidade = JOptionPane.showInputDialog("Escolha o Nivel de Mensalidade \nNível 1 = R$ 51,50;"
				
				+ "\nNível 2 =R$ 65,00;\r\n"
				+ "\n"
				+ "Nível 3 = R$ 80,00;\r\n"
				+ "\r\n"
				+ "Nível 4 = R$ 100,00.");
		
		switch (mensalidade) {
		case ("1"): 
			nivel = 51.50;
			System.out.println();
			break;
		case ("2"): 
			nivel = 65.00;
			break;	
		case ("3"): 
			nivel = 80.00;
			System.out.println();
			break;
		case ("4"): 
			nivel = 100.00;
			System.out.println();
			break;	
		default:
			throw new IllegalArgumentException("Você digitou errado tente novamente: " );
		}
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de pagamento"));
		
		if(dia ==1 ){
			percentual_desconto = nivel* 0.15;
			nivel = nivel - percentual_desconto;
			JOptionPane.showMessageDialog(null, "Valor final da mensalidade: "+nivel);
			
		}else if(dia >=2 && dia <=5) {
			percentual_desconto = (nivel* 0.10) + 3.89;
			nivel = nivel - percentual_desconto;
			JOptionPane.showMessageDialog(null, "Valor final da mensalidade: "+nivel);
		} else if(dia >=6 && dia <=10) {
			percentual_desconto = (nivel* 0.15)+3.89;
			nivel = nivel - percentual_desconto;
			JOptionPane.showMessageDialog(null, "Valor final da mensalidade: "+nivel);
		}
		
		

	}

}
