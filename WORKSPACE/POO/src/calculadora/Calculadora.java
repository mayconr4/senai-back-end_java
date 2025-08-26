package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Calculo calc = new Calculo(); 		
		Scanner ler = new Scanner(System.in);
		
		String op;
		
		
		System.out.println("Digite um valor: ");
		calc.setValor_01(ler.nextDouble());
		
		System.out.println("Digite um valor: ");
		calc.setValor_02(ler.nextDouble());
		
		System.out.println("Digite a operação: ");
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
		default:
			throw new IllegalArgumentException("Tente novamente");
		}
		
		
		
		
		
		
		
	}

}
