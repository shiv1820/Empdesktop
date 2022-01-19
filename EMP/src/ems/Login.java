package ems;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	JButton btnNewButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Login frame = new Login();
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
	public Login() {
		
	  con = Mysqlconn.dbconnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 637);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("LOGIN");
		lbl1.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lbl1.setBounds(161, 10, 83, 43);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setIcon(new ImageIcon(Login.class.getResource("/images/logg.jpg")));
		lbl2.setBounds(88, 94, 188, 212);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Username\r\n");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl3.setBounds(31, 353, 83, 19);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Password\r\n");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl4.setBounds(31, 393, 71, 19);
		contentPane.add(lbl4);
		
		textField = new JTextField();
		textField.setBounds(135, 353, 188, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 395, 188, 19);
		contentPane.add(passwordField);
		
	   btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(135, 443, 141, 43);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
		try{
			String username=textField.getText();
		    String password=passwordField.getText();
		    PreparedStatement pst=con.prepareStatement("select * from login where username=? and password=?");
		    pst.setString(1, username);
		    pst.setString(2, password);
		    ResultSet r=pst.executeQuery();
		    if(r.next()) {
		    	NewWindow w=new NewWindow();
		    	w.setVisible(true);
		    	this.dispose();
		    }else
		    {
		    	JOptionPane.showMessageDialog(null,"incorrect username or password" );
		    }
		    }
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
	}
	}
}
