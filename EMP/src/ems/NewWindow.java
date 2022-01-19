package ems;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;


public class NewWindow extends JFrame implements MouseListener {

	private JPanel contentPane;
	JPanel panel;
	JPanel panel_1;
	JPanel panel_2;
	JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWindow frame = new NewWindow();
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
	public NewWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 613);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(10, 132, 216, 52);
		contentPane.add(panel);
		
		JLabel l1 = new JLabel("Add employee\r\n\r\n");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l1.setForeground(new Color(139, 69, 19));
		panel.add(l1);
		
		 panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 255, 47));
		panel_1.setBounds(10, 184, 216, 52);
		contentPane.add(panel_1);
		
		JLabel l2 = new JLabel("Update details");
		l2.setForeground(new Color(128, 0, 0));
		l2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(l2);
		
		 panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(10, 236, 216, 52);
		contentPane.add(panel_2);
		
		JLabel l3 = new JLabel("Delete employee\r\n");
		l3.setForeground(new Color(128, 0, 128));
		l3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(l3);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 215, 0));
		panel_3.setBounds(10, 288, 216, 52);
		contentPane.add(panel_3);
		
		JLabel l4 = new JLabel("View all\r\n");
		l4.setForeground(new Color(0, 100, 0));
		l4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_3.add(l4);
		
		JLabel l5 = new JLabel("Welcome to Employee Management System\r\n\r\n");
		l5.setFont(new Font("Tahoma", Font.ITALIC, 30));
		l5.setBounds(161, 40, 617, 69);
		contentPane.add(l5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setIcon(new ImageIcon(NewWindow.class.getResource("/images/emsss.jpg")));
		lblNewLabel.setBounds(287, 132, 600, 410);
		contentPane.add(lblNewLabel);
		
		panel.addMouseListener(this);
		panel_3.addMouseListener(this);
		panel_1.addMouseListener(this);
		panel_2.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==panel) {
			Add add=new Add();
			add.show();
			this.dispose();
		}
		if(e.getSource()==panel_1) {
			Update u=new Update();
			u.show();
			this.dispose();
		}
		if(e.getSource()==panel_2) {
			Delete d=new Delete();
			d.show();
			this.dispose();
		}
	if(e.getSource()==panel_3) {
		View_All v=new View_All();
		v.show();
		this.dispose();
	}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
