package Ventanas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.sql.Connection;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BBDD.AccesoBD;
import BBDD.usuariosDB;
import Juego.Jugador;

import java.awt.FlowLayout;

public class principal extends JFrame  {
	Juego juego = new Juego();
	Perfil perfil = new Perfil();
	Login login = new Login();
	Jugador jugador = new Jugador();
	 private AccesoBD abd;
	private usuariosDB udb;
	
	

	private JPanel contentPane;
	static principal frame;
	JMenuItem menuItemA1, menuItemA2;
	
	final static String JUEGO = "Juego";
	final static String PERFIL = "Perfil";
	String iduser;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public void setJugador(Jugador jugador){
		this.jugador=jugador;
		
		iduser=jugador.getId();
			juego.setJugador(jugador);
		perfil.setJugador(jugador);
	}

	
	
	
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		setMinimumSize(new Dimension(1400,800));
		setTitle("juego");
		juego.generarImagenes();
        menuBar();
	        contentPane.add(juego, JUEGO );
	    	contentPane.add(perfil, PERFIL);
	    	
	    
	
	  
	     // Adding the contentPane (JPanel) and buttonPanel to JFrame.
	  
	     
	        
	}
	
	
	public void menuBar(){
		
		 JMenuBar menuBar = new JMenuBar();
        
	        JMenu menuA = new JMenu("Ventanas");
	         menuItemA1 = new JMenuItem(JUEGO);
	         menuItemA2 = new JMenuItem(PERFIL);
	        menuA.add(menuItemA1);
	        menuA.add(menuItemA2);

	        
	      
	        menuItemA1.addActionListener(new ActionListener(){
	 
	            @Override
	            public void actionPerformed(ActionEvent ae) {
	            	 CardLayout cl = (CardLayout)(contentPane.getLayout());
	 			    cl.show(contentPane, JUEGO);
	 			    
	 			   Connection c = AccesoBD.getConexion();

	 				udb = new usuariosDB(jugador);
	 				jugador = udb.usuarioPorID(AccesoBD.getConexion(), iduser);
	 				
	 				juego.setJugador(jugador);
	 				setTitle("juego");
	 				
	 				
	 				
	 			    
	            }
	        });
	        
	        menuItemA2.addActionListener(new ActionListener(){
	       	 
	            @Override
	            public void actionPerformed(ActionEvent ae) {
	           	 CardLayout cl = (CardLayout)(contentPane.getLayout());
	 			    cl.show(contentPane, PERFIL);
	 			   Connection c = AccesoBD.getConexion();

	 				udb = new usuariosDB(jugador);
	 				jugador = udb.usuarioPorID(AccesoBD.getConexion(), iduser);
	 				perfil.setJugador(jugador);
	 				setTitle("perfil");
	            }
	        });
	         
	
	        
	        JMenu menuB = new JMenu("Salir");
	        JMenuItem menuItemB1 = new JMenuItem("Seguro que quiero salir");
	        menuItemB1.addActionListener(new ActionListener(){
	 
	            @Override
	            public void actionPerformed(ActionEvent ae) {
	                System.exit(0);
	            }
	        });
	        menuB.add(menuItemB1);
	 
	   
	         
	        menuBar.add(menuA);
	        menuBar.add(menuB);
	        this.setJMenuBar(menuBar);
	        
	    
		
	}
	


}
