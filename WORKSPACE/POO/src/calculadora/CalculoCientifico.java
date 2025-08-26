package calculadora;

public class CalculoCientifico {
	
	private double valor_01;
	
	private double total;
	public double getValor_01() {
		return valor_01;
	}
	public void setValor_01(double valor_01) {
		this.valor_01 = valor_01;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal_02(double total) {
		this.total = total;
	}     
	
	 public double raizQuadrada(double valor_01) {
		 this.total = Math.sqrt(valor_01);
		 
		 System.out.println(this.total);
		 return this.total;      	 
		 
	 }

}
