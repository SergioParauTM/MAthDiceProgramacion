package Actividad4;

public class Animal extends Thread {
	String nombre;
	
	public Animal(String nombre){
		this.nombre=nombre;
	}
	
	public void run(){ 

		for(int i =0; i<3; i++){
		try {
			System.out.println(this.nombre +",  main:  "+Thread.currentThread().getName()+ ", con prioridad: " +Thread.currentThread().getPriority());  
		 
				
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		}
		
	}
		 
	

	public static void main(String []args) throws InterruptedException{
		
		
		Animal tortuga = new Animal("TORTUGA");
		Animal guepardo = new Animal("GUEPARDO");
		Animal liebre = new Animal("LIEBRE");
	
		
		tortuga.setPriority(Thread.MIN_PRIORITY);
		guepardo.setPriority(Thread.MAX_PRIORITY);
		liebre.setPriority(Thread.NORM_PRIORITY);  
		
		
		tortuga.start();
		guepardo.start();
		liebre.start();
		
		
		tortuga.join();
		guepardo.join();
		liebre.join();
		
		
	}
	

}
