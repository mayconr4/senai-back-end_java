package lista_01;

import javax.swing.JOptionPane;

public class Algoritimo_42 {

	public static void main(String[] args) {
		 double angulo, graus, seno,cosceno ,tangente, secante ,cossecante,cotangente,radianos;

	        angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));

	        graus = Math.toDegrees(angulo); 

	        radianos = Math.toRadians(graus);

	        seno =  Math.sin(radianos); 

	        cosceno = Math.cos(radianos);

	        tangente = Math.tan(radianos);

	        secante = 1/cosceno;
	        cossecante = 1/seno;
	        cotangente = 1/tangente;                  

	       
	        System.out.printf("\nSeno: %.5f%n", seno);
	        System.out.printf("\nCosceno: %.5f%n", cosceno);
	        System.out.printf("\ntangente: %.5f%n", tangente);
	        System.out.printf("Secante: %.5f%n", secante);
	        System.out.printf("\nCossecante: %.5f%n", cossecante);
	        System.out.printf("\ncotangente: %.5f%n", cotangente);


	}

}
