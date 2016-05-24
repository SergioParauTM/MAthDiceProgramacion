package Ventanas;

import javax.swing.JPanel;

import Juego.Jugador;

import javax.management.StringValueExp;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.sql.Connection;

import BBDD.AccesoBD;
import BBDD.usuariosDB;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Perfil extends JPanel {

	private Jugador jugador;
	
	
	
	JTextField nombre;
	JTextField primerApellido;
	JTextField SegundoApellido;
	JTextField Edad;
	private JTextField Nombre;
	private JTextField txtPrimerApellido;
	private JTextField txtSegundoApellido;
	private JTextField txtEdad;
	private JButton Actualizar;
	

	private usuariosDB udb;
	private JTextField puntos;
	private JTextField puntostotales;
	private JLabel lblNewLabel;
	private JTextField txtMensaje;
	String resultado;

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
		

		nombre.setText(jugador.getNombre().toString());
		primerApellido.setText(jugador.getPrimerApellido().toString());
		SegundoApellido.setText(jugador.getSegundoApellido().toString());
		Edad.setText(String.valueOf(jugador.getEdad()).toString());
		puntostotales.setText(String.valueOf(jugador.getPuntos()).toString());

	udb = new usuariosDB(jugador);

		}
	
	public void getResultado(Jugador j){
		this.jugador = j;
		
		resultado=j.getResultado();
		
		System.out.println(resultado);
		
		
	}
	
	public Perfil() {
	
		JLabel fotoPerfil = new JLabel("");
			ImageIcon fotoperfil =new ImageIcon(getClass().getResource(
						"img/bb8.png"));
				
				fotoPerfil.setEnabled(true);
				fotoPerfil.setIcon(fotoperfil);
				
				 nombre = new JTextField();
				 nombre.setHorizontalAlignment(SwingConstants.LEFT);
				 nombre.setText("asd");
				 nombre.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				 primerApellido = new JTextField();
				 primerApellido.setHorizontalAlignment(SwingConstants.LEFT);
				 primerApellido.setFont(new Font("Tahoma", Font.BOLD, 15));
				 primerApellido.setText("asdasd");
				
				 SegundoApellido = new JTextField();
				 SegundoApellido.setText("qweqweqwe");
				 SegundoApellido.setFont(new Font("Tahoma", Font.BOLD, 15));
				 SegundoApellido.setHorizontalAlignment(SwingConstants.LEFT);
				
				 Edad = new JTextField();
				 Edad.setHorizontalAlignment(SwingConstants.LEFT);
				 Edad.setText("asdasdad");
				 Edad.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				Nombre = new JTextField();
				Nombre.setEditable(false);
				Nombre.setText("Nombre");
				Nombre.setColumns(10);
				
				txtPrimerApellido = new JTextField();
				txtPrimerApellido.setEditable(false);
				txtPrimerApellido.setText("Primer Apellido");
				txtPrimerApellido.setColumns(10);
				
				txtSegundoApellido = new JTextField();
				txtSegundoApellido.setText("Segundo Apellido");
				txtSegundoApellido.setEditable(false);
				txtSegundoApellido.setColumns(10);
				
				txtEdad = new JTextField();
				txtEdad.setText("Edad");
				txtEdad.setEditable(false);
				txtEdad.setColumns(10);
				
				Actualizar = new JButton("Actualizar");
				Actualizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						Connection c = AccesoBD.getConexion();
					
						jugador.setNombre(nombre.getText());
						jugador.setPrimerApellido(primerApellido.getText());
						jugador.setSegundoApellido(SegundoApellido.getText());
						jugador.setEdad(Integer.valueOf(Edad.getText()));
						udb = new usuariosDB(jugador);
		
					udb.actualizarUser(AccesoBD.getConexion());
					
					System.out.println(udb.getResultado().toString());
			
				txtMensaje.setText(udb.getResultado().toString());
					
					
						
					
					}
				});
				
				puntos = new JTextField();
				puntos.setEditable(false);
				puntos.setText("Puntos");
				puntos.setColumns(10);
				
				puntostotales = new JTextField();
				puntostotales.setEditable(false);
				puntostotales.setText("asdasdad");
				puntostotales.setHorizontalAlignment(SwingConstants.LEFT);
				puntostotales.setFont(new Font("Tahoma", Font.BOLD, 15));
				
				lblNewLabel = new JLabel("Mensaje");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				
				txtMensaje = new JTextField();
				txtMensaje.setHorizontalAlignment(SwingConstants.LEFT);
				txtMensaje.setFont(new Font("Tahoma", Font.PLAIN, 18));
				txtMensaje.setEditable(false);
				txtMensaje.setColumns(10);
				GroupLayout groupLayout = new GroupLayout(this);
				groupLayout.setHorizontalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(fotoPerfil, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(34)
											.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(164)
											.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(24)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(Actualizar, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(txtPrimerApellido, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(primerApellido, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(Nombre, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(nombre, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(txtSegundoApellido, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(SegundoApellido, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(Edad, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(puntos, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(puntostotales, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))))))
							.addContainerGap(283, Short.MAX_VALUE))
				);
				groupLayout.setVerticalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(35)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(fotoPerfil, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(nombre, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(primerApellido, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPrimerApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtSegundoApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(SegundoApellido, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(Edad, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(puntos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(puntostotales, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(43)
							.addComponent(Actualizar, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(131))
				);
				setLayout(groupLayout);
				
			
				
		
	}
}
