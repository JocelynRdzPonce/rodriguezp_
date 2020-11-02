package serie;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroP;
	private JTextField txtNumeroS;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
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
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 255);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumeroP = new JTextField();
		txtNumeroP.setBackground(new Color(230, 230, 250));
		txtNumeroP.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtNumeroP.setBounds(187, 31, 86, 20);
		contentPane.add(txtNumeroP);
		txtNumeroP.setColumns(10);
		
		txtNumeroS = new JTextField();
		txtNumeroS.setBackground(new Color(230, 230, 250));
		txtNumeroS.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtNumeroS.setBounds(187, 62, 86, 20);
		contentPane.add(txtNumeroS);
		txtNumeroS.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBackground(new Color(230, 230, 250));
		txtIteraciones.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtIteraciones.setBounds(187, 93, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numeroP, numeroS, numeroT, iteracion, x=0;
				String respuesta="";
				numeroP= Integer.parseInt(txtNumeroP.getText());
				numeroS= Integer.parseInt(txtNumeroS.getText());
				iteracion= Integer.parseInt(txtIteraciones.getText());
				respuesta= String.valueOf(numeroP) +" "+ String.valueOf(numeroS);
				do {
					numeroT=numeroP+numeroS;
					respuesta =respuesta +" "+ String.valueOf(numeroT);
					numeroP= numeroS;
					numeroS= numeroT;
					x=x+1;
				}while(x<iteracion);
				JOptionPane.showMessageDialog(null, "RESPUESTA: "+ " "+ respuesta);
			}
		});
		btnCalcular.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnCalcular.setBackground(new Color(188, 143, 143));
		btnCalcular.setBounds(20, 144, 89, 33);
		contentPane.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumeroP.setText(null);
				txtNumeroS.setText(null);
				txtIteraciones.setText(null);
				
			}
		});
		btnLimpiar.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnLimpiar.setBackground(new Color(188, 143, 143));
		btnLimpiar.setBounds(130, 144, 89, 33);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnSalir.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnSalir.setBackground(new Color(188, 143, 143));
		btnSalir.setBounds(242, 144, 89, 33);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel.setBounds(30, 34, 101, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_1.setBounds(30, 65, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Iteraciones");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_2.setBounds(30, 96, 113, 14);
		contentPane.add(lblNewLabel_2);
	}

}
