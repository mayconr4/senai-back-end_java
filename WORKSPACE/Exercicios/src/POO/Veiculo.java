package POO;

public class Veiculo {

	private String modelo;
	private int ano;
	private String cor;
	private String capacete;
	private boolean ligado = true;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCapacete() {
		return capacete;
	}
	public void setCapacete(String capacete) {
		this.capacete = capacete;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	

}
