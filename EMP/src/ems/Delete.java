package ems;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

import javax.swing.JTextField;
import javax.swing.JButton;

public class Delete extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;	
	JButton  btnNewButton;
	JButton btnNewButton_1;
	JLabel lblNewLabel_2 ;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_5;
	JLabel lblNewLabel_6;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_8;
	JLabel lblNewLabel_9;
	JLabel lblNewLabel_10;
	JLabel lblNewLabel_11;
	JButton btnNewButton_2;
	JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		con = Mysqlconn.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 504);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Employee Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel.setBounds(180, 10, 233, 34);
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
		
		 lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 159, 100, 19);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		 lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(165, 158, 142, 19);
		contentPane.add(lblNewLabel_3);
		
	   lblNewLabel_4 = new JLabel("Middle Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 188, 118, 19);
		lblNewLabel_4.setVisible(false);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(165, 187, 103, 18);
		contentPane.add(lblNewLabel_5);
		
	    lblNewLabel_6 = new JLabel("Last Name:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(10, 217, 100, 19);
		lblNewLabel_6.setVisible(false);
		contentPane.add(lblNewLabel_6);
		
	    lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(165, 216, 118, 21);
		contentPane.add(lblNewLabel_7);
		
	   lblNewLabel_8 = new JLabel("Education:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(10, 256, 100, 19);
		lblNewLabel_8.setVisible(false);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(165, 258, 109, 19);
		contentPane.add(lblNewLabel_9);
		
	   lblNewLabel_10 = new JLabel("Designation:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(10, 287, 100, 19);
		lblNewLabel_10.setVisible(false);
		contentPane.add(lblNewLabel_10);
		
		 lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(165, 287, 103, 18);
		contentPane.add(lblNewLabel_11);
		
		 btnNewButton_2 = new JButton("Remove");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(255, 360, 101, 21);
		btnNewButton_2.setVisible(false);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		 btnNewButton_3 = new JButton("back");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBounds(10, 360, 85, 21);
		btnNewButton_3.setVisible(false);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_1) {
			NewWindow w=new NewWindow();
			w.show();
			this.dispose();
		}
		
		else if(e.getSource()==btnNewButton) {
			PreparedStatement pst;
			try {
				int a=Integer.parseInt(textField.getText());
				pst = con.prepareStatement("select first,middle,last,education,designation from emp where emp_id='"+a+"'");
				ResultSet rs=pst.executeQuery();
				
				int i=0;
				if(rs.next()) {
					String fname=rs.getString(1);
					String mname=rs.getString(2);
					String lname=rs.getString(3);
					String education=rs.getString(4);
					String designation=rs.getString(5);
					
					 lblNewLabel_2.setVisible(true);
					 lblNewLabel_4.setVisible(true);
					 lblNewLabel_6.setVisible(true);
					 lblNewLabel_8.setVisible(true);
					 lblNewLabel_10.setVisible(true);
					 btnNewButton_2.setVisible(true);
					 btnNewButton_3.setVisible(true);
					  
					 i=1;
					 lblNewLabel_3.setText(fname);
					 lblNewLabel_5.setText(mname);
					 lblNewLabel_7.setText(lname);
					 lblNewLabel_9.setText(education);
					 lblNewLabel_11.setText(designation);
				}
			if(i==0) {
				JOptionPane.showMessageDialog(null, "id not found");
			}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource()==btnNewButton_2) {
			int b=Integer.parseInt(textField.getText());
			try {
				PreparedStatement ps = con.prepareStatement("delete from emp where emp_id='"+b+"'");
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Deleted Successfully");
				 lblNewLabel_2.setVisible(false);
				 lblNewLabel_3.setVisible(false);
				 lblNewLabel_4.setVisible(false);
				 lblNewLabel_5.setVisible(false);
				 lblNewLabel_6.setVisible(false);
				 lblNewLabel_7.setVisible(false);
				 lblNewLabel_8.setVisible(false);
				 lblNewLabel_9.setVisible(false);
				 lblNewLabel_10.setVisible(false);
				 lblNewLabel_11.setVisible(false);
				 btnNewButton_2.setVisible(false);
				 btnNewButton_3.setVisible(false);
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource()==btnNewButton_3) {
			lblNewLabel_2.setVisible(false);
			 lblNewLabel_3.setVisible(false);
			 lblNewLabel_4.setVisible(false);
			 lblNewLabel_5.setVisible(false);
			 lblNewLabel_6.setVisible(false);
			 lblNewLabel_7.setVisible(false);
			 lblNewLabel_8.setVisible(false);
			 lblNewLabel_9.setVisible(false);
			 lblNewLabel_10.setVisible(false);
			 lblNewLabel_11.setVisible(false);
			 btnNewButton_2.setVisible(false);
			 btnNewButton_3.setVisible(false);
		}
	}
}
