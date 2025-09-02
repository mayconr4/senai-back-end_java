package Agenda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class FornecedorDao implements Crud{
	public Fornecedor fornecedor;
	public BD bd;
	public PreparedStatement stm;
	public String sql;
	
	public FornecedorDao() {
		bd = new BD();
		fornecedor = new Fornecedor();
		
	}

	@Override
	public void salvar() {
		try {
			if (bd.getConnection()) {
				sql = "INSERT INTO fornecedor(nome,cnpj) VALUES(?,?)";
				stm =bd.connection.prepareStatement(sql); 			
				stm.setString(1, fornecedor.getNome_fornecedor());
				stm.setString(2, fornecedor.getCnpj());
				
				stm.executeLargeUpdate();
				JOptionPane.showMessageDialog(null, "Fornecedor salvo com seucesso");
				
				stm.close();
				bd.close();
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar Fornecedor");
			e.printStackTrace();
		}
		
	}

	@Override
	public void atualizar() {
		try {
			if (bd.getConnection()) {
				sql = "UPDATE fornecedor SET cnpj=? WHERE nome=?";
				stm =bd.connection.prepareStatement(sql); 
				stm.setString(1, fornecedor.getCnpj());
				stm.setString(2, fornecedor.getNome_fornecedor());
				
				int rows = stm.executeUpdate();
				
				if (rows >0) {
					JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum Fornecedor foi atualizado !");
				}
				
				stm.close();
				bd.close();
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar Fornecedor");
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletar() {
		try {
			if (bd.getConnection()) {
				sql = "DELETE FROM fornecedor WHERE nome=?";
				stm =  bd.connection.prepareStatement(sql);
				
				stm.setString(1, fornecedor.getNome_fornecedor());
				
				int rows = stm.executeUpdate();
				
				if (rows >0) {
					JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum Fornecedor foi deletado !");
				}
				
				stm.close();
				bd.close();
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar");
			e.printStackTrace();
		}
		
	}

	@Override
	public void listar() {
		try {
			if (bd.getConnection()) {
				sql = "SELECT nome,cnpj FROM fornecedor";
				stm =bd.connection.prepareStatement(sql);
				
				System.out.println("Nome\t\tcnpj");
				System.out.println("__________________________________________________________________________");
				
				ResultSet resultSet = stm.executeQuery();
				while(resultSet.next()) {
					String nome = resultSet.getString("nome"); 					
					String cnpj = resultSet.getString("cnpj");
					System.out.println(nome+"\t"+cnpj);	
				}
				
				resultSet.close();
				stm.close();
				bd.close();  			
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar Fornecedores");
			e.printStackTrace();
		}
		
	}

}
