package Ventanas;

import javax.swing.JPanel;

import Juego.Jugador;

import javax.management.StringValueExp;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Perfil extends JPanel {

	private Jugador jugador;
	
	
	
	JLabel nombre, primerApellido,SegundoApellido,Edad;
	private JTextField Nombre;
	private JTextField txtPrimerApellido;
	private JTextField txtSegundoApellido;
	private JTextField txtEdad;
	

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
			
		nombre.setText(jugador.getNombre().toString());
		primerApellido.setText(jugador.getPrimerApellido().toString());
		SegundoApellido.setText(jugador.getSegundoApellido().toString());
		Edad.setText(String.valueOf(jugador.getEdad()).toString());
			

	

		}
	
	public Perfil() {
		setLayout(null);
		
		JLabel fotoPerfil = new JLabel("");
		fotoPerfil.setBounds(100, 120, 256, 220);
		add(fotoPerfil);


		
		
			ImageIcon fotoperfil =new ImageIcon(getClass().getResource(
						"img/bb8.png"));
				
				fotoPerfil.setEnabled(true);
				fotoPerfil.setIcon(fotoperfil);
				
				 nombre = new JLabel();
				 nombre.setHorizontalAlignment(SwingConstants.LEFT);
				 nombre.setText("asd");
				 nombre.setFont(new Font("Tahoma", Font.BOLD, 19));
				nombre.setBounds(473, 120, 155, 24);
				add(nombre);
				
				 primerApellido = new JLabel();
				 primerApellido.setHorizontalAlignment(SwingConstants.LEFT);
				 primerApellido.setFont(new Font("Tahoma", Font.BOLD, 19));
				 primerApellido.setText("asdasd");
				primerApellido.setBounds(493, 178, 155, 20);
				add(primerApellido);
				
				 SegundoApellido = new JLabel();
				 SegundoApellido.setText("qweqweqwe");
				 SegundoApellido.setFont(new Font("Tahoma", Font.BOLD, 19));
				 SegundoApellido.setHorizontalAlignment(SwingConstants.LEFT);
				SegundoApellido.setBounds(524, 226, 155, 20);
				add(SegundoApellido);
				
				 Edad = new JLabel();
				 Edad.setHorizontalAlignment(SwingConstants.LEFT);
				 Edad.setText("asdasdad");
				 Edad.setFont(new Font("Tahoma", Font.BOLD, 19));
				Edad.setBounds(524, 293, 140, 28);
				add(Edad);
				
				Nombre = new JTextField();
				Nombre.setEditable(false);
				Nombre.setText("Nombre");
				Nombre.setBounds(366, 125, 97, 20);
				add(Nombre);
				Nombre.setColumns(10);
				
				txtPrimerApellido = new JTextField();
				txtPrimerApellido.setEditable(false);
				txtPrimerApellido.setText("Primer Apellido");
				txtPrimerApellido.setBounds(367, 182, 108, 20);
				add(txtPrimerApellido);
				txtPrimerApellido.setColumns(10);
				
				txtSegundoApellido = new JTextField();
				txtSegundoApellido.setText("Segundo Apellido");
				txtSegundoApellido.setEditable(false);
				txtSegundoApellido.setBounds(366, 230, 155, 20);
				add(txtSegundoApellido);
				txtSegundoApellido.setColumns(10);
				
				txtEdad = new JTextField();
				txtEdad.setText("Edad");
				txtEdad.setEditable(false);
				txtEdad.setBounds(366, 301, 155, 20);
				add(txtEdad);
				txtEdad.setColumns(10);
				
				
		
	}
}
