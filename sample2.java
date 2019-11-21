package swing;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemListener;

public class sample2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample2 window = new sample2();
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
	public sample2() {
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
		JLabel label = new JLabel(" ");
		label.setBounds(99, 168, 159, 35);
		frame.getContentPane().add(label);

		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C++");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		chckbxNewCheckBox.setBounds(77, 74, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox .addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e)
		{
			 label.setText("c++"+(e.getStateChange()==1?"checked":"unchecked"));
		
		}
		});		
	
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Java");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		chckbxNewCheckBox_1.setBounds(77, 117, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				 label.setText("Java"+(e.getStateChange()==1?"checked":"unchecked"));
			
			}
			});
		ButtonGroup G = new ButtonGroup();
		G.add(chckbxNewCheckBox);
		G.add(chckbxNewCheckBox_1);
		
			}
}
