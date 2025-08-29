package Agenda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ContatoDao implements Crud{
	public Contato contato;
	public BD bd; 	
	private PreparedStatement stm;
	private String sql;
	
	public ContatoDao() {
		bd =  new BD();
		contato = new Contato();
	} 	
	
	@Override
	public void salvar() { 		
		try {
			sql = "INSERT INTO contato(nome,endereco,telefone,email) VALUES(?,?,?,?)";
			stm =bd.connection.prepareStatement(sql); 			
			stm.setString(1, contato.getNome());
			stm.setString(2, contato.getEndereco());
			stm.setString(3, contato.getTelefone());
			stm.setString(4, contato.getEmail()); 			
			bd.close();
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao Inserir dados em contato");//eu que escrevi
			e.printStackTrace();
		}        	
	}

	@Override
	public void atualizar() {
		
		
	}

	@Override
	public void deletar() {
		
		
	}

	@Override
	public void listar() {
		
		try {
			sql = "SELECT nome,endereco,telefone,email FROM contato";
			stm =bd.connection.prepareStatement(sql);
			stm.setString(1, contato.getNome());
			stm.setString(2, contato.getEndereco());
			stm.setString(3, contato.getTelefone());
			stm.setString(4, contato.getEmail()); 			
			System.out.println("Código  Nome                  Endereço              Telefone        E-mail");
			System.out.println("__________________________________________________________________________");
			ResultSet resultSet = stm.executeQuery(); 			
			while(resultSet.next()) {
				String nome = resultSet.getString("nome");
				String endereco = resultSet.getString("endereco");
				String telefone = resultSet.getString("telefone");
				String email = resultSet.getString("email");
				System.out.println(nome+"  "+endereco+"           "+telefone+"         "+email);	
				stm.close();
				bd.close();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao listar dados em contato");
			e.printStackTrace();
		}
	}

}
