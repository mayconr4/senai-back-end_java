package Polimorfismo;

public class Pessoa {
	private String nome;
	private String endereco;
	private String email;
	
	public Pessoa() {
		
		
		//inicializando os parametros do construtor sem precisar de parametros
		this.nome= "Docinho";
		this.endereco = "Endereço";
		this.email = "Docinho@gmail.com";
	}
	
	public Pessoa(String nome) {
		this.nome = nome;  		
		
	}
	
	public Pessoa(String nome, String endereco,String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;  		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
