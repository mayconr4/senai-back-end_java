package bomba_da_agua;

import java.util.Scanner;

public class Bomba {
	
	Scanner ler = new Scanner(System.in);
	
	private boolean status;
	private int intervalo;

	public boolean getStatus() {
		return status;
	}
	
	public int getIntervalo() {
		return intervalo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
	
	
	public void desligar(boolean status) {
		status = false;
	}
	
	public void ligar(boolean status) throws InterruptedException {     	
		status = true;
		int tempo;
		System.out.println("Digite o intervalor de tempo para ativar a bomba");
		tempo = ler.nextInt();
		
		while (status = true) { 			
			for (int i = tempo; i > 0; i--) {
				Thread.sleep(1000);
				System.out.println("Segundos :"+i); 				
			}  	
			System.out.println("Bomba desligada");
			status = false;
			break;
		}       	
	}
	
	//versão do professor
	/*public void ligar() {
		int cont = 10;
		status = true;
		while (cont >0) {
			System.out.println("Tempo"+cont);
			cont --;
		}
	}
	
	public void desligar() {
		status = false;
	}*/
	
	

}
