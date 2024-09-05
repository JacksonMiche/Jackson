package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(Color.ORANGE);
		frmCalculadora.setFont(new Font("Arial", Font.PLAIN, 20));
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.PLAIN, 20));
		txtField.setBounds(10, 11, 242, 42);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Arial", Font.PLAIN, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
			}
		});
		btn7.setBounds(10, 76, 89, 42);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(btn4.getText()+txtField.getText());
			}
		});
		btn4.setFont(new Font("Arial", Font.PLAIN, 20));
		btn4.setBounds(10, 116, 89, 42);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
			}
		});
		btn8.setFont(new Font("Arial", Font.PLAIN, 20));
		btn8.setBounds(98, 76, 89, 42);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btnNewButton_1_2 = new JButton("C");
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(98, 76, 89, 42);
		frmCalculadora.getContentPane().add(btnNewButton_1_2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
			}
		});
		btn5.setFont(new Font("Arial", Font.PLAIN, 20));
		btn5.setBounds(98, 116, 89, 42);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
			}
		});
		btn6.setFont(new Font("Arial", Font.PLAIN, 20));
		btn6.setBounds(187, 116, 89, 42);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());			}
		});
		btn9.setFont(new Font("Arial", Font.PLAIN, 20));
		btn9.setBounds(187, 76, 89, 42);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
			}
		});
		btn3.setFont(new Font("Arial", Font.PLAIN, 20));
		btn3.setBounds(187, 159, 89, 42);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
			}
		});
		btn2.setFont(new Font("Arial", Font.PLAIN, 20));
		btn2.setBounds(98, 159, 89, 42);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn1.getText());
			}
		});
		btn1.setFont(new Font("Arial", Font.PLAIN, 20));
		btn1.setBounds(10, 159, 89, 42);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btnponto.getText());
			}
		});
		btnponto.setFont(new Font("Arial", Font.PLAIN, 20));
		btnponto.setBounds(10, 196, 89, 42);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn0.getText());
			}
		});
		btn0.setFont(new Font("Arial", Font.PLAIN, 20));
		btn0.setBounds(98, 196, 89, 42);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2= Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					txtField.setText(String.valueOf(resultado));
					
				}else if(operacao.equals("*")) {
					resultado = numero1*numero2;
					txtField.setText(String.valueOf(resultado));
					
				
			}else if(operacao.equals("/")) {
				resultado = numero1/numero2;
				txtField.setText(String.valueOf(resultado));
			}
			}	
		});
		btnigual.setFont(new Font("Arial", Font.PLAIN, 20));
		btnigual.setBounds(187, 196, 89, 42);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btnmais = new JButton("+");
		btnmais.setForeground(Color.RED);
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="+";
			}
		});
		btnmais.setFont(new Font("Arial", Font.PLAIN, 20));
		btnmais.setBounds(276, 76, 89, 42);
		frmCalculadora.getContentPane().add(btnmais);
		
		JButton bntmenos = new JButton("-");
		bntmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="-";
				
			}
		});
		bntmenos.setForeground(Color.RED);
		bntmenos.setFont(new Font("Arial", Font.PLAIN, 20));
		bntmenos.setBounds(276, 116, 89, 42);
		frmCalculadora.getContentPane().add(bntmenos);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="*";
			}
		});
		btnmult.setForeground(Color.RED);
		btnmult.setFont(new Font("Arial", Font.PLAIN, 20));
		btnmult.setBounds(276, 159, 89, 42);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btnresultado = new JButton("C");
		btnresultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnresultado.setForeground(new Color(255, 0, 0));
		btnresultado.setFont(new Font("Arial", Font.PLAIN, 20));
		btnresultado.setBounds(276, 24, 89, 42);
		frmCalculadora.getContentPane().add(btnresultado);
		
		JButton bntbarra = new JButton("/");
		bntbarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="/";
				
			}
		});
		bntbarra.setForeground(Color.RED);
		bntbarra.setFont(new Font("Arial", Font.PLAIN, 20));
		bntbarra.setBounds(276, 196, 89, 42);
		frmCalculadora.getContentPane().add(bntbarra);
	}
}
