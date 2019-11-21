package swing;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;

public class scale {
	String str,str1;

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scale window = new scale();
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
	public scale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 196));
		frame.setBounds(100, 100, 483, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("INPUT");
		lblInput.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblInput.setBounds(90, 23, 88, 24);
		frame.getContentPane().add(lblInput);
		
		JLabel lblInputscale = new JLabel("INPUTSCALE");
		lblInputscale.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInputscale.setBounds(39, 85, 114, 14);
		frame.getContentPane().add(lblInputscale);
		
		JLabel lblOutputscale = new JLabel("OUTPUTSCALE");
		lblOutputscale.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOutputscale.setBounds(298, 85, 121, 14);
		frame.getContentPane().add(lblOutputscale);
		
		

		
		tf1 = new JTextField();
		tf1.setBounds(195, 27, 129, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JRadioButton ci = new JRadioButton("Celcius");
		ci.setBackground(new Color(255, 228, 196));
		ci.setBounds(39, 121, 109, 23);
		frame.getContentPane().add(ci);
		
		
		JRadioButton fi = new JRadioButton("Fahrenheit");
		fi.setBackground(new Color(255, 228, 196));
		fi.setBounds(39, 156, 109, 23);
		frame.getContentPane().add(fi);
		

		
		JRadioButton ki = new JRadioButton("Kelvin");
		ki.setBackground(new Color(255, 228, 196));
		ki.setBounds(39, 194, 109, 23);
		frame.getContentPane().add(ki);
		
			JRadioButton fo = new JRadioButton("Fahrenheit");
		fo.setBackground(new Color(255, 228, 196));
		fo.setBounds(310, 156, 109, 23);
		frame.getContentPane().add(fo);

		JRadioButton ko = new JRadioButton("Kelvin");
		ko.setBackground(new Color(255, 228, 196));
		ko.setBounds(310, 194, 109, 23);
		frame.getContentPane().add(ko);
		
		JRadioButton co = new JRadioButton("Celcius");
		co.setBackground(new Color(255, 228, 196));
		co.setBounds(310, 121, 109, 23);
		frame.getContentPane().add(co);

		ButtonGroup G = new ButtonGroup();
		G.add(ci);
		G.add(fi);
		G.add(ki);
		ButtonGroup G1 = new ButtonGroup();
		G1.add(co);
		G1.add(fo);
		G1.add(ko);
		
		ci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			str=ci.getText();
			G1.clearSelection();
			}
			
		});
		
		fi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			str=ci.getText();
			G1.clearSelection();
			}
			
		});

		ki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			str=ci.getText();
			G1.clearSelection();
			}
			 
		});

		tf2 = new JTextField();
		tf2.setBounds(171, 245, 129, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		tf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf2.setText(" ");
			}
		});

				co.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=tf1.getText();
			float s=Float.parseFloat(a);
			if(ci.isSelected())
			{
				tf2.setText(tf1.getText());
			}
			else if(fi.isSelected())
			{
				float f=(float)(5*s-160)/9;
				String b=String.valueOf(f);
				tf2.setText(b);
			}
			else if(ki.isSelected())
            		{
            	double f=s-(273.5);
				String b=String.valueOf(f);
				tf2.setText(b);
            		}
			}
			 
		});

		
		
		
		fo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=tf1.getText();
			float s=Float.parseFloat(a);
           if(ci.isSelected())
           {
        	   float f=(float)(9*s+160)/5;
				String b=String.valueOf(f);
				tf2.setText(b);
           }
           else if(fi.isSelected())
           {
        	   tf2.setText(tf1.getText());
           }
           else if(ki.isSelected())
           {
        	   double f=(s-273.15)*9/5+32;
        	   String b=String.valueOf(f);
				tf2.setText(b);
           }

          
			}
			 
		});
		
		ko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=tf1.getText();
			float s=Float.parseFloat(a);
           if(ci.isSelected())
           {
        	   double f=s+273.15;
				String b=String.valueOf(f);
				tf2.setText(b); 
           }
           else if(fi.isSelected())
           {
        	   double f=(s-32)*5/9+273.15;
        	   String b=String.valueOf(f);
				tf2.setText(b);
           }
           else if(ki.isSelected())
           {
        	   tf2.setText(tf1.getText());
           }
           
			}
			 
		});
	
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblResult.setBounds(67, 246, 63, 14);
		frame.getContentPane().add(lblResult);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText(" ");
				tf2.setText(" ");
			}
		});
		btnClear.setBackground(new Color(255, 228, 196));
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnClear.setBounds(330, 244, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
	}
}
