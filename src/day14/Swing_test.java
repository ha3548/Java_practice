package day14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Swing_test {

	private JFrame frame;
	private JTextField txtPhoneNumber;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing_test window = new Swing_test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr.setBounds(162, 317, 26, 23);
		frame.getContentPane().add(lblOr);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(50, 120, 250, 50);
		txtPhoneNumber.setText("ID");
		frame.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		textField = new JTextField();
		textField.setText("Password");
		textField.setColumns(10);
		textField.setBounds(50, 190, 250, 50);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(50, 270, 250, 23);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 328, 105, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(195, 328, 105, 12);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("SIGN IN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(50, 362, 250, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("Find Password");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(50, 406, 250, 23);
		frame.getContentPane().add(button);

	}
}

