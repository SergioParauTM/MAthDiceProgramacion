package BBDD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;


import java.sql.PreparedStatement;

import Juego.Jugador;
import Ventanas.Perfil;
import Ventanas.RegistroUsuario;




public class usuariosDB {
	//Campos de la tabla
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	RegistroUsuario registro;
	Jugador j;
	String resultado;
	
	
	private Statement orden = null;
	
	public usuariosDB(Jugador j) {
		this.j=j;
	}
	
	
	public void insertarUsuario(Connection c){
		
		
		try{
			ResultSet rs;
			orden = c.createStatement();
		    String mysql = "INSERT INTO usuario (nombre,apellido,segApellido,edad) " +
		                   "VALUES ('"+j.getNombre()+"', '"+j.getPrimerApellido()+"', '"+j.getSegundoApellido()+"', "+j.getEdad()+")";
		    orden.executeUpdate(mysql);
		    
		    resultado="Usuario registrado con exito";
		    	
		    
		   }catch(SQLException se){
			      //Se produce un error con la consulta
			   resultado="error al conectar con la BD";
			  
			      se.printStackTrace();
		   }catch(Exception e){
			      //Se produce cualquier otro error
			   resultado="cualquier error ";
			      e.printStackTrace();
		   }
			    
	

	}
	
	
		
		// buscar un usuario bbdd mediante JComboBox
				public void JcomboxUser(JComboBox jc, Connection c){
					ResultSet rs;
					try{
					  orden = c.createStatement();
				      String sql = "SELECT idusuario,nombre,apellido,segApellido,edad, puntos FROM usuario";
				      rs = orden.executeQuery(sql);
				
				      while(rs.next()){
				    	  j =new Jugador();
				    	  j.setId(rs.getString("idusuario"));
					      j.setNombre(rs.getString("nombre"));
					      j.setPrimerApellido(rs.getString("apellido"));
					      j.setSegundoApellido(rs.getString("segApellido"));
					      j.setEdad(rs.getInt("edad"));
					      j.setPuntos(rs.getInt("puntos"));
					      jc.addItem(j);
				      }
				     
				      rs.close();
					}catch(SQLException se){
						      se.printStackTrace();
					}catch(Exception e){
						     
						      e.printStackTrace();
					
					}
				}
				
				//Método que permite buscar actualizar un usuario en la base de datos
				public void ActualizarPuntuacion(Connection c, int puntuacion){
					try{
					  orden = c.createStatement();
				      String mysql = "UPDATE usuario " +
			                       "SET puntos = ' "+puntuacion+ " '" +
				    		       " WHERE idusuario = ' "+ j.getId() + " ' ";
				      System.out.println(mysql);
				      orden.executeUpdate(mysql);
					}catch(SQLException se){
						      //Se produce un error con la consulta
						      se.printStackTrace();
					}catch(Exception e){
						      //Se produce cualquier otro error
						      e.printStackTrace();
					}
				}
				
				
				
				
				public void actualizarUser(Connection c){
			
					try{
					  orden = c.createStatement();

					  String sql = "UPDATE usuario " +
			                       "SET nombre = ?"+
			                       ",apellido = ?"+
			                       ",segApellido = ?"+
			                       ",edad = ? "+
				    		       "WHERE idusuario = "+j.getId();
				      PreparedStatement preparedStmt = c.prepareStatement(sql);
				      preparedStmt.setString(1, j.getNombre());
				      preparedStmt.setString(2, j.getPrimerApellido());
				      preparedStmt.setString(3, j.getSegundoApellido());
				      preparedStmt.setInt(4, j.getEdad());
				      
				      
				 
				      // se ejecuta la consulta
				      preparedStmt.executeUpdate();
				      
				      resultado = "actualizado";
					}catch(SQLException se){
						      //Se produce un error con la consulta
						      se.printStackTrace();
						      resultado="error al Actualizar";
					}catch(Exception e){
						resultado ="Error inesperado";
						      e.printStackTrace();
					
					}
				
					
								
				}


				public String getResultado() {
					return resultado;
				}


				public Jugador usuarioPorID(Connection c , String iduser){
					ResultSet rs;
					Jugador j=new Jugador();
					try{
					  orden = c.createStatement();
				      String sql = "SELECT idusuario,nombre,apellido,segApellido,edad, puntos FROM usuario WHERE idusuario='"+iduser+"'";
				      rs = orden.executeQuery(sql);
				      //Cogemos los usuarios
				      while(rs.next()){
				    	  //Es necesario el id para después realizar la actualización
				    	 j.setId(rs.getString("idusuario"));
					      j.setNombre(rs.getString("nombre"));
					      j.setPrimerApellido(rs.getString("apellido"));
					      j.setSegundoApellido(rs.getString("segApellido"));
					      j.setEdad(rs.getInt("edad"));
					      j.setPuntos(rs.getInt("puntos"));
				      }
				      
				      
				      //Debemos cerrar la conexion
				      rs.close();
				      return j;
					}catch(SQLException se){
						      //Se produce un error con la consulta
						      se.printStackTrace();
						      return j;
					}catch(Exception e){
						      //Se produce cualquier otro error
						      e.printStackTrace();
						      return j;
				
				}
				
				}
				
}