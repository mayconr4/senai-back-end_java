package Desafios;

public class Desafio_04 {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			for (int i = 0; i <60; i++) {
				for (int j = 0; j <60; j++) {
					Thread.sleep(1000);
					System.out.println(i+" : "+j);
				}
			}
		}

	}

}
