package calculadora;



public class Calculo {
	
	//o que tenho (Atributos)
	private double valor_01;
	private double valor_02;
	private double total;
	
	
	// metodos acessores
	
	public void setValor_01(double valor_01) {
		this.valor_01 = valor_01;
	}
	
	public void setValor_02(double valor_02) {
		this.valor_02 = valor_02;
	}   	
	
	public double getValor_01() {
		return valor_01;
	}
	
	public double getValor_02() {
		return valor_02;
	}
	
	public double getTotal() {
		return total;
	}
		
		// o que faço (métodos)
	
	public void somar(double valor_01, double valor_02) {
		this.total = this.valor_01 + this.valor_02;
		System.out.println(this.total);
	}
	
	public void subtracao(double valor_01, double valor_02) {
		this.total = this.valor_01 - this.valor_02;
		System.out.println(this.total);
	}
	
	public void multiplicacao(double valor_01, double valor_02) {
		this.total = this.valor_01 * this.valor_02;
		System.out.println(this.total);
	}
	
	
	public void divisao(double valor_01, double valor_02) {
		this.total = this.valor_01 / this.valor_02;
		System.out.println(this.total);
	}
	
}
