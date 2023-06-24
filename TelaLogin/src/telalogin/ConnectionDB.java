package telalogin; 
import java.sql.*; 

import java.sql.DriverManager;  
import java.sql.SQLException; 
// classe para tratamento de exceções 
public class ConnectionDB{
     public Connection getConnection() {
		 try {
                    
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","anima123");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }}