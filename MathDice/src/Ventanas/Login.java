package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Juego.Jugador;

public class Login extends JFrame {
	
	private String nombre, pApellido,seApellido;
	int edad;

	private JPanel contentPane;
 private JTextField Nombre;
	private JTextField Primerapellido;
	private JTextField Edad;
	private JTextField texto;
	private Perfil perfil;
	private Jugador jugador;
	private Juego juego;
	private JTextField Secapellido;
	
	


	public void lanzarJuego() {
		// juego.setJugador(jugador);
		 principal jpanel = new principal();
		 jpanel.setJugador(jugador);
	
		 jpanel.setVisible(true);
			this.dispose();
		
	
	}
	



	/**
	 * Create the frame.
	 */
	public Login() {
		
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DATOS DEL JUGADOR");
		lblNewLabel.setBounds(10, 11, 139, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 52, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblApellidos = new JLabel("1\u00BAApellido");
		lblApellidos.setBounds(10, 89, 78, 14);
		contentPane.add(lblApellidos);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 190, 46, 14);
		contentPane.add(lblEdad);
	

		Nombre = new JTextField();
		Nombre.setBounds(98, 49, 182, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);

		Primerapellido = new JTextField();
		Primerapellido.setBounds(98, 86, 182, 20);
		contentPane.add(Primerapellido);
		Primerapellido.setColumns(10);

		Edad = new JTextField();
		Edad.setBounds(98, 187, 182, 20);
		contentPane.add(Edad);
		Edad.setColumns(10);

		texto = new JTextField();
		texto.setEditable(false);
		texto.setBounds(44, 263, 287, 53);
		contentPane.add(texto);
		texto.setColumns(10);

		JButton btnNewButton = new JButton("A jugar");
		btnNewButton.setBounds(81, 232, 250, 20);
		contentPane.add(btnNewButton);
		
		JLabel lblApellido = new JLabel("2\u00BA Apellido");
		lblApellido.setBounds(10, 136, 78, 14);
		contentPane.add(lblApellido);
		
		Secapellido = new JTextField();
		Secapellido.setColumns(10);
		Secapellido.setBounds(98, 133, 182, 20);
		contentPane.add(Secapellido);
		
	
		

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (e.getSource() == btnNewButton) {
					
					try{
						
						
						if (Nombre.getText().length() != 0
								&& Primerapellido.getText().length() != 0
								&& Edad.getText().length() != 0 && Primerapellido.getText().length() != 0) {
								
							
							nombre = Nombre.getText().toString();
							pApellido=Primerapellido.getText().toString();
							seApellido= Secapellido.getText().toString();
							edad = Integer.parseInt(Edad.getText().toString());
									

								jugador = new Jugador(nombre,pApellido,seApellido,edad);
							
							
							lanzarJuego();
							
							
						

						} else {
							texto.setText("falta completar algún campo");
							
						}
						}catch(Exception ev){
							texto.setText("se ha producido un error");
						}

				
				
			}
				
		
			}

		});
		
		juego = new Juego();
		

	}
	

	
	
	
}