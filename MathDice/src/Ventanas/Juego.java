package Ventanas;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BBDD.AccesoBD;
import BBDD.usuariosDB;
import Juego.Jugador;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;

public class Juego extends JPanel {
	
	
	private JLabel ResultadoObtenido, puntuacionTotal;
	private JLabel resultadoOperaciones;
	//Boton repetir
	private JButton reiniciar;
	
	//Manejador de la base de datos
	private AccesoBD adb;
	private usuariosDB udb;
	private String iduser;

	private JPanel contentPane;
	
	//Array de dados
	private ImageIcon[] dados3=new ImageIcon[3];
	private ImageIcon[] dados6=new ImageIcon[6];
	private ImageIcon[] dados12=new ImageIcon[12];

	
	private Random random=new Random();

	private int NDados12;
	private int[] NDados3=new int[3];
	private int[] NDados6=new int[2];
	
	

	private Jugador jugador;
	JLabel nombreJugador;
	JLabel puntuacion;
	private JLabel dado1,dado2,dado3;
	private JLabel dado4,dado5;
	private JLabel dado6;
	private JButton suma,resta;
	private JButton Mdice;
	private JTextField EditText;


	private boolean Cdado=true;
	private boolean ifSuma=true;
	private int operacion=0;
	private int numerosIntroducidos=0;

	
	//JLable de muestra de resultados
	
	/**
	 * Create the frame.
	 */
	
