package gps;

import java.util.Scanner;

public class GPS {   
	
	private String idioma;
	private String rota;
	
	Scanner ler = new Scanner(System.in);
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	
	public GPS() {
		
	}  
	
	public GPS(String idioma,String rota) {
		this.idioma = idioma;
		this.rota = rota; 		
	} 	
	
	public String DefineConfiguracoes(String rota, String idioma) {
		
		System.out.println("Escolha o idioma: ");
	 	setIdioma(ler.nextLine());
		
		System.out.println("Digite a rota: ");
		setRota(ler.nextLine());        	
		return rota;
	}        
	
	public void mostrar() { 
		System.out.println("Idioma: "+ this.idioma);
		System.out.println("Rota: "+ this.rota);
	}
}
