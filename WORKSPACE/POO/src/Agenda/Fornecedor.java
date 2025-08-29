package Agenda;

public class Fornecedor {
	
	private String nome_fornecedor;
	private String cnpj;
	
	public Fornecedor () {
		
	}
	
	public Fornecedor( String nome_fornecedor, String cnpj) {
		super();
		this.nome_fornecedor = nome_fornecedor;
		this.cnpj = cnpj;
	}

	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}







	
	
	

}
