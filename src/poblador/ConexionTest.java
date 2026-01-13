package poblador;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/mundo?allowPublicKeyRetrieval=true&useSSL=false";
		String user = "root", pass = "root";
		try {
			System.out.println("Estableciendo conexión");
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("Conexión establecida con éxito");
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName());
			System.out.println(e.getMessage());
		}
		System.out.println("bye");
	}

}
