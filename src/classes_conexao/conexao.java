/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jogan
 */
public class conexao {
      public static Connection conexao() throws SQLException {
          
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/cadastro_usuario","root"," ");
			

		}catch (ClassNotFoundException e){
			
			throw new SQLException(e.getException());
			
			
		}
	
	}	
}
