package edu.mum.mscs.fpp.project.pos.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginPanel extends JFrame {
	public boolean loginStatus = false;
	public JPanel contentPane;
	public JTextField txtUsername;
	public JPasswordField txtPassword;
	public JButton btnLoginPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPanel frame = new loginPanel();
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
	public loginPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		txtUsername = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, txtUsername, -50,
				SpringLayout.EAST, contentPane);
		contentPane.add(txtUsername);
		txtUsername.setColumns(50);

		JLabel lblUsername = new JLabel("Username:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtUsername, -3,
				SpringLayout.NORTH, lblUsername);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtUsername, 28,
				SpringLayout.EAST, lblUsername);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPassword, 115,
				SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblUsername, -13,
				SpringLayout.NORTH, lblPassword);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPassword, -287,
				SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblUsername, 0,
				SpringLayout.EAST, lblPassword);
		contentPane.add(lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setColumns(50);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtPassword, 237,
				SpringLayout.EAST, lblPassword);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtPassword, 165,
				SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtPassword, 117,
				SpringLayout.NORTH, contentPane);
		contentPane.add(txtPassword);

		btnLoginPanel = new JButton("Login");
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLoginPanel, 17,
				SpringLayout.SOUTH, txtPassword);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLoginPanel, 0,
				SpringLayout.WEST, txtUsername);
		contentPane.add(btnLoginPanel);
	}

}
