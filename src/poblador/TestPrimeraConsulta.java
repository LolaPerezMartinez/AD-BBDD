package poblador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPrimeraConsulta {
	public static void showSQLExceptionInfo(SQLException e) {
		System.err.printf("SQL Exception          : %s%n", e.getClass().getSimpleName());
		System.err.printf("SQL Error mensaje      : %s%n", e.getMessage());
		System.err.printf("SQL Estado             : %s%n", e.getSQLState());
		System.err.printf("SQL Código específico  : %s%n", e.getErrorCode());
		
	}
	
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/mundo?allowPublicKeyRetrieval=true&useSSL=false";
		String user = "root";
		String pass = "root";
		
		String sql = "SELECT * FROM personas";
		System.out.println("Estableciendo conexión");
		
		try(Connection con = DriverManager.getConnection(url, user, pass); 
				//Statement es el objeto que ejecuta SQL en la base de datos
				//sin statement no puedes hacer select, insert, update ni delete
				Statement stm = con.createStatement();
				//Un ResultSet es el resultado de una consulta SELECT.
				//es como una tabla virtual en memoria pero sólo puede recorrerse fila a fila
				ResultSet rs = stm.executeQuery(sql);){
			
		}catch(SQLException e) {
			showSQLExceptionInfo(e);
		}
	}
}
