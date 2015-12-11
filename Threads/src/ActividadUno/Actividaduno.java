package ActividadUno;

public class Actividaduno implements Runnable {

	int iteracion = -1;
	 /* inicializamos a -1 debido que el valor por defecto es 0 y al inicializar el thread nos añadria un +1 por lo que no nos daria el
	 	el valor real de la  posicion del thread */
					
		
	public Actividaduno(String nombre ){
		
		
						iteracion++;
						
							System.out.println("Bienvenido "+ iteracion);
						
					
				
				}
	@Override
	public void run() {
		for(int i=0; i<10; i ++){
			
			try {
				System.out.println("soy el hilo 2 y es mi ciclo número "+ i);
				Thread.sleep(1000);
				System.out.println("Finaliza el hilo "+i );
				
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
				
			}
			
		

	}
		
		
		
	}
				
				
	
		
		 
	        
	        
		
		
	
	


}
