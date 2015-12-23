package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import Juego.Jugador;

import javax.swing.JLabel;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField txtBienvenidoAlJuego;
	private ImageIcon [] dados3 = new ImageIcon[3];

	private ImageIcon [] dados6 = new ImageIcon[6];

	private ImageIcon [] dados12 = new ImageIcon[12];
	
	private Random random = new Random();


	

	
	
	
	
	
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
	
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBienvenidoAlJuego = new JTextField("Bienvenido");
		txtBienvenidoAlJuego.setEditable(false);
		txtBienvenidoAlJuego.setEnabled(false);
		txtBienvenidoAlJuego.setBounds(692, 31, 144, 20);
		contentPane.add(txtBienvenidoAlJuego);
		txtBienvenidoAlJuego.setColumns(10);
		

		JLabel dado1 = new JLabel();
		dado1.setBounds(10, 31, 150, 150);
		contentPane.add(dado1);
		
		JLabel dado2 = new JLabel();
		dado2.setBounds(170, 34, 150, 150);
		contentPane.add(dado2);
		
		JLabel dado3 = new JLabel();
		dado3.setBounds(334, 34, 150, 150);
		contentPane.add(dado3);
		
		JLabel dado4 = new JLabel();
		dado4.setBounds(334, 199, 150, 150);
		contentPane.add(dado4);
		
		JLabel dado5 = new JLabel();
		dado5.setBounds(153, 199, 150, 150);
		contentPane.add(dado5);
		
		JLabel dado6 = new JLabel();
		dado6.setBounds(232, 360, 150, 150);
		contentPane.add(dado6);
		
		
		
		

		
		for(int i=0; i<dados3.length; i++){
		dados3[i]= new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_3.png"));
		
	
		dado1.setIcon(dados3[i]);
		dado2.setIcon(dados3[i]);
		dado3.setIcon(dados3[i]);
			
		}
		for(int i=0; i<dados6.length; i++){
			dados6[i]= new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_6.png"));
			dado4.setIcon(dados6[i]);
			dado5.setIcon(dados6[i]);
		}
		for(int i=0; i<dados12.length; i++){
			dados12[i]= new ImageIcon(getClass().getResource("img/dode"+String.valueOf(i+1)+".png"));
			dado6.setIcon(dados12[i]);
		}
		contentPane.add(txtBienvenidoAlJuego);

	
		
		
		
		
		
		

	}
}


