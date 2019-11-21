package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class sample {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblUsername;
	private JLabel label;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
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
	public sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(239, 77, 138, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword =  new JLabel("Password");
		lblPassword.setBounds(77, 139, 82, 14);
		frame.getContentPane().add(lblPassword);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(77, 79, 99, 17);
		frame.getContentPane().add(lblUsername);
		
		label = new JLabel("");
		label.setBounds(77, 237, 261, 14);
		frame.getContentPane().add(label);

		passwordField = new JPasswordField();
		passwordField.setBounds(239, 136, 138, 20);
		frame.getContentPane().add(passwordField);

		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=""+new String(passwordField.getPassword());
			String username=textField.getText();
			
			if(username.equals("BINOY")&&s.equals("BINOY"))
			label.setText("Login is sucessful");
			else
			label.setText("Login not sucessful");
			}
		});
		btnOk.setBounds(139, 171, 89, 23);
		frame.getContentPane().add(btnOk);
		
				
			}
}
