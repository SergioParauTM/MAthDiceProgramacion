package Ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import BBDD.AccesoBD;
import BBDD.usuariosDB;
import Inicio.Inicio;
import Juego.Jugador;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import Ventanas.Login;
import java.sql.Connection;






public class RegistroUsuario extends JFrame {

	//Contenedor Principal BorderLayout
	private JPanel contentPane;
	//Contenedor de los campos de registro
	private JPanel campos = new JPanel();
	
	//Campos
	private JTextField nombre;
	private JTextField Papellido;
	private JTextField Sapellido;
	private JTextField edad;
	 private String resultado;
	 RegistroUsuario registroU;
	
	

	//Manejador de la base de datos
	private AccesoBD db;
	private usuariosDB udb;
	  Inicio inicio ;
	  Jugador j;
	  private JTextField RegistroResultado;
	  
	  

	
	
		
		
		
		
		
	public RegistroUsuario() {
		  registroU = RegistroUsuario.this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 414);
		setTitle("REGISTRO");
		//Campos de registro
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		campos.setBounds(5, 5, 493, 177);

		contentPane.add(campos);
		campos.setLayout(null);
		
		JLabel lblEdad = new JLabel("Nombre");
		lblEdad.setBounds(0, 1, 101, 40);
		campos.add(lblEdad);
		
		nombre = new JTextField();
		nombre.setBounds(215, 1, 180, 40);
		campos.add(nombre);
		nombre.setColumns(10);
		
		JLabel labelApellido1 = new JLabel("Apellido1");
		labelApellido1.setBounds(0, 46, 188, 40);
		campos.add(labelApellido1);
		
		Papellido = new JTextField();
		Papellido.setBounds(215, 46, 180, 40);
		campos.add(Papellido);
		Papellido.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido2");
		lblApellido.setBounds(0, 91, 143, 40);
		campos.add(lblApellido);
		
		Sapellido = new JTextField();
		Sapellido.setBounds(215, 91, 180, 40);
		campos.add(Sapellido);
		Sapellido.setColumns(10);
		
		JLabel lblEdad_1 = new JLabel("Edad");
		lblEdad_1.setBounds(0, 136, 101, 40);
		campos.add(lblEdad_1);
		
		edad = new JTextField();
		edad.setBounds(215, 136, 180, 40);
		campos.add(edad);
		edad.setColumns(10);
		
		//Boton de registro
		JPanel panel = new JPanel();
		panel.setBounds(5, 193, 493, 68);
		contentPane.add(panel);
		
		//Registramos nuevo usuario y cerramos la conexion
		JButton btnNewButton = new JButton("Registro");
		btnNewButton.setBounds(24, 11, 364, 46);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Connection c = AccesoBD.getConexion();
				
				j=new Jugador(nombre.getText(),Papellido.getText(),Sapellido.getText(),Integer.parseInt(edad.getText()));
				udb = new usuariosDB(j);
				udb.insertarUsuario(AccesoBD.getConexion());
				System.out.println(udb.getResultado().toString());
				RegistroResultado.setText(udb.getResultado().toString());
				
				 
					if(RegistroResultado.getText().equals("Usuario registrado con exito")){
						registroU.setVisible(false);
						inicio= new Inicio();
						  inicio.setVisible(true);
						}else{

							RegistroResultado.setText(udb.getResultado().toString());
						}
			
			
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		contentPane.add(campos, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(5, 257, 493, 105);
		contentPane.add(panel_1);
		
		RegistroResultado = new JTextField();
		RegistroResultado.setEditable(false);
		RegistroResultado.setBounds(110, 26, 204, 68);
		panel_1.add(RegistroResultado);
		RegistroResultado.setColumns(10);
		
		
	}
	
	
}