package gui;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GuiFactory {
	
	private JFrame frame;
	private JTextField textField;
	
	public GuiFactory() {
		
	}
	
	
	public void createFrame() {
		
		frame = new JFrame("Hangman");
		frame.setSize(1000, 750);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public void createTextField(int cols) {
		textField = new JTextField(cols);
		textField.setText("Enter here");
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	

}
