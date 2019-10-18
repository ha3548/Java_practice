package day14;

import javax.swing.*;

public class Swing_ex {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My first Swing GUI");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel idLabel = new JLabel("¾ÆÀÌµð");
		JTextField textfield = new JTextField(10);
		JButton button = new JButton("Press");

		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		panel.add(idLabel);

		frame.setContentPane(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

}