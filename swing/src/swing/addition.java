package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class addition {

	private JFrame frmAdditionProgram;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addition window = new addition();
					window.frmAdditionProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdditionProgram = new JFrame();
		frmAdditionProgram.setForeground(Color.DARK_GRAY);
		frmAdditionProgram.setTitle("Addition Program");
		frmAdditionProgram.setBounds(100, 100, 450, 300);
		frmAdditionProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdditionProgram.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Addition");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(110, 11, 180, 30);
		frmAdditionProgram.getContentPane().add(lblNewLabel);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecondNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSecondNumber.setBounds(10, 105, 143, 30);
		frmAdditionProgram.getContentPane().add(lblSecondNumber);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Number");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 64, 143, 30);
		frmAdditionProgram.getContentPane().add(lblNewLabel_1_1);
		
		num1 = new JTextField();
		num1.setBounds(155, 71, 197, 20);
		frmAdditionProgram.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(155, 112, 197, 20);
		frmAdditionProgram.getContentPane().add(num2);
		num2.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("Add num");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int val1=Integer.parseInt(num1.getText());
				int val2=Integer.parseInt(num2.getText());
				int tol=val1+val2;
				JOptionPane.showMessageDialog(null, tol);
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(10, 177, 126, 39);
		frmAdditionProgram.getContentPane().add(btnNewButton_1_1);
		JButton btnNewButton_1_1_1 = new JButton("Clear");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1.setText("");
				num2.setText("");
				num1.requestFocus();
				
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1.setBounds(155, 177, 126, 39);
		frmAdditionProgram.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Exit");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_1.setBounds(298, 177, 126, 39);
		frmAdditionProgram.getContentPane().add(btnNewButton_1_1_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(155, 137, 197, 22);
		frmAdditionProgram.getContentPane().add(textArea);
	}
}
