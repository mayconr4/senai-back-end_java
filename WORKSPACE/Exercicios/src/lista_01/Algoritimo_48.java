package lista_01;

import java.util.Scanner;

public class Algoritimo_48 {

	public static void main(String[] args) {
		double salario_minimo, quilowatts_100,total_quilowatts,valor_por_quilowatts,valor_total,valor_desconto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o seu salario Minimo: ");
		salario_minimo = ler.nextDouble();    
		
		System.out.println("Quantos quilowatts foram gastos: ");
		total_quilowatts = ler.nextDouble();
		
		
		valor_por_quilowatts = (1/7) * (salario_minimo/100);
		
		valor_total = total_quilowatts * valor_por_quilowatts;
		
		
		valor_desconto = valor_total *0.9;        		
		
		
		 System.out.println("Valor de cada quilowatts: "+valor_por_quilowatts);
		 System.out.println("Valot total a ser pago: "+valor_total);
		 System.out.println("O novo valor a ser pago com desconto de 10%: "+valor_desconto);
		 
		
		
		
		
		
	}

}
