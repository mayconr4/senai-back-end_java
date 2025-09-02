package Agenda;

public class Teste {
	
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		FornecedorDao daoF = new FornecedorDao();
		
		
		/*dao.contato = new Contato("Docinho","TV Globo","2233-4455","docinho@gmail.com");
		dao.contato = new Contato("Henrique","TV SBT","7504-0149","mayconhs2007@gmail.com");
		dao.salvar();*/
		
		daoF.fornecedor = new Fornecedor("White Thaigon", "12431341");
		daoF.salvar();
		
		//dao.listar();
		
		//dao.atualizar(); 
		//dao.deletar();
		
		
	}
	

}
