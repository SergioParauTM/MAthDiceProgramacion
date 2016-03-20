package Juego;



public class Jugador {
	


	
	private String nombre ;
	private String PrimerApellido  ;
	private String segundoApellido  ;
	
	private int puntos ;
	private int edad ;
	
	public Jugador(){
		
	}
	
	
	
	
	public Jugador(String nombre, String primerApellido, String segundoApellido, int edad) {
		this.nombre = nombre;
		PrimerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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


	public String getPrimerApellido() {
		return PrimerApellido;
	}


	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}


	public String getSegundoApellido() {
		return segundoApellido;
	}


	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}




	@Override
	public String toString() {
		String sf = "Jugador [nombre=" + nombre + ", PrimerApellido=" + PrimerApellido + ", segundoApellido="
				+ segundoApellido + ", puntos=" + puntos + ", edad=" + edad + "]";
		
		System.out.println(sf);
		
		return sf;
	}





}
