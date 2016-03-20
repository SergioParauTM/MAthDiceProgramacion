package Ventanas;

import javax.swing.JPanel;

import Juego.Jugador;

import javax.management.StringValueExp;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Perfil extends JPanel {

	private Jugador jugador;
	private JTextField nombre;
	private JTextField primerApellido;
	private JTextField segundoApellido;
	private JTextField edad;
	
	
	
	
	public void setJugador() {
		nombre.setText(jugador.getNombre().toString() + "asdasdasdasdasd");
		primerApellido.setText(jugador.getPrimerApellido());
		segundoApellido.setText(jugador.getSegundoApellido());
		edad.setText(String.valueOf(jugador.getEdad()));
		

	}
	
	
	public Perfil() {
		setLayout(null);
		
		nombre = new JTextField();
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nombre.setEditable(false);
		nombre.setBounds(83, 115, 208, 53);
		nombre.setColumns(10);
		add(nombre);
		
		primerApellido = new JTextField();
		primerApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		primerApellido.setEditable(false);
		primerApellido.setBounds(390, 201, 174, 45);
		primerApellido.setColumns(10);
		add(primerApellido);
		
		JLabel label_1 = new JLabel("1\u00BAApellido");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(390, 176, 132, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("2\u00BA Apellido");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(380, 256, 142, 14);
		add(label_2);
		
		segundoApellido = new JTextField();
		segundoApellido.setEditable(false);
		segundoApellido.setBounds(390, 281, 174, 53);
		segundoApellido.setColumns(10);
		add(segundoApellido);
		
		JLabel label_3 = new JLabel("Edad");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(379, 358, 89, 14);
		add(label_3);
		
		edad = new JTextField();
		edad.setEditable(false);
		edad.setBounds(390, 388, 186, 65);
		edad.setColumns(10);
		add(edad);
		
		JLabel fotoPerfil = new JLabel("");
		fotoPerfil.setBounds(35, 179, 256, 220);
		add(fotoPerfil);

		//DADO1
				ImageIcon fotoperfil =new ImageIcon(getClass().getResource(
						"img/bb8.png"));
				
				fotoPerfil.setEnabled(true);
				fotoPerfil.setIcon(fotoperfil);
		
	}

}
