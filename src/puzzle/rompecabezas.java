package puzzle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.Font;

public class rompecabezas extends JFrame {
	int cont=1;
	int i=0;
	int n;

	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn6 = new JButton("6");
	JButton btn1 = new JButton("1");
	JButton btn9 = new JButton("9");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn8 = new JButton("8");
	JButton btn7 = new JButton("7");
    
	private JPanel contentPane;
	private JTextField txtContador;
	private final JButton btnListo = new JButton("Listo");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rompecabezas frame = new rompecabezas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void contarMov() {
		txtContador.setText(String.valueOf(cont++));
		
	}

	/**
	 * Create the frame.
	 */
	public rompecabezas() {
		
		
		setLocationRelativeTo(null);
		setTitle("ROMPECABEZAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 353);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn9.setBackground(new Color(199, 21, 133));
		btn9.setBounds(210, 150, 105, 75);
		btn9.setVisible(false);
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setForeground(new Color(169, 169, 169));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(34, 26, 316, 225);
		contentPane.add(panel);
		btn2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(199, 21, 133));
		btn2.setBounds(0, 0, 105, 75);
	
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.isVisible()==false) {
					btn1.setText(btn2.getText());
					btn1.setIcon(btn2.getIcon());
					btn2.setVisible(false);
					btn1.setVisible(true);				
				}
				if(btn3.isVisible()==false) {
					btn3.setText(btn2.getText());
					btn3.setIcon(btn2.getIcon());
					btn2.setVisible(false);
					btn3.setVisible(true);				
				}
				contarMov();
			}
		});
		panel.setLayout(null);
		panel.add(btn2);
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn3.setBackground(new Color(199, 21, 133));
		btn3.setBounds(105, 0, 105, 75);
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2.isVisible()==false) {
					btn2.setText(btn3.getText());
					btn2.setIcon(btn3.getIcon());
					btn3.setVisible(false);
					btn2.setVisible(true);				
				}
				if(btn6.isVisible()==false) {
					btn6.setText(btn3.getText());
					btn6.setIcon(btn3.getIcon());
					btn3.setVisible(false);
					btn6.setVisible(true);				
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn3.getText());
					btn5.setIcon(btn3.getIcon());
					btn3.setVisible(false);
					btn5.setVisible(true);				
				}
				contarMov();
			}
			
		});
		panel.add(btn3);
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn6.setBackground(new Color(199, 21, 133));
		btn6.setBounds(210, 0, 105, 75);
		
	
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn3.isVisible()==false) {
					btn3.setText(btn6.getText());
					btn3.setIcon(btn6.getIcon());
					btn6.setVisible(false);
					btn3.setVisible(true);				
				}
				if(btn8.isVisible()==false) {
					btn8.setText(btn6.getText());
					btn8.setIcon(btn6.getIcon());
					btn6.setVisible(false);
					btn8.setVisible(true);				
				}
				contarMov();
			}
		});
		panel.add(btn6);
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn1.setBackground(new Color(199, 21, 133));
		btn1.setBounds(0, 75, 105, 75);
		

		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.isVisible()==false) {
					btn4.setText(btn1.getText());
					btn4.setIcon(btn1.getIcon());
					btn1.setVisible(false);
					btn4.setVisible(true);				
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn1.getText());
					btn5.setIcon(btn1.getIcon());
					btn1.setVisible(false);
					btn5.setVisible(true);				
				}
				if(btn2.isVisible()==false) {
					btn2.setText(btn1.getText());
					btn2.setIcon(btn1.getIcon());
					btn1.setVisible(false);
					btn2.setVisible(true);				
				}
				contarMov();
			}
		});
		panel.add(btn1);
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn5.setBackground(new Color(199, 21, 133));
		btn5.setBounds(105, 75, 105, 75);
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn7.isVisible()==false) {
					btn7.setText(btn5.getText());
					btn7.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn7.setVisible(true);				
				}
				if(btn8.isVisible()==false) {
					btn8.setText(btn5.getText());
					btn8.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn8.setVisible(true);				
				}
				if(btn1.isVisible()==false) {
					btn1.setText(btn5.getText());
					btn1.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn1.setVisible(true);				
				}
				if(btn3.isVisible()==false) {
					btn3.setText(btn5.getText());
					btn3.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn3.setVisible(true);				
				}	
				contarMov();
			}
		});
		panel.add(btn5);
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn8.setBackground(new Color(199, 21, 133));
		btn8.setBounds(210, 75, 105, 75);
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn9.isVisible()==false) {
					btn9.setText(btn8.getText());
					btn9.setIcon(btn8.getIcon());
					btn8.setVisible(false);
					btn9.setVisible(true);			
				}
				if(btn6.isVisible()==false) {
					btn6.setText(btn8.getText());
					btn6.setIcon(btn8.getIcon());
					btn8.setVisible(false);
					btn6.setVisible(true);		
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn8.getText());
					btn5.setIcon(btn8.getIcon());
					btn8.setVisible(false);
					btn5.setVisible(true);	}	
				
				contarMov(); 
			}
		});
		panel.add(btn8);
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn4.setBackground(new Color(199, 21, 133));
		
		
		btn4.setBounds(0, 150, 105, 75);
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn7.isVisible()==false) {
					btn7.setText(btn4.getText());
					btn7.setIcon(btn4.getIcon());
					btn4.setVisible(false);
					btn7.setVisible(true);				
				}
				if(btn1.isVisible()==false) {
					btn1.setText(btn4.getText());
					btn1.setIcon(btn4.getIcon());
					btn4.setVisible(false);
					btn1.setVisible(true);				
				}
				contarMov();
			}
		});
		panel.add(btn4);
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn7.setBackground(new Color(199, 21, 133));
		btn7.setBounds(105, 150, 105, 75);
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn9.isVisible()==false) {
					btn9.setText(btn7.getText());
					btn9.setIcon(btn7.getIcon());
					btn7.setVisible(false);
					btn9.setVisible(true);				
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn7.getText());
					btn5.setIcon(btn7.getIcon());
					btn7.setVisible(false);
					btn5.setVisible(true);				
				}
				if(btn4.isVisible()==false) {
					btn4.setText(btn7.getText());
					btn4.setIcon(btn7.getIcon());
					btn7.setVisible(false);
					btn4.setVisible(true);				
				}
				contarMov();
			}
		});
		panel.add(btn7);
			
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn8.isVisible()==false) {
					btn8.setText(btn9.getText());
					btn8.setIcon(btn9.getIcon());
					btn9.setVisible(false);
					btn8.setVisible(true);			
				}
				if(btn7.isVisible()==false) {
					btn7.setText(btn9.getText());
					btn7.setIcon(btn9.getIcon());
					btn9.setVisible(false);
					btn7.setVisible(true);			
				}
				contarMov();
			}
		});
		panel.add(btn9);
		
		
		
		 
		
		JLabel lblNewLabel = new JLabel("Movimientos");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 16));
		lblNewLabel.setBounds(360, 101, 112, 22);
		contentPane.add(lblNewLabel);
		
		txtContador = new JTextField();
		txtContador.setForeground(new Color(47, 79, 79));
		txtContador.setFont(new Font("Century Gothic", Font.BOLD, 17));
		txtContador.setBounds(382, 135, 60, 28);
		contentPane.add(txtContador);
		txtContador.setColumns(10);
		
		JButton btnNewButton = new JButton("NUEVO JUEGO");
		btnNewButton.setForeground(new Color(255, 245, 238));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.setText("1");
				btn2.setText("2");
				btn3.setText("3");
				btn4.setText("4");
				btn8.setText("5");
				btn6.setText("6");
				btn7.setText("7");
				btn5.setText("8");
				btn9.setText("9");
				
			txtContador.setText(null);
			cont=1;
			
				
			
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnNewButton.setBounds(136, 263, 144, 40);
		contentPane.add(btnNewButton);
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "listo");
			}
		});
		btnListo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnListo.setBackground(new Color(176, 224, 230));
		btnListo.setBounds(367, 196, 89, 23);
		
		contentPane.add(btnListo);
		
		
	}
}
