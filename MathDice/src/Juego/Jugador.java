package Juego;
import java.io.ObjectInputStream.GetField;

import Ventanas.Login;


public class Jugador {
	
Login login = new Login();

	
	String nombre ;
	String apellido  ;
	
	int puntos ;
	int edad ;
	
	
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
