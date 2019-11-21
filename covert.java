package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class covert {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					covert window = new covert();
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
	public covert() {
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
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setBounds(52, 55, 72, 14);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(225, 52, 145, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(81, 135, 177, 14);
		frame.getContentPane().add(label);
		
		JButton btnToCelsius = new JButton("To celsius");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Degree=textField.getText();
				int i=Integer.parseInt(Degree);
			float t =(float)(5*i-160)/9;
			String s=String.valueOf(t);
			label.setText("result="+s);
				
				
			}
			
		});
		btnToCelsius.setBounds(52, 182, 89, 23);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFaren = new JButton("To fahranheit");
		btnToFaren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Degree=textField.getText();
				int a=Integer.parseInt(Degree);
			float v =(float)(9*a+160)/5;
			String b=String.valueOf(v);
			label.setText("result="+b);
			}
		});
		btnToFaren.setBounds(231, 182, 145, 23);
		frame.getContentPane().add(btnToFaren);
	}

}
