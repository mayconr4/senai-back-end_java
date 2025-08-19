package Desafios;

import javax.swing.JOptionPane;

public class Desafio_01 {

	public static void main(String[] args) {
		
		double salario_atual,novo_salario,valor_da_porcentagem;
		
		salario_atual = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário atual: "));
		
		if (salario_atual <= 1.000 ) {
			novo_salario = salario_atual*1.40;
			valor_da_porcentagem = salario_atual*0.40;
			JOptionPane.showMessageDialog(null, "Salário antigo: "+salario_atual+"\n40% de aumento"+
					"\nValor do aumento: "+valor_da_porcentagem+
					"\nNovo salário: "+novo_salario);
		} else if(salario_atual >1.000){
			novo_salario = salario_atual *1.30;
			valor_da_porcentagem = salario_atual*0.30;
			JOptionPane.showMessageDialog(null, "Salário antigo: "+salario_atual+"\n30% de aumento"+
			"\nValor do aumento: "+valor_da_porcentagem+
			"\nNovo salário: "+novo_salario);
		}else {
			JOptionPane.showMessageDialog(null, "Não haverá aumento");
		}
		
		
		
		

	}

}
