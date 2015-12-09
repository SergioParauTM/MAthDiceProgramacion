package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
 private JTextField Nombre;
	private JTextField Apellidos;
	private JTextField Edad;
	private JTextField texto;
	private String nombre ;
	
	
	


	/**
	 * Launch the application.
	 */
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

	public void lanzarJuego() {
		Juego juego = new Juego();
		juego.setVisible(true);
		this.dispose();

	}

	/**
	 * Create the frame.
	 */
	public Login() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DATOS DEL JUGADOR");
		lblNewLabel.setBounds(10, 11, 115, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 52, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 89, 46, 14);
		contentPane.add(lblApellidos);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 124, 46, 14);
		contentPane.add(lblEdad);

		Nombre = new JTextField();
		Nombre.setBounds(98, 49, 182, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);

		Apellidos = new JTextField();
		Apellidos.setBounds(98, 86, 182, 20);
		contentPane.add(Apellidos);
		Apellidos.setColumns(10);

		Edad = new JTextField();
		Edad.setBounds(98, 121, 182, 20);
		contentPane.add(Edad);
		Edad.setColumns(10);

		texto = new JTextField();
		texto.setEditable(false);
		texto.setBounds(44, 197, 287, 53);
		contentPane.add(texto);
		texto.setColumns(10);

		JButton btnNewButton = new JButton("A jugar");
		btnNewButton.setBounds(81, 166, 250, 20);
		contentPane.add(btnNewButton);
		
	
		

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnNewButton) {

					if (Nombre.getText().length() != 0
							&& Apellidos.getText().length() != 0
							&& Edad.getText().length() != 0) {
							
						
						
						
						 

						lanzarJuego();

					} else {
						texto.setText("falta completar algún campo");
					}

				}
			}
				
		
			

		});
		
		
		

	}
	
	
	


}