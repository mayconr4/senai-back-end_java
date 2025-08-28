package Metodos;



public class Acessando_Metodos {

	public static void main(String[] args) {
		UsandoMetodos use = new UsandoMetodos();
		double numero,media,total;
		
		String endereco = "Rua chesira maltauro" ;
		String receber;
		
		
		//use.solicitar();
		
		//use.solicitar(endereco);
		
		//receber = use.devolver(endereco);
		//System.out.println(endereco);
		
		numero = use.total(10,5);
		media = use.total(8,8,8);
		
		total = numero/media;
		System.out.println(total);
		
		
	}

}
