package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import Juego.Jugador;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField txtBienvenidoAlJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBienvenidoAlJuego = new JTextField();
		txtBienvenidoAlJuego.setEditable(false);
		txtBienvenidoAlJuego.setEnabled(false);
		txtBienvenidoAlJuego.setBounds(280, 11, 144, 20);
		contentPane.add(txtBienvenidoAlJuego);
		txtBienvenidoAlJuego.setColumns(10);
		
	

		
		txtBienvenidoAlJuego.setText("Bienvenido al juego" );
	}
}
