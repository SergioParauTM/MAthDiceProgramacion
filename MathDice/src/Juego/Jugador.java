package Juego;

import java.sql.Connection;

import javax.swing.JComboBox;

import BBDD.usuariosDB;

public class Jugador {
	


	private String id;
	private String nombre ;
	private String PrimerApellido  ;
	private String segundoApellido  ;
	usuariosDB udb;
	private int puntos ;
	private int edad ;
	private String resultado;
	
	public Jugador(){
		
	}
	
	
	
	
	
	
	public Jugador(String id, int puntos) {
		super();
		this.id = id;
		this.puntos = puntos;
	}






	public Jugador(String id, String nombre, String primerApellido, String segundoApellido, int puntos, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		PrimerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.puntos = puntos;
		this.edad = edad;
	}






	public Jugador(String nombre, String primerApellido, String segundoApellido, int edad) {
		this.nombre = nombre;
		PrimerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
	}


	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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
		
		String Resultado = id + "-" +nombre + "  " + PrimerApellido ;
				
				
		return Resultado; 
	}






	public String getResultado() {
		return resultado;
	}




	public void setResultado(String resultado) {
		this.resultado = resultado;
	}




	





}
