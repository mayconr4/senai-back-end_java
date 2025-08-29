package Agenda; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BD {  		
	public Connection connection = null;
		private final String DRIVER = "com.mysql.jdbc.Driver";
		private final String DBNAME = "agenda";
		private final String URL = "jdbc:mysql://localhost:3306/"+DBNAME;//localhost
		//se for na sua maquina caso o bd estiver em outra maquina passar o ip
		private final String LOGIN = "root";
		private final String SENHA = "senai@126"; 		
		
		 public boolean getConnection() {
			 try {
				 Class.forName(DRIVER);
				 connection = DriverManager.getConnection(URL,LOGIN,SENHA);
				 JOptionPane.showMessageDialog(null,"Conectou"); 				 
				 return true;
				 
			 }catch (ClassNotFoundException erro) { 
				 JOptionPane.showMessageDialog(null,"Driver não encontrado!"+erro.toString()); 				
				return false;
			}catch (SQLException erro) {
				JOptionPane.showMessageDialog(null, "Falha ao conectar, usuario ou senha incorreto"+erro.toString()); 				
				return false;
			}      		 
		 }
		 
		 public void close() {
			 try {
				connection.close();
				System.out.println("Conexão encerrada com sucesso!");
			} catch (SQLException erro) {
			
			}
		 }
}