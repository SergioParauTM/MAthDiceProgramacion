package ActividadTres;

public class CountThreadTest  implements Runnable {
		int from; //  definimos la variable de caracter entero
				
		int to; // definimos la variable de caracter entero
		
		public CountThreadTest(int from, int to) { // creamos el contsructor de la clase con las variables anteriormente definidas
		this.from = from;
		this.to = to;
		}

		public void run() {
		for (int i=from; i<to; i++) {
		System.out.println(toString() + " i : " + i);
		/* 
		 * Al decir que la clase extiende de la clase Thread declaramos el metodo run. que sera el que ejecute el Thread
		 *  En este caso el metodo run contiene un for que hace el recorrido empezando por la variable from que definiremos en el main 
		 * hasta la variable to que también definiremos en el main
		 * devolviendonos un mensaje con elvalor de tipo cadena con el nombre del hilo en ejecución, y prioridad y una posicion


		*/
		} 
		} 
		/* 
		 * dentro del main lo que hacemos es recorrer 10 posiciones, dentro del for inicializamos la clase CountThreadTest donde damos los valores
		 * del constructor y inicializamos el metodo run de la clase CountThreadTest

		*/
		public static void main(String[] args) {
		for (int i=0; i<10; i++) { // hace un re
			CountThreadTest t = new CountThreadTest(i*10,(i+1)*10);
		
	       Thread thread = new Thread(t);
	        thread.start(); // start invoca a run de CountThreadTest
		}
		} 
		} 
		