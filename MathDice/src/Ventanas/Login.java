package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BBDD.AccesoBD;
import BBDD.usuariosDB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Juego.Jugador;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Login extends JFrame {

	private String nombre, pApellido, seApellido;
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
	private AccesoBD abd;
	private usuariosDB udb;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

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
		setBounds(100, 100, 568, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		label = new JLabel("");
		label.setBounds(5, 5, 266, 40);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("DATOS DEL JUGADOR");
		lblNewLabel.setBounds(276, 5, 271, 40);
		contentPane.add(lblNewLabel);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(5, 50, 266, 40);
		contentPane.add(lblNombre);

		Nombre = new JTextField();
		Nombre.setBounds(276, 50, 271, 40);
		contentPane.add(Nombre);
		Nombre.setColumns(10);

		JLabel lblApellidos = new JLabel("1\u00BAApellido");
		lblApellidos.setBounds(5, 95, 266, 40);
		contentPane.add(lblApellidos);

		Primerapellido = new JTextField();
		Primerapellido.setBounds(276, 95, 271, 40);
		contentPane.add(Primerapellido);
		Primerapellido.setColumns(10);

		JLabel lblApellido = new JLabel("2\u00BA Apellido");
		lblApellido.setBounds(5, 140, 266, 40);
		contentPane.add(lblApellido);

		Secapellido = new JTextField();
		Secapellido.setBounds(276, 140, 271, 40);
		Secapellido.setColumns(10);
		contentPane.add(Secapellido);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(5, 185, 266, 40);
		contentPane.add(lblEdad);

		Edad = new JTextField();
		Edad.setBounds(276, 185, 271, 40);
		contentPane.add(Edad);
		Edad.setColumns(10);

		label_1 = new JLabel("");
		label_1.setBounds(5, 230, 266, 40);
		contentPane.add(label_1);

		JButton btnNewButton = new JButton("A jugar");
		btnNewButton.setBounds(276, 230, 271, 40);
		contentPane.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnNewButton) {

					try {

						if (Nombre.getText().length() != 0 && Primerapellido.getText().length() != 0
								&& Edad.getText().length() != 0 && Secapellido.getText().length() != 0) {

							Jugador j = null;
							Primerapellido.setText(j.getPrimerApellido());
							Secapellido.setText(j.getSegundoApellido());
							Edad.setText(String.valueOf(j.getEdad()));

							jugador = new Jugador(j.getId(),Nombre.getText(), pApellido, seApellido, j.getPuntos(), edad);

							lanzarJuego();

						} else {
							texto.setText("falta completar algún campo");

						}
					} catch (Exception ev) {
						texto.setText("se ha producido un error");
					}

				}

			}

		});

		label_2 = new JLabel("");
		label_2.setBounds(5, 275, 266, 45);
		contentPane.add(label_2);

		texto = new JTextField();
		texto.setBounds(276, 275, 271, 45);
		texto.setEditable(false);
		contentPane.add(texto);
		texto.setColumns(10);

		juego = new Juego();

	

		

	}

}