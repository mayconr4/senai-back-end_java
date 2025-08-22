package Exemplos;

public class UsandoFor {

	public static void main(String[] args) throws InterruptedException {
		int cont = 0;
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		String[][] nomes =  {{"M","A","Y"},{"C","O","N"},{"💩","🔒","😶‍🌫️"}};
		int vetor[] = {1,2,3,4,5,6};
		
		/*while (cont < 10) {
			System.out.println(cont);
			cont++;
		}*/
		
		
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
				Thread.sleep(1000);
			}
			System.out.println();
		}

	}

}
