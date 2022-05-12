package br.edu.unicid.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	
	public static Connection getConnection() throws Exception {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String login = "root";
			String senha = "";
			String url = "jdbc:mysql://localhost:3306/DBLeitor";
			
			return DriverManager.getConnection(url,login,senha);
			
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public static void main (String[] args) {
		try	{
			Connection conn = ConnectionFactory.getConnection();
			JOptionPane.showMessageDialog(null, "DB Conectado");
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
