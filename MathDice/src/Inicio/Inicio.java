package Inicio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BBDD.AccesoBD;
import BBDD.usuariosDB;
import Juego.Jugador;
import Ventanas.Login;
import Ventanas.RegistroUsuario;
import Ventanas.principal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Inicio extends JFrame {

	private JPanel contentPane;
	Login login;
	RegistroUsuario registro;
	 JComboBox comboBox;
	 private AccesoBD abd;
	private usuariosDB udb;
	Jugador j;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Inicio() {
		setAutoRequestFocus(false);
		setTitle("INICIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setMinimumSize(new Dimension(400, 350));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{56, 100, 0};
		gbl_contentPane.rowHeights = new int[]{75, 20, 41, 38, 38, 38, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 4.9E-324};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		 
		 JLabel lblUsuario = new JLabel("Usuario");
		 GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		 gbc_lblUsuario.fill = GridBagConstraints.HORIZONTAL;
		 gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		 gbc_lblUsuario.gridx = 0;
		 gbc_lblUsuario.gridy = 1;
		 contentPane.add(lblUsuario, gbc_lblUsuario);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 j=(Jugador)comboBox.getSelectedItem();
				
				j = new Jugador(j.getId(),j.getNombre(),j.getPrimerApellido(),j.getSegundoApellido(),j.getPuntos(),j.getEdad());
				
				lanzarJuego();
				
		
				
				
			}
		});
		
		 comboBox = new JComboBox();
		 GridBagConstraints gbc_comboBox = new GridBagConstraints();
		 gbc_comboBox.anchor = GridBagConstraints.NORTH;
		 gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		 gbc_comboBox.gridx = 1;
		 gbc_comboBox.gridy = 1;
		 contentPane.add(comboBox, gbc_comboBox);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		 
		 JButton YatengoCuenta = new JButton("Otra cuenta");
		 YatengoCuenta.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		 lanzarlogin();
		 		
		 		
		 	}
		 });
		 GridBagConstraints gbc_YatengoCuenta = new GridBagConstraints();
		 gbc_YatengoCuenta.fill = GridBagConstraints.BOTH;
		 gbc_YatengoCuenta.insets = new Insets(0, 0, 5, 0);
		 gbc_YatengoCuenta.gridwidth = 3;
		 gbc_YatengoCuenta.gridx = 0;
		 gbc_YatengoCuenta.gridy = 4;
		 contentPane.add(YatengoCuenta, gbc_YatengoCuenta);
		 
		 JButton Registrarse = new JButton("Registrarse");
		 Registrarse.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		lanzarRegistro();
		 	}
		 });
		 GridBagConstraints gbc_Registrarse = new GridBagConstraints();
		 gbc_Registrarse.fill = GridBagConstraints.BOTH;
		 gbc_Registrarse.gridwidth = 3;
		 gbc_Registrarse.gridx = 0;
		 gbc_Registrarse.gridy = 5;
		 contentPane.add(Registrarse, gbc_Registrarse);
		 
			udb = new usuariosDB(j);
			udb.JcomboxUser(comboBox, AccesoBD.getConexion());
		
		

			
	}
	
	
	
	public void lanzarJuego() {
		// juego.setJugador(jugador);
		principal jpanel = new principal();
		jpanel.setJugador(j);

		jpanel.setVisible(true);
		this.dispose();

	}
	
	
	public void lanzarlogin(){
		login=new Login();
		login.setVisible(true);
		this.dispose();
			
	}
	
	public void lanzarRegistro(){
		registro=new RegistroUsuario();
		registro.setVisible(true);
		this.dispose();

			
	}
	
	
}
