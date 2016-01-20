package Juego;



public class Jugador {
	


	
	private String nombre ;
	private String apellido  ;
	
	private int puntos ;
	private int edad ;
	
	public Jugador(){
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		
		this.edad = edad;
	}


	public  String print() {
		return( "El jugador " + " " + nombre +" "   + apellido
				+ " tiene " + puntos + " puntos" + " y la edad de " +edad + " años" );
	}



}
