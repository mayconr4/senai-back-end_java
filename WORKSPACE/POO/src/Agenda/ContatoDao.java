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
			if (bd.getConnection()) { 				
				sql = "INSERT INTO contato(nome,endereco,telefone,email) VALUES(?,?,?,?)";
				stm =bd.connection.prepareStatement(sql); 			
				stm.setString(1, contato.getNome());
				stm.setString(2, contato.getEndereco());
				stm.setString(3, contato.getTelefone());
				stm.setString(4, contato.getEmail());
				
				stm.executeLargeUpdate();
				JOptionPane.showMessageDialog(null, "Contato salvo com seucesso");
				
				stm.close();
				bd.close();
				
			}  		
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao Inserir dados em contato");//eu que escrevi  			
			e.printStackTrace();
		}        	
	}

	@Override
	public void atualizar() {
		try {
			if (bd.getConnection()) {
				sql = "UPDATE contato SET endereco=?, telefone=?, email=? WHERE nome=?";
				stm =bd.connection.prepareStatement(sql); 			
				stm.setString(1, contato.getEndereco());
				stm.setString(2, contato.getTelefone());
				stm.setString(3, contato.getEmail());
				stm.setString(4, contato.getNome());
				
				int rows = stm.executeUpdate();
				
				if (rows >0) {
					JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum Contato foi atualizado !");
				}
				
				stm.close();
				bd.close();
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao atualizar dados em contato"); 			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deletar() {
		try {
			if (bd.getConnection()) {
				sql = "DELETE FROM contato WHERE nome=?";
				stm =  bd.connection.prepareStatement(sql);
				
				stm.setString(1, contato.getNome());
				
				int rows = stm.executeUpdate();
				
				if (rows >0) {
					JOptionPane.showMessageDialog(null, "Contato deletado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum Contato foi deletado !");
				}
				
				stm.close();
				bd.close();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

	@Override
	public void listar() {
		
		try {
			if (bd.getConnection()) {
				
				sql = "SELECT nome,endereco,telefone,email FROM contato";
				stm =bd.connection.prepareStatement(sql);
				
				
				System.out.println("Nome\t\tEndereço\t\tTelefone\t\tE-mail");
				System.out.println("__________________________________________________________________________");
				
				ResultSet resultSet = stm.executeQuery(); 			
				while(resultSet.next()) {
					String nome = resultSet.getString("nome");
					String endereco = resultSet.getString("endereco");
					String telefone = resultSet.getString("telefone");
					String email = resultSet.getString("email");
					System.out.println(nome+"\t"+endereco+"\t"+telefone+"\t"+email);	
				}
				
				resultSet.close();
				stm.close();
				bd.close();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao listar dados em contato");
			e.printStackTrace();
		}
	}

}
