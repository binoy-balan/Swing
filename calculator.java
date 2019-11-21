package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calculator {
	String a=" ";
	String str,str1,str2;
	float f=0;

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 11, 450, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("sqrt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=(float)Math.sqrt(v);
				String a=String.valueOf(b);
				textField.setText(a);

			}
		});
		btnNewButton.setBounds(10, 81, 67, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton_1.setBounds(10, 115, 67, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=btnNewButton_2.getText();
				textField.setText(" ");
			}
		});
		btnNewButton_2.setBounds(10, 149, 67, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x^2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float b=Float.parseFloat(str1);
				float c=b*b;
				String a=String.valueOf(c);
				textField.setText(a);
			}
		});
		btnNewButton_3.setBounds(10, 183, 67, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("1/x");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=(float)1/v;
				String a=String.valueOf(b);
				textField.setText(a);
			}
		});
		btnNewButton_4.setBounds(87, 81, 67, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exp");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=(float)Math.exp(v);
				String a=String.valueOf(b);
				textField.setText(a);
			}
		});
		btnNewButton_5.setBounds(87, 115, 67, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("ln");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=(float)Math.log(v);
				String a=String.valueOf(b);
				textField.setText(a);
			}
		});
		btnNewButton_6.setBounds(87, 149, 67, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("n!");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float f=1;
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				for(int i=1;i<=v;i++)
				{
					f=f*i;
				}
				String a=String.valueOf(f);
				textField.setText(a);


							}
		});
		btnNewButton_7.setBounds(87, 183, 67, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 =new JButton("sin");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=(float)Math.sin(v*(float)Math.PI/180);
				String a=String.valueOf(b);
				textField.setText(a);
			}
			
		});
		btnNewButton_8.setBounds(164, 81, 67, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("cos");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=(float)Math.cos(v*(float)Math.PI/180);
				String a=String.valueOf(b);
				textField.setText(a);
			}
			
		});
		btnNewButton_9.setBounds(164, 115, 67, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("tan");
		btnNewButton_10.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=(float)Math.tan(v*(float)Math.PI/180);
				String a=String.valueOf(b);
				textField.setText(a);

			}
		});
		btnNewButton_10.setBounds(164, 149, 67, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("sec");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText("");
				float v=Float.parseFloat(s);
				float b=1/(float)Math.cos(v*(float)Math.PI/180);
				String a=String.valueOf(b);
				textField.setText(a);

			}
		});
		btnNewButton_11.setBounds(164, 183, 67, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("7");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_12.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_12.getText()));
			}
		});
		btnNewButton_12.setBounds(258, 81, 52, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("4");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_13.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_13.getText()));
			}
		});
		btnNewButton_13.setBounds(258, 115, 52, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("1");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_14.getText();
				textField.setText(textField.getText().concat(btnNewButton_14.getText()));
				//textField.setText();
			}
		});
		btnNewButton_14.setBounds(258, 149, 52, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_15.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_15.getText()));
			}
		});
		btnNewButton_15.setBounds(258, 183, 52, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("8");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_16.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_16.getText()));
			}
		});
		btnNewButton_16.setBounds(320, 81, 52, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("5");
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_17.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_17.getText()));
			}
		});
		btnNewButton_17.setBounds(320, 115, 52, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("2");
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_18.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//a=a+btnNewButton_18.getText();
			//textField.setText(a);
			textField.setText(textField.getText().concat(btnNewButton_18.getText()));
			}
		});
		btnNewButton_18.setBounds(320, 149, 52, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton(".");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==0)
				{
					textField.setText(textField.getText().concat(btnNewButton_19.getText()));
					f=1;
				}
			}
			
			
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_19.setBounds(320, 183, 52, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("9");
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_20.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_20.getText()));
			}
		});
		btnNewButton_20.setBounds(382, 81, 52, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("6");
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_21.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_21.getText()));
			}
		});
		btnNewButton_21.setBounds(382, 115, 52, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("3");
		btnNewButton_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a=a+btnNewButton_22.getText();
				//textField.setText(a);
				textField.setText(textField.getText().concat(btnNewButton_22.getText()));
			}
			
		});
		btnNewButton_22.setBounds(382, 149, 52, 23);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("=");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float res1=Float.parseFloat(str1);
				String str;
				float s=1;
				float res2=Float.parseFloat(textField.getText());
				if(str2.contentEquals("+"))
				{
					float res=res1+res2;
					str=String.valueOf(res);
					textField.setText(str);
					
				}
				else if(str2.contentEquals("-"))
				{
					float res=res1-res2;
					str=String.valueOf(res);
					textField.setText(str);
				}
				else if(str2.contentEquals("*"))
				{
					float res=res1*res2;
					str=String.valueOf(res);
					textField.setText(str);
				}
				else if(str2.contentEquals("/"))
				{
					float res=res1/res2;
					str=String.valueOf(res);
					textField.setText(str);
				}
				else if(str2.contentEquals("x^y"))
				{
					for(int i=1;i<=res2;i++)
					{
						s=(float)s*res1;
					}	
					str=String.valueOf(s);
					textField.setText(str);
				}
			}
		});
		btnNewButton_23.setBounds(382, 183, 52, 23);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("/");
		btnNewButton_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=btnNewButton_24.getText();
				textField.setText(" ");
			}
		});
		btnNewButton_24.setBounds(444, 81, 52, 23);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("*");
		btnNewButton_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=btnNewButton_25.getText();
				textField.setText(" ");

			}
		});
		btnNewButton_25.setBounds(444, 115, 52, 23);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("-");
		btnNewButton_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=btnNewButton_26.getText();
				textField.setText(" ");

				

			}
			
		});
		btnNewButton_26.setBounds(444, 149, 52, 23);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("+");
		btnNewButton_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_27.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//a= btnNewButton_27.getText();
				a=null;
								str1=textField.getText();
								str2=btnNewButton_27.getText();
								textField.setText(" ");

			}
			
		});
		btnNewButton_27.setBounds(444, 183, 52, 23);
		frame.getContentPane().add(btnNewButton_27);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		btnClear.setBounds(309, 51, 125, 23);
		frame.getContentPane().add(btnClear);
	}
}