	public void setJugador(Jugador jugador) {
		this.jugador=jugador;

		nombreJugador.setText("Bienvenido al juego:  "
				+ jugador.getNombre().toString());
		
		puntuacionTotal.setText(String.valueOf(jugador.getPuntos()));
	
		
		iduser = jugador.getId();
		


	
	}
	public Juego() {


		setBackground(new Color(135, 206, 250));
		setBorder(new EmptyBorder(5, 5, 5, 5));

		setLayout(null);
		contentPane = this;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLayout(null);
		
		dado1 = new JLabel();
		dado1.setBounds(10, 10, 150, 150);
		contentPane.add(dado1);
		
		dado2 = new JLabel();
		dado2.setBounds(160, 10, 150, 150);
		contentPane.add(dado2);

		dado3 = new JLabel();
		dado3.setBounds(310, 10, 150, 150);
		contentPane.add(dado3);
		
		dado4 = new JLabel();
		dado4.setBounds(10, 160, 150, 150);
		contentPane.add(dado4);
		
		dado5 = new JLabel();
		dado5.setBounds(160, 160, 150, 150);
		contentPane.add(dado5);		

		dado6 = new JLabel("");
		dado6.setBounds(10, 310, 173, 173);
		contentPane.add(dado6);	
		
		//Colocamos los botones de suma y resta
		suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Cdado){
					EditText.setText(EditText.getText()+"+");
					Cdado=true;
					ifSuma=true;
					Mdice.setEnabled(false);
				}
			}
		});
		suma.setFont(new Font("Tahoma", Font.PLAIN, 24));
		suma.setBounds(641, 97, 195, 63);
		contentPane.add(suma);		
		
		resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Cdado){
					EditText.setText(EditText.getText()+"-");
					Cdado=true;
					ifSuma=false;
					Mdice.setEnabled(false);
				}
			}
		});
		
		//Texto del jugador
		nombreJugador = new JLabel("Bienvenido al juego: ");
		nombreJugador.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nombreJugador.setHorizontalAlignment(SwingConstants.LEFT);
		nombreJugador.setBounds(641, 10, 464, 44);
		contentPane.add(nombreJugador);
		resta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		resta.setBounds(910, 97, 195, 63);
		contentPane.add(resta);
		
		//Caja de resultados
		EditText = new JTextField();
		EditText.setEditable(false);
		EditText.setBounds(641, 173, 464, 63);
		EditText.setFont(new Font("Tahoma", Font.PLAIN, 36));
		contentPane.add(EditText);
		EditText.setColumns(10);
		
		//Colocamos el boton de resultado
		Mdice = new JButton("MATH DICE");
		Mdice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numerosIntroducidos>1){
					ResultadoObtenido.setText("Tu resultado es "+String.valueOf(operacion));
				
					if((NDados12+1)==operacion){
						resultadoOperaciones.setText("CORRECTO");
						jugador.setPuntos(jugador.getPuntos()+5);
						puntuacionTotal.setText(String.valueOf(Integer.parseInt(puntuacionTotal.getText()) + 5));
						
						udb = new usuariosDB(jugador);
						udb.ActualizarPuntuacion(AccesoBD.getConexion(), jugador.getPuntos());
					
					
					}else{
						resultadoOperaciones.setText(" TOCA INTÉNTARLO DE NUEVO");
					}
					
					reiniciar.setEnabled(true);
				}
			}
		});
		Mdice.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Mdice.setBounds(641, 247, 464, 63);
		contentPane.add(Mdice);
		Mdice.setEnabled(false);
		
		//Cajas de resultados
		ResultadoObtenido = new JLabel("");
		ResultadoObtenido.setHorizontalAlignment(SwingConstants.CENTER);
		ResultadoObtenido.setFont(new Font("Tahoma", Font.PLAIN, 36));
		ResultadoObtenido.setBounds(641, 341, 464, 41);
		contentPane.add(ResultadoObtenido);
		
		//Caja de OK
		resultadoOperaciones = new JLabel("");
		resultadoOperaciones.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resultadoOperaciones.setBounds(641, 398, 464, 41);
		contentPane.add(resultadoOperaciones);
		
		//BOTON REPETIR
		reiniciar = new JButton("Reinciar");
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				generarImagenes();
				AñadirLabelListener();
				reiniciar.setEnabled(false);
				
				
			}
		});
		reiniciar.setEnabled(false);
		reiniciar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		reiniciar.setBounds(641, 494, 464, 63);
		contentPane.add(reiniciar);
		
		puntuacion = new JLabel("Tu puntuacion es  :");
		puntuacion.setHorizontalAlignment(SwingConstants.LEFT);
		puntuacion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		puntuacion.setBounds(641, 65, 235, 21);
		add(puntuacion);
		
		 puntuacionTotal = new JLabel("1000000");
		puntuacionTotal.setHorizontalAlignment(SwingConstants.LEFT);
		puntuacionTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		puntuacionTotal.setBounds(886, 65, 235, 21);
		add(puntuacionTotal);
		
		
		//INICIALIZAR METODOS
		generarImagenes();
		AñadirLabelListener();
	}
	
	public void AñadirLabelListener(){
		
		dado1.addMouseListener(new ActionListenerDados());
		dado2.addMouseListener(new ActionListenerDados());
		dado3.addMouseListener(new ActionListenerDados());
		dado4.addMouseListener(new ActionListenerDados());
		dado5.addMouseListener(new ActionListenerDados());
		
		
	}
	
	public void generarImagenes(){
		
		dado1.setEnabled(true);
		dado2.setEnabled(true);
		dado3.setEnabled(true);
		dado4.setEnabled(true);
		dado5.setEnabled(true);
		
		for(int i=0;i<dados3.length;i++){
			dados3[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_3.png"));
		}
		for(int i=0;i<dados6.length;i++){
			dados6[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_6.png"));
		}
		for(int i=0;i<dados12.length;i++){
			dados12[i]=new ImageIcon(getClass().getResource("img/dode"+String.valueOf(i+1)+".png"));
		}

		
		//Colocamos los dados de 3 caras
		for(int i=0;i<NDados3.length;i++) NDados3[i]=random.nextInt(3); //El numero aleatorio
		dado1.setIcon(dados3[NDados3[0]]); //Imagen dentro de los JLabel
		dado1.setName("1");
		dado2.setIcon(dados3[NDados3[1]]);
		dado2.setName("2");
		dado3.setIcon(dados3[NDados3[2]]);
		dado3.setName("3");
		
		for(int i=0;i<NDados6.length;i++) NDados6[i]=random.nextInt(6);
		dado4.setIcon(dados6[NDados6[0]]);
		dado4.setName("4");
		dado5.setIcon(dados6[NDados6[1]]);
		dado5.setName("5");
	
	
		
		NDados12=random.nextInt(12);
		dado6.setIcon(dados12[NDados12]);		
	
		
		ResultadoObtenido.setText(null);
		resultadoOperaciones.setText(null);
		EditText.setText(null);
		
	
		Cdado=true;
		operacion=0;
		numerosIntroducidos=0;
		ifSuma=true;		
		
	}
	
	private int Resultado(int num){
		numerosIntroducidos++;
		if(numerosIntroducidos>1){
			if(ifSuma) operacion=operacion+num;
			else operacion=operacion-num;
		}else{
			operacion=num;
		}
		return operacion;
	}

	private class ActionListenerDados implements MouseListener {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel dado = (JLabel) e.getSource();
			int nombredado=Integer.parseInt(dado.getName().toString());
			
			if(Cdado==true){
				if(nombredado<4){
					
					int resultado= (NDados3[nombredado-1])+1;
					EditText.setText(EditText.getText()+String.valueOf(resultado));
				
				
				}else{
					System.out.println(String.valueOf(nombredado) + " ," + NDados6[nombredado-4]+1);
					int resultado= (NDados6[nombredado-4])+1;
					EditText.setText(EditText.getText()+String.valueOf(resultado));
				}
				
				if(nombredado<4){
					Resultado(NDados3[nombredado-1]+1);
				}else{
					Resultado(NDados6[nombredado-4]+1);
				}
				
				
				dado.setEnabled(false);
				
				
				
				Cdado=false;
	
			}
			

			if(dado.isEnabled()==false){
				dado.removeMouseListener(this);
			}
			
			if(EditText.getText().length()<=2){
					Mdice.setEnabled(false);
				
			}else{
				Mdice.setEnabled(true);
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

	}
}
