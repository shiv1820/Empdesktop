package ems;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update extends JFrame implements ActionListener {

	private JPanel contentPane;
	 JButton btnNewButton;
	 JButton btnNewButton_1;
	 JButton btnNewButton_2;
	 JButton b1;
	 private JTextField textField;
	 private JTextField textField_1; 
	 private JTextField textField_2;
	 private JTextField textField_3;
	 private JTextField textField_4;
	 private JTextField textField_5;
	 private JTextField textField_6;
	 private JTextField textField_7;
	 private JTextField textField_8;
	 private JTextField textField_9;
	 private JTextField textField_10;
	 private JTextField textField_11;
	 private JTextField textField_12;
	 private JTextField textField_13; 
	 private JTextField textField_14;
	 JLabel lblNewLabel_2;
	 JLabel lblNewLabel_3;
	 JLabel lblNewLabel_4;
	 JLabel lblNewLabel_5;
	 JLabel lblNewLabel_6;
	 JLabel lblNewLabel_8;
	 JLabel lblNewLabel_9;
	 JLabel lblNewLabel_10;
	 JLabel lblNewLabel_11;
	 JLabel lblNewLabel_12;
	 JLabel lblNewLabel_13;
	 JLabel lblNewLabel_14;
	 JLabel lblNewLabel_15; 
	 JLabel lblNewLabel_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
					 JLabel lblNewLabel_2;
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection con;
	public Update() {
		con=Mysqlconn.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 651);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Employee Details\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel.setBounds(234, 21, 307, 37);
		contentPane.add(lblNewLabel);
		

			JLabel lblNewLabel_1 = new JLabel("Employee-Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 92, 100, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(140, 94, 56, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(271, 93, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
			btnNewButton_1 = new JButton("back\r\n");
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnNewButton_1.setBounds(407, 93, 85, 21);
			contentPane.add(btnNewButton_1);
			btnNewButton_1.addActionListener(this);
			
			lblNewLabel_2 = new JLabel("First Name\r\n");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(10, 139, 78, 25);
			contentPane.add(lblNewLabel_2);
			lblNewLabel_2.setVisible(false);
			
			 lblNewLabel_3 = new JLabel("Middle name\r\n");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3.setBounds(312, 139, 96, 25);
			contentPane.add(lblNewLabel_3);
			lblNewLabel_3.setVisible(false);
			
			 lblNewLabel_4 = new JLabel("Last Name");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_4.setBounds(631, 147, 112, 19);
			contentPane.add(lblNewLabel_4);
			lblNewLabel_4.setVisible(false);
			
		   lblNewLabel_5 = new JLabel("Father's Name\r\n");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_5.setBounds(10, 179, 112, 25);
			contentPane.add(lblNewLabel_5);
			lblNewLabel_5.setVisible(false);
			
			 lblNewLabel_6 = new JLabel("Gender");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_6.setBounds(10, 223, 58, 19);
			contentPane.add(lblNewLabel_6);
			lblNewLabel_6.setVisible(false);
			
			
			textField_1 = new JTextField();
			textField_1.setBounds(116, 144, 96, 19);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			textField_1.setVisible(false);
			
			textField_2 = new JTextField();
			textField_2.setBounds(418, 144, 96, 19);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			textField_2.setVisible(false);
			
			textField_3 = new JTextField();
			textField_3.setBounds(730, 149, 96, 19);
			contentPane.add(textField_3);
			textField_3.setColumns(10);
			textField_3.setVisible(false);
			
			textField_4 = new JTextField();
			textField_4.setBounds(135, 184, 204, 19);
			contentPane.add(textField_4);
			textField_4.setColumns(10);
			textField_4.setVisible(false);
			
			 lblNewLabel_8 = new JLabel("Mobile Number");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_8.setBounds(10, 263, 103, 19);
			contentPane.add(lblNewLabel_8);
			lblNewLabel_8.setVisible(false);
			
			 lblNewLabel_9 = new JLabel("Email-id");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_9.setBounds(391, 269, 67, 25);
			contentPane.add(lblNewLabel_9);
			lblNewLabel_9.setVisible(false);
			
			textField_5 = new JTextField();
			textField_5.setBounds(138, 265, 135, 19);
			contentPane.add(textField_5);
			textField_5.setColumns(10);
			textField_5.setVisible(false);
			
			textField_6 = new JTextField();
			textField_6.setBounds(476, 274, 229, 19);
			contentPane.add(textField_6);
			textField_6.setColumns(10);
			textField_6.setVisible(false);
			
			 lblNewLabel_10 = new JLabel("Address");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_10.setBounds(10, 324, 78, 19);
			contentPane.add(lblNewLabel_10);
			lblNewLabel_10.setVisible(false);
			
			 lblNewLabel_11 = new JLabel("City");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_11.setBounds(294, 329, 34, 25);
			contentPane.add(lblNewLabel_11);
			lblNewLabel_11.setVisible(false);
			
			 lblNewLabel_12 = new JLabel("State");
			lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_12.setBounds(564, 337, 43, 17);
			contentPane.add(lblNewLabel_12);
			lblNewLabel_12.setVisible(false);
			
			textField_7 = new JTextField();
			textField_7.setBounds(94, 326, 135, 19);
			contentPane.add(textField_7);
			textField_7.setColumns(10);
			textField_7.setVisible(false);
			
			textField_8 = new JTextField();
			textField_8.setBounds(351, 334, 118, 19);
			contentPane.add(textField_8);
			textField_8.setColumns(10);
			textField_8.setVisible(false);
			
			textField_9 = new JTextField();
			textField_9.setBounds(631, 334, 112, 19);
			contentPane.add(textField_9);
			textField_9.setColumns(10);
			textField_9.setVisible(false);
			
			 lblNewLabel_13 = new JLabel("Designation\r\n");
			lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_13.setBounds(10, 383, 87, 19);
			contentPane.add(lblNewLabel_13);
			lblNewLabel_13.setVisible(false);
			
			 lblNewLabel_14 = new JLabel("Education");
			lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_14.setBounds(385, 388, 78, 19);
			contentPane.add(lblNewLabel_14);
			lblNewLabel_14.setVisible(false);
			
			textField_10 = new JTextField();
			textField_10.setBounds(116, 385, 141, 19);
			contentPane.add(textField_10);
			textField_10.setColumns(10);
			textField_10.setVisible(false);
			
			textField_11 = new JTextField();
			textField_11.setBounds(489, 390, 141, 19);
			contentPane.add(textField_11);
			textField_11.setColumns(10);
			textField_11.setVisible(false);
			
		   lblNewLabel_15 = new JLabel("Salary");
			lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_15.setBounds(10, 440, 43, 25);
			contentPane.add(lblNewLabel_15);
			lblNewLabel_15.setVisible(false);
			
			textField_12 = new JTextField();
			textField_12.setBounds(104, 445, 96, 19);
			contentPane.add(textField_12);
			textField_12.setColumns(10);
			textField_12.setVisible(false);
			
			 lblNewLabel_16 = new JLabel("Pan no.");
			lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_16.setBounds(322, 448, 67, 17);
			contentPane.add(lblNewLabel_16);
			lblNewLabel_16.setVisible(false);
			
			textField_13 = new JTextField();
			textField_13.setBounds(399, 446, 154, 19);
			contentPane.add(textField_13);
			textField_13.setColumns(10);
			textField_13.setVisible(false);
			
			 b1 = new JButton("Update\r\n");
			b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			b1.setBounds(369, 525, 85, 21);
			contentPane.add(b1);
			b1.setVisible(false);
			b1.addActionListener(this);
			
			 btnNewButton_2 = new JButton("back\r\n");
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnNewButton_2.setBounds(10, 527, 85, 21);
			contentPane.add(btnNewButton_2);
			btnNewButton_2.setVisible(false);
			btnNewButton_2.addActionListener(this);
			
			textField_14 = new JTextField();
			textField_14.setBounds(133, 225, 96, 19);
			contentPane.add(textField_14);
			textField_14.setColumns(10);
			textField_14.setVisible(false);
	}
	int i=0;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			try {
				int a=Integer.parseInt(textField.getText());
				PreparedStatement pst = con.prepareStatement("select first,middle,last,father_name,gender,mobno,email_id,address,city,state"
						+ ",designation,education,salary,panno from emp where emp_id='"+a+"'");
				ResultSet rs=pst.executeQuery();
				
				 i=0;
				if(rs.next()) {
					String fname=rs.getString(1);
					String mname=rs.getString(2);
					String lname=rs.getString(3);
					String fathern=rs.getString(4);
					String gender=rs.getString(5);
					String mobno=rs.getString(6);
					String email_id=rs.getString(7);
					String address=rs.getString(8);
					String city=rs.getString(9);
					String state=rs.getString(10);
					String education=rs.getString(12);
					String designation=rs.getString(11);
					String salary=rs.getString(13);
					String panno=rs.getString(14);
					
					 lblNewLabel_2.setVisible(true);
					 lblNewLabel_3.setVisible(true);
					 lblNewLabel_4.setVisible(true);
					 lblNewLabel_5.setVisible(true);
					 lblNewLabel_6.setVisible(true);
					 lblNewLabel_8.setVisible(true);
					 lblNewLabel_9.setVisible(true);
					 lblNewLabel_10.setVisible(true);
					 lblNewLabel_11.setVisible(true);
					 lblNewLabel_12.setVisible(true);
					 lblNewLabel_13.setVisible(true);
					 lblNewLabel_14.setVisible(true);
					 lblNewLabel_15.setVisible(true);
					 lblNewLabel_16.setVisible(true);
					 btnNewButton_2.setVisible(true);
					 b1.setVisible(true);
					  
					 i=1;
					textField_1.setText(fname);
					textField_1.setVisible(true);
					textField_2.setText(mname);
					textField_2.setVisible(true);
					textField_3.setText(lname);
					textField_3.setVisible(true);
					textField_4.setText(fathern);
					textField_4.setVisible(true);
					textField_5.setText(mobno);
					textField_5.setVisible(true);
					textField_6.setText(email_id);
					textField_6.setVisible(true);
					textField_7.setText(address);
					textField_7.setVisible(true);
					textField_8.setText(city);
					textField_8.setVisible(true);
					textField_9.setText(state);
					textField_9.setVisible(true);
					textField_10.setText(designation);
					textField_10.setVisible(true);
					textField_11.setText(education);
					textField_11.setVisible(true);
					textField_12.setText(salary);
					textField_12.setVisible(true);
					textField_13.setText(panno);
					textField_13.setVisible(true);
					textField_14.setText(gender);
					textField_14.setVisible(true);
					
				}
			if(i==0) {
				JOptionPane.showMessageDialog(null, "id not found");
			}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource()==btnNewButton_1) {
			NewWindow w=new NewWindow();
			w.show();
			this.dispose();
		}
		else if( e.getSource()==b1&& i==1) {
			int b=Integer.parseInt(textField.getText());
			try {
				PreparedStatement ps = con.prepareStatement("update emp set first='"+textField_1.getText()+"',middle='"+textField_2.getText()+"',"
						+ "last='"+textField_3.getText()+"',father_name='"+textField_4.getText()+"',gender='"+textField_14.getText()+"',mobno='"+textField_5.getText()+"',"
								+ "email_id='"+textField_6.getText()+"',address='"+textField_7.getText()+"',city='"+textField_8.getText()+"',state='"+textField_9.getText()+"'"
						+ " ,designation='"+textField_10.getText()+"',education='"+textField_11.getText()+"',salary='"+textField_12.getText()+"'"
								+ ",panno='"+textField_13.getText()+"'where emp_id='"+b+"'");
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Updated Successfully");
				 lblNewLabel_2.setVisible(false);
				 lblNewLabel_3.setVisible(false);
				 lblNewLabel_4.setVisible(false);
				 lblNewLabel_5.setVisible(false);
				 lblNewLabel_6.setVisible(false);
				 lblNewLabel_8.setVisible(false);
				 lblNewLabel_9.setVisible(false);
				 lblNewLabel_10.setVisible(false);
				 lblNewLabel_11.setVisible(false);
				 lblNewLabel_12.setVisible(false);
				 lblNewLabel_13.setVisible(false);
				 lblNewLabel_14.setVisible(false);
				 lblNewLabel_15.setVisible(false);
				 lblNewLabel_16.setVisible(false);
				 
				 textField_1.setVisible(false);
				 textField_2.setVisible(false);
				 textField_3.setVisible(false);
				 textField_4.setVisible(false);
				 textField_5.setVisible(false);
				 textField_6.setVisible(false);
				 textField_7.setVisible(false);
				 textField_8.setVisible(false);
				 textField_9.setVisible(false);
				 textField_10.setVisible(false);
				 textField_11.setVisible(false);
				 textField_12.setVisible(false);
				 textField_13.setVisible(false);
				 textField_14.setVisible(false);
				 
				 btnNewButton_2.setVisible(false);
				 b1.setVisible(false);
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}	
		}
		
		else if(e.getSource()==btnNewButton_2)
		
		{	 
			lblNewLabel_2.setVisible(false);
			 lblNewLabel_3.setVisible(false);
			 lblNewLabel_4.setVisible(false);
			 lblNewLabel_5.setVisible(false);
			 lblNewLabel_6.setVisible(false);
			 lblNewLabel_8.setVisible(false);
			 lblNewLabel_9.setVisible(false);
			 lblNewLabel_10.setVisible(false);
			 lblNewLabel_11.setVisible(false);
			 lblNewLabel_12.setVisible(false);
			 lblNewLabel_13.setVisible(false);
			 lblNewLabel_14.setVisible(false);
			 lblNewLabel_15.setVisible(false);
			 lblNewLabel_16.setVisible(false);
			 
			 textField_1.setVisible(false);
			 textField_2.setVisible(false);
			 textField_3.setVisible(false);
			 textField_4.setVisible(false);
			 textField_5.setVisible(false);
			 textField_6.setVisible(false);
			 textField_7.setVisible(false);
			 textField_8.setVisible(false);
			 textField_9.setVisible(false);
			 textField_10.setVisible(false);
			 textField_11.setVisible(false);
			 textField_12.setVisible(false);
			 textField_13.setVisible(false);
			 textField_14.setVisible(false);
			 
			 btnNewButton_2.setVisible(false);
			 b1.setVisible(false);
		}
		
		}
}

