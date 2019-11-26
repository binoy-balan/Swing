package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

public class Hotel {

	String str1,str2,str3,str4;
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf8;
	private JTextField tf3;
	private JTextField tf12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 959, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setForeground(Color.WHITE);
		panel.setBounds(10, 50, 331, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lb1 = new JLabel("Chicken Burger");
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lb1.setBounds(10, 21, 89, 14);
		panel.add(lb1);
		
		JLabel lb2 = new JLabel("Chicken Burger Meal");
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lb2.setBounds(10, 53, 127, 14);
		panel.add(lb2);
		
		tf1 = new JTextField();
		tf1.setBounds(184, 18, 86, 20);
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(184, 50, 86, 20);
		panel.add(tf2);
		tf2.setColumns(10);
		
		JLabel lb3 = new JLabel("Cheese Burger");
		lb3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lb3.setBounds(10, 87, 89, 14);
		panel.add(lb3);
		
		JLabel lblNewLabel_3 = new JLabel("Qty");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(182, 135, 74, 14);
		panel.add(lblNewLabel_3);
		
		tf4 = new JTextField();
		tf4.setBounds(184, 160, 86, 20);
		panel.add(tf4);
		tf4.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Home delivery");
		rb1.setBounds(10, 206, 109, 23);
		panel.add(rb1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"TEA", "COFEE", "SOFTDRINKS"}));
		cb1.setBounds(10, 160, 109, 20);
		panel.add(cb1);
		
		tf3 = new JTextField();
		tf3.setBounds(184, 84, 88, 20);
		panel.add(tf3);
		tf3.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Drink");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_14.setBounds(10, 135, 98, 14);
		panel.add(lblNewLabel_14);
		
		JRadioButton rb2 = new JRadioButton("Tax");
		rb2.setBounds(161, 206, 109, 23);
		panel.add(rb2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(345, 50, 267, 250);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Currency converter");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_11.setBounds(53, 11, 146, 14);
		panel_1.add(lblNewLabel_11);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"DOLLAR", "EURO"}));
		cb2.setBounds(79, 48, 71, 20);
		panel_1.add(cb2);
		
		tf8 = new JTextField();
		tf8.setBounds(40, 105, 179, 20);
		panel_1.add(tf8);
		tf8.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBounds(148, 177, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnConveret = new JButton("Converet");
		btnConveret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf11.getText();
				float cur=Float.parseFloat(str1);
				 if(cb2.getSelectedItem().equals("DOLLAR"))
		    	{
		    		double pi=(float)cur*0.014;
		    		String s5=String.valueOf(pi);
		    		tf8.setText(s5);
		    	}
		    	else if(cb2.getSelectedItem().equals("EURO"))
		    	{
		    		double p6=(float)cur*0.013;
		    		String s6=String.valueOf(p6);
		    		tf8.setText(s6);
		    	}
			}
		});
		btnConveret.setBounds(22, 177, 89, 23);
		panel_1.add(btnConveret);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(616, 50, 317, 380);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 27, 297, 342);
		panel_2.add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Calculator", null, layeredPane, null);
		
		tf12 = new JTextField();
		tf12.setBounds(10, 11, 260, 32);
		layeredPane.add(tf12);
		tf12.setColumns(10);
		
		JButton btn1 = new JButton("B");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(10, 54, 44, 23);
		layeredPane.add(btn1);
		
		JButton btn2 = new JButton("7");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn2.getText()));
			}
		});
		btn2.setBounds(10, 100, 44, 23);
		layeredPane.add(btn2);
		
		JButton btn3 = new JButton("4");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn3.getText()));

			}
		});
		btn3.setBounds(10, 151, 44, 23);
		layeredPane.add(btn3);
		
		JButton btn4 = new JButton("1");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn4.getText()));

			}
		});
		btn4.setBounds(10, 202, 44, 23);
		layeredPane.add(btn4);
		
		JButton btn5 = new JButton("0");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn5.getText()));

			}
			
		});
		btn5.setBounds(10, 247, 44, 23);
		layeredPane.add(btn5);
		
		JButton btn17 = new JButton("=");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float res1=Float.parseFloat(str1);
				String str;
				float s=1;
				float res2=Float.parseFloat(tf12.getText());
				if(str2.contentEquals("+"))
				{
					float res=res1+res2;
					str=String.valueOf(res);
					tf12.setText(str);
					
				}
				else if(str2.contentEquals("-"))
				{
					float res=res1-res2;
					str=String.valueOf(res);
					tf12.setText(str);
				}
				else if(str2.contentEquals("*"))
				{
					float res=res1*res2;
					str=String.valueOf(res);
					tf12.setText(str);
				}
				else if(str2.contentEquals("/"))
				{
					float res=res1/res2;
					str=String.valueOf(res);
					tf12.setText(str);
				}

				
				
			}
		});
		btn17.setBounds(214, 247, 44, 23);
		layeredPane.add(btn17);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(146, 247, 44, 23);
		layeredPane.add(btnNewButton_7);
		
		JButton btn6 = new JButton("8");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn6.getText()));

			}
		});
		btn6.setBounds(74, 100, 44, 23);
		layeredPane.add(btn6);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(" ");
			}
		});
		btnC.setBounds(74, 54, 44, 23);
		layeredPane.add(btnC);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(74, 54, 44, 23);
		layeredPane.add(button_2);
		
		JButton btn7 = new JButton("5");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn7.getText()));

			}
		});
		btn7.setBounds(74, 151, 44, 23);
		layeredPane.add(btn7);
		
		JButton btn8 = new JButton("2");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn8.getText()));

			}
		});
		btn8.setBounds(74, 202, 44, 23);
		layeredPane.add(btn8);
		
		JButton btn9 = new JButton(".");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn9.getText()));

			}
		});
		btn9.setBounds(74, 247, 44, 23);
		layeredPane.add(btn9);
		
		JButton btn12 = new JButton("3");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn12.getText()));

			}
		});
		btn12.setBounds(146, 202, 44, 23);
		layeredPane.add(btn12);
		
		JButton btn16 = new JButton("/");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				str1 = tf12.getText();
				 str2=btn16.getText();
				tf12.setText(" ");
			}
		});
		btn16.setBounds(214, 202, 44, 23);
		layeredPane.add(btn16);
		
		JButton button_8 = new JButton("New button");
		button_8.setBounds(146, 54, 44, 23);
		layeredPane.add(button_8);
		
		JButton btn10 = new JButton("9");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn10.getText()));

			}
		});
		btn10.setBounds(146, 100, 44, 23);
		layeredPane.add(btn10);
		
		JButton btn11 = new JButton("6");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf12.setText(tf12.getText().concat(btn11.getText()));

			}
		});
		btn11.setBounds(146, 151, 44, 23);
		layeredPane.add(btn11);
		
		JButton btn14 = new JButton("-");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 str1 = tf12.getText();
				  str2=btn14.getText();
				tf12.setText(" ");
			}
		});
		btn14.setBounds(214, 100, 44, 23);
		layeredPane.add(btn14);
		
		JButton btn13 = new JButton("+");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str1 = tf12.getText();
				  str2=btn13.getText();
				tf12.setText(" ");
			}
		});
		btn13.setBounds(214, 54, 44, 23);
		layeredPane.add(btn13);
		
		JButton btn15 = new JButton("*");
		btn15.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				  str1= tf12.getText();
				  str2=btn15.getText();
				tf12.setText(" ");
			}
		});
		btn15.setBounds(214, 151, 44, 23);
		layeredPane.add(btn15);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 282, 314);
		panel_7.add(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(10, 301, 331, 129);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Cost Of Drink");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 22, 93, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cost Of Meal");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 56, 93, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("Cost Of Delivery");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 91, 93, 14);
		panel_3.add(lblNewLabel_8);
		
		tf5 = new JTextField();
		tf5.setBounds(171, 19, 86, 20);
		panel_3.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setBounds(171, 53, 86, 20);
		panel_3.add(tf6);
		tf6.setColumns(10);
		
		tf7 = new JTextField();
		tf7.setBounds(171, 84, 86, 20);
		panel_3.add(tf7);
		tf7.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(345, 301, 267, 129);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Tax");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 23, 46, 14);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("Sub total");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_9.setBounds(10, 59, 65, 14);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Total");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_10.setBounds(10, 92, 46, 14);
		panel_4.add(lblNewLabel_10);
		
		tf9 = new JTextField();
		tf9.setBounds(127, 20, 86, 20);
		panel_4.add(tf9);
		tf9.setColumns(10);
		
		tf10 = new JTextField();
		tf10.setBounds(127, 56, 86, 20);
		panel_4.add(tf10);
		tf10.setColumns(10);
		
		tf11 = new JTextField();
		tf11.setBounds(127, 89, 86, 20);
		panel_4.add(tf11);
		tf11.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(20, 432, 811, 60);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_22 = new JButton("TOTAL");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tf4.getText();
				float s=Float.parseFloat(str1);
				if(cb1.getSelectedIndex()==0)
				{
					float a=s*10;
					String b=String.valueOf(a);
					tf5.setText(b);
				}
				
				if(cb1.getSelectedIndex()==1)
				{
					float a=s*15;
					String b=String.valueOf(a);
					tf5.setText(b);
				}

				if(cb1.getSelectedIndex()==2)
				{
					float a=s*30;
					String b=String.valueOf(a);
					tf5.setText(b);
				}

			str2=tf1.getText();
			str3=tf2.getText();
			str4=tf3.getText();
			
			float c=Float.parseFloat(str2);
			float d=Float.parseFloat(str3);
			float f=Float.parseFloat(str4);
			 float g=(c*160)+(d*210)+(f*110);
			 String h=String.valueOf(g);
			 tf6.setText(h);
			 float i;
			if(rb1.isSelected())
			{
				i=20f;
				String b=String.valueOf(i);
				tf7.setText(b);
			}
			
			str1=tf5.getText();
			str2=tf6.getText();
			str3=tf7.getText();
			
			float k=Float.parseFloat(str1);
			float l=Float.parseFloat(str2);
			float m=Float.parseFloat(str3);
			 float n=k+l+m;
			 String o=String.valueOf(n);
			 tf10.setText(o);
			 
			 if(rb2.isSelected())
			 {
				 
				 str1=tf10.getText();
				 float p=Float.parseFloat(str1);
				 float q=(p*8)/100;
				 String ab=String.valueOf(q);
				 tf9.setText(ab);		 
			 }
			 str1=tf10.getText();
			 str2=tf9.getText();
			 float pb=Float.parseFloat(str1);
			 float pa=Float.parseFloat(str2);
			 float tot=pb+pa;
			 String ba=String.valueOf(tot);
			 tf11.setText(ba);
			}
		});
		btnNewButton_22.setBounds(20, 26, 89, 23);
		panel_5.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("Receipt");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.append("\"Receipt \n"
					
						+ "======================================\n"
						+ "Chicken Burger:\t\t" + tf1.getText()
						+ "\nChicken Burger Meals:\t\t" + tf2.getText()
						+ "\nchesse Burger:\t\t" + tf3.getText()
						+ "\nCost Of Drink:\t\t" + tf5.getText()
						+ "\nCost Of Meals:\t\t" + tf6.getText()
						+ "\nCost of Delivery:\t\t"+tf7.getText()
						+ "\nTax:\t\t" + tf9.getText()
						+ "\nSub Total:\t\t" + tf10.getText()
						+ "\nTotal:\t\t" + tf11.getText()
						
						);
			}
		});
		btnNewButton_23.setBounds(193, 26, 89, 23);
		panel_5.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("RESET");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText(" ");
				tf2.setText(" ");
				tf3.setText(" ");
				tf4.setText(" ");
				tf5.setText(" ");
				tf6.setText(" ");
				tf7.setText(" ");
				tf8.setText(" ");
				tf9.setText(" ");
				tf10.setText(" ");
				tf11.setText(" ");
			}
			
			
		});
		btnNewButton_24.setBounds(384, 26, 89, 23);
		panel_5.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("EXIT");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_25.setBounds(557, 26, 89, 23);
		panel_5.add(btnNewButton_25);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setForeground(Color.WHITE);
		panel_6.setBounds(43, 0, 716, 39);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblHoyelManagment = new JLabel("HOTEL MANAGMENT SYSTEM");
		lblHoyelManagment.setForeground(new Color(153, 153, 153));
		lblHoyelManagment.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		lblHoyelManagment.setBounds(116, 0, 500, 36);
		panel_6.add(lblHoyelManagment);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(259, 416, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
