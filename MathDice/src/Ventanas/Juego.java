package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import Juego.Jugador;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Juego extends JFrame {
	
	//Declaramos las variables

	private JPanel contentPane;

	private Random random = new Random();
	int valor = 0;
	int valor1 = 0;
	int valor2 = 0;
	int valor3 = 0;
	int valor4 = 0;
	int valor5 = 0;
	String resta = "-";
	String suma = "+";
	private JButton Reiniciar;
	
	private Jugador jugador;
	private JLabel dado1, dado2,dado3,dado4,dado5,dado6;

	private JLabel lbBienvenidoalJuego;
	private JTextField mostrar;

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					
					Login frame = new Login();
					frame.setVisible(true);
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	//creamos el metodo que nos devolverá el nombre que hay en la clase jugador

	public void setJugador(Jugador jugador) {

		this.jugador = jugador;

		lbBienvenidoalJuego.setText("Bienvenido al juego"
				+ jugador.getNombre().toString());

	}
	
	

	public Juego() {
		
	

		jugador = new Jugador(); //llamamos a la clase Jugador
		
		//inicializamos los componentes de la aplicacion

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1277, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		mostrar = new JTextField();
		mostrar.setEnabled(false);
		mostrar.setEditable(false);
		mostrar.setFont(new Font("Century", Font.BOLD, 25));
		mostrar.setBounds(785, 189, 371, 78);
		contentPane.add(mostrar);
		mostrar.setColumns(10);

		lbBienvenidoalJuego = new JLabel(); //nos devolvera el valor del metodo setJugador
		lbBienvenidoalJuego.setFont(new Font("Verdana", Font.BOLD, 16));
		lbBienvenidoalJuego.setBounds(802, 11, 354, 21);
		contentPane.add(lbBienvenidoalJuego);

		JLabel textoresultado = new JLabel();
		textoresultado.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		textoresultado.setHorizontalAlignment(SwingConstants.CENTER);
		textoresultado.setBounds(766, 437, 413, 99);
		contentPane.add(textoresultado);

		dado1 = new JLabel();
		dado1.setBackground(Color.LIGHT_GRAY);
		dado1.setBounds(10, 31, 150, 150);
		contentPane.add(dado1);
		
		dado1.addMouseListener(new MouseAdapter() { //esta funcion hace referencia a cuando hagamos click en la imagen

			public void mouseClicked(MouseEvent e) {

				if (dado1.isEnabled() == true
						&& mostrar.getText().endsWith("+")
						|| mostrar.getText().endsWith("-")
						|| mostrar.getText().length() == 0) { //mientras se cumpla esta condicion nos devolverá lo que hay dentro
					
					mostrar.setText(mostrar.getText() + valor1); //devolverá  lo que hay dentro + el valor de la imagen que generamos con el random
					dado1.setEnabled(false); //lo que hará es volver inhabilitado el jlabel 

				}

			}
		});

	 dado2 = new JLabel();
		dado2.setBackground(Color.LIGHT_GRAY);
		dado2.setBounds(170, 34, 150, 150);
		contentPane.add(dado2);
		
		dado2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (dado2.isEnabled() == true
						&& mostrar.getText().endsWith("+")
						|| mostrar.getText().endsWith("-")
						|| mostrar.getText().length() == 0) {
					mostrar.setText(mostrar.getText() + valor2);

					dado2.setEnabled(false);
				}

			}
		});

		 dado3 = new JLabel();
		dado3.setBackground(Color.LIGHT_GRAY);
		dado3.setBounds(334, 34, 150, 150);
		contentPane.add(dado3);
		

		dado3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				if (dado3.isEnabled() == true
						&& mostrar.getText().endsWith("+")
						|| mostrar.getText().endsWith("-")
						|| mostrar.getText().length() == 0) {
					mostrar.setText(mostrar.getText() + valor3);
					dado3.setEnabled(false);

				}

			}
		});
		

		 dado4 = new JLabel();
		dado4.setBackground(Color.LIGHT_GRAY);
		dado4.setBounds(180, 195, 150, 150);
		contentPane.add(dado4);
		

		dado4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (dado4.isEnabled() == true
						&& mostrar.getText().endsWith("+")
						|| mostrar.getText().endsWith("-")
						|| mostrar.getText().length() == 0) {
					mostrar.setText(mostrar.getText() + valor4);
					dado4.setEnabled(false);

				}

			}
		});

		 dado5 = new JLabel();
		dado5.setBackground(Color.LIGHT_GRAY);
		dado5.setBounds(10, 192, 150, 150);
		contentPane.add(dado5);
		

		dado5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (dado5.isEnabled() == true
						&& mostrar.getText().endsWith("+")
						|| mostrar.getText().endsWith("-")
						|| mostrar.getText().length() == 0) {
					mostrar.setText(mostrar.getText() + valor5);
					dado5.setEnabled(false);

				}

			}
		});

		 dado6 = new JLabel();
		dado6.setBackground(Color.LIGHT_GRAY);
		dado6.setBounds(80, 423, 150, 150);
		contentPane.add(dado6);
		
		
		//FIN JLABEL IMAGENES

		
		//INICIO BOTONES OPERADORES
		
		JButton btnNewButton = new JButton("+"); //BOTON SUMA
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//MENTRAS SE CUMPLAN ESTAS CONDICIONES NO HARÁ NADA EL OPERADOR
				if (mostrar.getText().endsWith("-")
						&& mostrar.getText().endsWith("+")) {

				} else if (mostrar.getText().endsWith("+")) {

				} else if (mostrar.getText().length() == 0) {

				} else {
					mostrar.setText(mostrar.getText() + suma); // DEVUELVE EL SIGNO "+"
				}

			}
		});
		btnNewButton.setBounds(785, 59, 115, 99);
		contentPane.add(btnNewButton);

		
		//fin operador suma
		
		JButton btnNewButton_1 = new JButton("-"); //BOTON RESTA
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MENTRAS SE CUMPLAN ESTAS CONDICIONES NO HARÁ NADA EL OPERADOR
				if (mostrar.getText().endsWith("+")) {

				} else if (mostrar.getText().endsWith("-")) {

				} else if (mostrar.getText().length() == 0) {

				} else {
					mostrar.setText(mostrar.getText() + resta); // DEVUELVE EL SIGNO "-"
				}
			}
		});
		
		//FIN BOTONES OPERADORES

		JLabel resultado = new JLabel(""); // NOS DEVOLVERA EL RESULTADO DE LA OPERACION
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setFont(new Font("Perpetua Titling MT", Font.BOLD, 19));
		resultado.setBounds(834, 373, 290, 53);
		contentPane.add(resultado);

		btnNewButton_1.setBounds(1035, 59, 121, 99);
		contentPane.add(btnNewButton_1);

		
		//BOTON QUE REALIZARÁ LAS OPERACIONES 
		JButton btnNewButton_2 = new JButton("MATHDICE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mostrar.getText().length() == 3) { // MIENTRAS EL NUMERO DE CARACTERES SEA 3 Y DEPENDIENDO DE LOS SIGNOS REALIZARÁ OPERACIONES
					int u = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(0))); //RECUPERAR LA POSICION DEL JTEXTFIELD
					String d = String.valueOf(mostrar.getText().charAt(1));
					int t = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(2)));
					if (d.equals("-")) {
						int resta = u - t;
						resultado.setText("El resultado es : "
								+ Integer.toString(resta));
					} else {
						int suma = u + t;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					}
				}
				
				// FIN CUANDO ES IGUAL A 3 
				
				
				if (mostrar.getText().length() == 5) {// MIENTRAS EL NUMERO DE CARACTERES SEA 5 Y DEPENDIENDO DE LOS SIGNOS REALIZARÁ OPERACIONES
					int u = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(0)));
					String d = String.valueOf(mostrar.getText().charAt(1));
					int t = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(2)));
					String c = String.valueOf(mostrar.getText().charAt(3));
					int ci = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(4)));
					if (d.equals("-") && c.equals("-")) {
						int resta = u - t - ci;
						resultado.setText("El resultado es : "
								+ Integer.toString(resta));
					} else if (d.equals("+") && c.equals("+")) {
						int suma = u + t + ci;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-")) {
						int suma = u + t - ci;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("+")) {
						int suma = u - t + ci;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					}
				}
				//FIN CUANDO ES IGUAL A 5

				if (mostrar.getText().length() == 7) { // MIENTRAS EL NUMERO DE CARACTERES SEA 7 Y DEPENDIENDO DE LOS SIGNOS REALIZARÁ OPERACIONES
					int u = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(0)));
					String d = String.valueOf(mostrar.getText().charAt(1));
					int t = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(2)));
					String c = String.valueOf(mostrar.getText().charAt(3));
					int ci = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(4)));
					String se = String.valueOf(mostrar.getText().charAt(5));
					int si = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(6)));
					if (d.equals("-") && c.equals("-") && se.equals("-")) {
						int resta = u - t - ci - si;
						resultado.setText("El resultado es : "
								+ Integer.toString(resta));
					} else if (d.equals("+") && c.equals("+") && se.equals("+")) {
						int suma = u + t + ci + si;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-")
							&& se.equalsIgnoreCase("-")) {
						int suma = u + t - ci - si;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-") && se.equals("+")) {
						int suma = u + t - ci + si;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));

					} else if (d.equals("+") && c.equals("+") && se.equals("-")) {
						int suma = u + t + ci - si;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("+") && se.equals("+")) {
						int suma = u - t - ci + si;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("+") && se.equals("-")) {
						int suma = u - t + ci - si;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					}
				}
				
				
				//FIN CUANDO ES IGUAL A 7 

				if (mostrar.getText().length() == 9) { // MIENTRAS EL NUMERO DE CARACTERES SEA 9 Y DEPENDIENDO DE LOS SIGNOS REALIZARÁ OPERACIONES
					int u = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(0)));
					String d = String.valueOf(mostrar.getText().charAt(1));
					int t = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(2)));
					String c = String.valueOf(mostrar.getText().charAt(3));
					int ci = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(4)));
					String se = String.valueOf(mostrar.getText().charAt(5));
					int si = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(6)));
					String oc = String.valueOf(mostrar.getText().charAt(7));
					int nu = Integer.parseInt(String.valueOf(mostrar.getText()
							.charAt(8)));

					if (d.equals("-") && c.equals("-") && se.equals("-")
							&& oc.equals("-")) {
						int resta = u - t - ci - si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(resta));
					} else if (d.equals("+") && c.equals("+") && se.equals("+")
							&& oc.equals("+")) {
						int suma = u + t + ci + si + nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));

					} else if (d.equals("+") && c.equals("+")
							&& se.equalsIgnoreCase("+") && oc.equals("-")) {
						int suma = u + t + ci + si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("+") && se.equals("-")
							&& oc.equals("+")) {
						int suma = u + t + ci - si + nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("+") && se.equals("-")
							&& oc.equals("-")) {
						int suma = u + t + ci - si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-") && se.equals("+")
							&& oc.equals("-")) {
						int suma = u + t - ci + si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-") && se.equals("-")
							&& oc.equals("+")) {
						int suma = u + t - ci - si + nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-") && se.equals("-")
							&& oc.equals("-")) {
						int suma = u + t - ci - si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-") && se.equals("+")
							&& oc.equals("+")) {
						int suma = u + t - ci + si + nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("-") && se.equals("-")
							&& oc.equals("+")) {
						int suma = u - t - ci - si + nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("-") && se.equals("+")
							&& oc.equals("-")) {
						int suma = u - t - ci + si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("+") && se.equals("-")
							&& oc.equals("-")) {
						int suma = u - t + ci - si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("+") && se.equals("-")
							&& oc.equals("+")) {
						int suma = u - t + ci - si + nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("+") && se.equals("+")
							&& oc.equals("-")) {
						int suma = u - t + ci + si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("-") && c.equals("-") && se.equals("+")
							&& oc.equals("+")) {
						int suma = u - t - ci + si + nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					} else if (d.equals("+") && c.equals("-") && se.equals("-")
							&& oc.equals("-")) {
						int suma = u + t - ci - si - nu;
						resultado.setText("El resultado es : "
								+ Integer.toString(suma));
					}
				}
				
				// FIN CUANDO ES IGUAL A 9
				
				// COMPARAR EL VALOR DEL RESULTADO CON EL VALOR DEL DADO6

				if (resultado.getText().length() == 19) { // MIENTRAS EL NUMERO DE CARACTERES SEA 19 NOS VEVOLVERÁ EL ULTIMO VALOR

					String texto = resultado.getText().toString();
					int operacion = Integer.parseInt(String.valueOf(texto
							.charAt(18))); //DEVOLVERÁ EL ULTIMO CARACTER
					
					System.out.println( operacion);
					if ( operacion <=0|| operacion != valor ) {
						
						textoresultado.setText("INTENTALO DE NUEVO");
					} else {
						textoresultado.setText("CORRECTO");
					}
				} else if (resultado.getText().length() == 20 ) {

					String texto = resultado.getText().toString();
					
					String operacion = (String.valueOf(texto
							.charAt(18)));
					String operacion2 = (String.valueOf(texto
							.charAt(19)));
					

					String dosValores = (operacion + operacion2);
					int total = Integer.parseInt(dosValores);
					
					
					if (valor != total || total <=0) {
						textoresultado.setText("INTENTALO DE NUEVO");
					} else {
						textoresultado.setText("CORRECTO");
					}
				}
					
				Reiniciar.setEnabled(true);
			}
		});
		btnNewButton_2.setBounds(785, 292, 371, 53);
		contentPane.add(btnNewButton_2);

		 Reiniciar = new JButton("REINICIAR");
		 Reiniciar.setEnabled(false);
		Reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				generarimagenes();
				mostrar.setText(null);
				resultado.setText(null);
				textoresultado.setText(null);
			Reiniciar.setEnabled(false);
				
				

			}
		});
		Reiniciar.setBounds(855, 564, 247, 66);
		contentPane.add(Reiniciar);

	}
	
	public void generarimagenes(){
		dado1.setEnabled(true);
		dado1.setIcon(new ImageIcon(getClass().getResource(
				"img/dado" + String.valueOf(valor1 = random.nextInt(3) + 1)
						+ "_3.png")));
		dado2.setEnabled(true);
		dado2.setIcon(new ImageIcon(getClass().getResource(
				"img/dado" + String.valueOf(valor2 = random.nextInt(3) + 1)
						+ "_3.png")));
		dado3.setEnabled(true);
		dado3.setIcon(new ImageIcon(getClass().getResource(
				"img/dado" + String.valueOf(valor3 = random.nextInt(3) + 1)
						+ "_3.png")));
		dado4.setEnabled(true);
		dado4.setIcon(new ImageIcon(getClass().getResource(
				"img/dado" + String.valueOf(valor4 = random.nextInt(6) + 1)
						+ "_6.png")));
		
		dado5.setEnabled(true);
		dado5.setIcon(new ImageIcon(getClass().getResource(
				"img/dado" + String.valueOf(valor5 = random.nextInt(6) + 1)
						+ "_6.png")));
		
	
		dado6.setIcon(new ImageIcon(getClass().getResource(
				"img/dode" + String.valueOf(valor = random.nextInt(12) + 1)
						+ ".png")));
		
	}
}
