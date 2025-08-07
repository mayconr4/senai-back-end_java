package Exemplo_02;

public class Operadores_01 {

	public static void main(String[] args) {
		double numero_01 = 15,numero_02 = 20,soma,subtracao,multiplicacao,divisao,resto;    	
		
		soma = numero_01 + numero_02;
		
		subtracao = numero_01 - numero_02;
		
		multiplicacao = numero_01 * numero_02;
		
		divisao = numero_01 / numero_02;
		
		resto = numero_01 % numero_02;
		
		System.out.println(
				"Soma: "+soma+
				"\nSubtração: "+subtracao+
				"\nMultiplicação: "+multiplicacao+
				"\nDivisão: "+divisao+
				"\nResto: "+resto);

	}

}
