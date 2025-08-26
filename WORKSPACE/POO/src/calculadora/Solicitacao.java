package calculadora;

import java.util.Scanner;

public class Solicitacao {
	
	Calculo calc = new Calculo(); 
	Scanner ler = new Scanner(System.in);
	String op; 		
	
	public void solicitarOperacao() { 		
		
		System.out.println("Digite um valor: ");
		calc.setValor_01(ler.nextDouble());
		
		System.out.println("Digite um valor: ");
		calc.setValor_02(ler.nextDouble());
		
		System.out.println("Digite a operação: "+
						   "\n + Somar"+
				           "\n - Subtração"+
						   "\n * Multiplicar"+
				           "\n / Dividir");
		op = ler.next();     	
		
		switch (op) {
		case ("+"):  			
			calc.somar(calc.getValor_01(), calc.getValor_02()) ;
			break;
		case ("-"): 			
			calc.subtracao(calc.getValor_01(), calc.getValor_02());
			break;
		case ("*"): 			
			calc.multiplicacao(calc.getValor_01(), calc.getValor_02());
			break; 			
		case ("/"):     			
			calc.divisao(calc.getValor_01(), calc.getValor_02());
			break;
		case "r":
			calc.raizQuadrada(calc.getValor_01());
			
		default:
			throw new IllegalArgumentException("Tente novamente");
		} 		
	}
	
}
