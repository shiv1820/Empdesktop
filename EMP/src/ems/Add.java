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

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Add extends JFrame implements ActionListener {

	private JPanel contentPane;
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
	JButton b1;
	JButton btnNewButton;
	JRadioButton bmale;
	JRadioButton bfemale;
	JRadioButton btransg;
	private String gender;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
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
	public Add() {
		  
		con = Mysqlconn.dbconnect();
		  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 639);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l = new JLabel("ADD\r\n");
		l.setFont(new Font("Dialog", Font.ITALIC, 25));
		l.setBounds(431, 10, 67, 59);
		contentPane.add(l);
		
		JLabel lblNewLabel = new JLabel("First Name\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 139, 78, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Middle name\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(312, 139, 96, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(631, 147, 112, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Father's Name\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 179, 112, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 223, 58, 19);
		contentPane.add(lblNewLabel_5);
		
		 bmale = new JRadioButton("Male\r\n");
		bmale.setBounds(190, 224, 67, 21);
		contentPane.add(bmale);
		
		 bfemale = new JRadioButton("female\r\n");
		bfemale.setBounds(369, 224, 78, 21);
		contentPane.add(bfemale);
		
		 btransg = new JRadioButton("transgender");
		btransg.setBounds(552, 224, 103, 21);
		contentPane.add(btransg);
		
		ButtonGroup group=new ButtonGroup();
		group.add(bmale);
		group.add(bfemale);
		group.add(btransg);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 144, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(418, 144, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(730, 149, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(135, 184, 204, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Mobile Number");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 263, 103, 19);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email-id");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(391, 269, 67, 25);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(138, 265, 135, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(476, 274, 229, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(10, 324, 78, 19);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("City");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(294, 329, 34, 25);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("State");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(564, 337, 43, 17);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(94, 326, 135, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(351, 334, 118, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(631, 334, 112, 19);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Designation\r\n");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(10, 383, 87, 19);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Education");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(385, 388, 78, 19);
		contentPane.add(lblNewLabel_12);
		
		textField_10 = new JTextField();
		textField_10.setBounds(116, 385, 141, 19);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(489, 390, 141, 19);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Salary");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(10, 440, 43, 25);
		contentPane.add(lblNewLabel_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(104, 445, 96, 19);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Pan no.");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_14.setBounds(322, 448, 67, 17);
		contentPane.add(lblNewLabel_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(399, 446, 154, 19);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		 b1 = new JButton("Save\r\n");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.setBounds(369, 525, 85, 21);
		contentPane.add(b1);
		
		 btnNewButton = new JButton("back\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 527, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(this);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		try {
			String first=textField_1.getText();
			String middle=textField_2.getText();
			String last=textField_3.getText();
			String father=textField_4.getText();
			String mobile=textField_5.getText();
			String email=textField_6.getText();
			String adress=textField_7.getText();
			String city=textField_8.getText();
			String state=textField_9.getText();
			String designation =textField_10.getText();
			String education=textField_11.getText();
			String salary=textField_12.getText();
			String panno=textField_13.getText();
			if(bmale.isSelected()) 
				 gender="male";
			else if(bfemale.isSelected())
				gender="female";
				else if(btransg.isSelected())
					gender="transgender";
			
			PreparedStatement pst= con.prepareStatement("insert into emp(first,middle,last,father_name,gender,mobno,email_id,address,city,state,"
					+ "designation,education,salary,panno)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1,first );
			pst.setString(2,middle);
			pst.setString(3,last);
			pst.setString(4,father );
			pst.setString(5,gender );
			pst.setString(6,mobile );
			pst.setString(7,email);
			pst.setString(8,adress);
			pst.setString(9,city );
			pst.setString(10,state );
			pst.setString(11,designation);
			pst.setString(12,education );
			pst.setString(13,salary );
			pst.setString(14,panno);
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Details added successfully");
			}
		
		catch(Exception e1){
			e1.printStackTrace();
		}
	}
		 if(e.getSource()==btnNewButton) {
			 NewWindow w= new NewWindow();
			 this.dispose();
			 w.show();
		 }
	}
}
