package Desafios;

import javax.swing.JOptionPane;

public class Desafio_02 {

	public static void main(String[] args) {
		
		 String escolha;
		int diaPagamento; 
		double plano, total,percentual_desconto,plano_sem_desconto;     		
		escolha = JOptionPane.showInputDialog("Escolha o Plano\nBasico = 80.00\nIntermediario = 120.00\nAvançado = 180.00\nVip = 250.00");     
		switch (escolha) {
		case ("Básico"): 
			plano = 80.0;
			plano_sem_desconto = plano;
		JOptionPane.showMessageDialog(null,"Básico: "+plano);  		
			break;
		case ("Intermediário"): 
			plano = 120.00;
			plano_sem_desconto = plano;
		JOptionPane.showMessageDialog(null,"Intermediário: "+plano); 			
			break; 			
		case ("Avançado"): 
			plano = 180.00;
			plano_sem_desconto = plano;
		JOptionPane.showMessageDialog(null, "Avançado: "+plano);
		case ("Vip"): 
			plano = 250.00;
			plano_sem_desconto = plano;      		
			JOptionPane.showMessageDialog(null,"Vip: "+plano);
			break;	
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + escolha);
		}    		
		diaPagamento =  Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de pagamento: "));
		
		if(diaPagamento >= 1 && diaPagamento <= 3) {
			percentual_desconto = plano * 0.12;
			plano = plano - percentual_desconto;
			JOptionPane.showMessageDialog(null, "Resultado Sem desconto: "+plano_sem_desconto+"\nResultado total com desconto: "+plano+"\nDesconto: "+percentual_desconto);
			
			
		}else if(diaPagamento >=4 && diaPagamento<=7 ) {
			percentual_desconto = plano * 0.7;
			plano =plano - percentual_desconto;
			JOptionPane.showMessageDialog(null, "Resultado Sem desconto: "+plano_sem_desconto+"\nResultado total com desconto: "+plano+"\nDesconto: "+percentual_desconto);
		}else if(diaPagamento >=8 && diaPagamento<=10 ) {
			percentual_desconto = plano * 0.3;
			plano =plano - percentual_desconto;
			JOptionPane.showMessageDialog(null, "Resultado Sem desconto: "+plano_sem_desconto+"\nResultado total com desconto: "+plano+"\nDesconto: "+percentual_desconto);
		} else {
			JOptionPane.showMessageDialog(null, "Resultado Sem desconto: "+plano_sem_desconto+"\nResultado total com desconto: "+plano);
		}     	
		
	}

}
