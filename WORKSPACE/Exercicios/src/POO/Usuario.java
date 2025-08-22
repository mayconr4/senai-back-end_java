package POO;

public class Usuario {

	public static void main(String[] args) 	{
		Pessoa mulher = new Pessoa();
		
		Pessoa homen = new Pessoa();
		
		mulher.nome="Docinho";
		mulher.endereco="Rede Manchete";
		
		
		homen.nome="Tio Patinhas";
		homen.endereco="Cofre";
		
		System.out.println("Nome: "+mulher.nome+"\nEndereco: "+mulher.endereco+"");
		System.out.println("Nome: "+homen.nome+"\nEndereco: "+homen.endereco+"");
		
		
		

	}

}
