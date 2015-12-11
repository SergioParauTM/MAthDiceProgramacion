package temaDos;

import ActividadUno.Actividaduno;

public class Principal {
	
	public static void main (String args[]) throws InterruptedException{
		
		Thread uno = new Thread(new Actividaduno("ciclo 2"));
	
		uno.start();
		uno.join();

		System.out.println( uno +" terminado");
		
		
	}

}

