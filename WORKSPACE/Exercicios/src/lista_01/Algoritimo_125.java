package lista_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Algoritimo_125 {

	public static void main(String[] args) {
		
		int idade ;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		
	if(idade >=18 && idade <=65) {
		System.out.println("é maior de idade: ");	
	}else if (idade <18) {
		System.out.println("è menor de idade: ");
	} else {
		System.out.println("è maior de 65 anos");
}
	
	
	}             

}
