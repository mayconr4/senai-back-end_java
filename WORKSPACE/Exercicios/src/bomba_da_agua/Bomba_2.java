package bomba_da_agua;

public class Bomba_2 {
	
	boolean status;
	int cont;
	
	public void ligar() throws InterruptedException {
		this.cont = cont;
		status = true;
		
		
		while (cont>0) {
			System.out.println("Tempo restante: "+cont);
			Thread.sleep(1000);
			cont--;
		}
	}
	
	public void desligar() {
		status = false;
	}

}
