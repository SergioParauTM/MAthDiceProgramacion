package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class AccesoBD {

private static Connection connect = null;
private static AccesoBD INSTANCE = null;
	
	private AccesoBD() {
		try {
		      // Cargamos en ejecución 
		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/mathdice","root", "phpadmin");
		      //Mensaje de conexion realizada
		      System.out.println("Conexion realizada");
	    } catch (Exception e) {
	        System.out.println(e);
	    } 
	}
	
	
	
	public static Connection getConexion(){
        if (connect == null){
        	INSTANCE = new AccesoBD();
        }
		return connect;
	}
	
	
	
	
	
	
}
