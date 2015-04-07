package edu.mum.mscs.fpp.project.pos.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

import javax.swing.JPanel;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JButton;

public class program {

	private JFrame frmPizzaOrderSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					program window = new program();
					window.frmPizzaOrderSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public program() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPizzaOrderSystem = new JFrame();
		frmPizzaOrderSystem.setForeground(SystemColor.activeCaption);
		frmPizzaOrderSystem.setTitle("Pizza Order System");
		frmPizzaOrderSystem.setBounds(100, 100, 621, 411);
		frmPizzaOrderSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzaOrderSystem.getContentPane().setLayout(
				new BoxLayout(frmPizzaOrderSystem.getContentPane(),
						BoxLayout.X_AXIS));

		final JPanel panel = new JPanel();
		panel.setForeground(SystemColor.activeCaptionBorder);
		frmPizzaOrderSystem.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JButton orderPizzaButton = new JButton("Order Pizza");
		orderPizzaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, orderPizzaButton, 70,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, orderPizzaButton, 309,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, orderPizzaButton, -88,
				SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, orderPizzaButton, -49,
				SpringLayout.EAST, panel);
		orderPizzaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(orderPizzaButton);

		JButton loginButton = new JButton("Login System");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				final loginPanel lp = new loginPanel();
				lp.setVisible(true);
				lp.btnLoginPanel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (lp.txtUsername.getText().isEmpty()) {
							JOptionPane.showMessageDialog(lp.contentPane,
									"Please insert Username !!!");
						} else if (lp.txtPassword.getText().isEmpty()) {
							JOptionPane.showMessageDialog(lp.contentPane,
									"Please insert Password !!!");
						} else if (lp.txtPassword.getText().equals("admin")
								&& lp.txtUsername.getText().equals("admin")) {
							lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							lp.setVisible(false);
							final InventoryUI inv = new InventoryUI();
							frmPizzaOrderSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frmPizzaOrderSystem.setVisible(false);
							panel.setVisible(false);
							inv.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(lp.contentPane,
									"Username or Password wrong !!!");
						}

					}
				});
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, loginButton, 0,
				SpringLayout.NORTH, orderPizzaButton);
		sl_panel.putConstraint(SpringLayout.WEST, loginButton, 49,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, loginButton, -88,
				SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, loginButton, -13,
				SpringLayout.WEST, orderPizzaButton);
		panel.add(loginButton);
	}
}
