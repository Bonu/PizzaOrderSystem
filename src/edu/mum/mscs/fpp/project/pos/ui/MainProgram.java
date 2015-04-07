package edu.mum.mscs.fpp.project.pos.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class MainProgram extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProgram frame = new MainProgram();
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
	public MainProgram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Login System");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
							contentPane.setVisible(false);
							dispose();
							inv.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(lp.contentPane,
									"Username or Password wrong !!!");
						}

					}
				});
			}
		});
		btnNewButton.setBounds(46, 66, 317, 292);
		contentPane.add(btnNewButton);

		JButton btnPizzaOrder = new JButton("Pizza Order");
		btnPizzaOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PizzaOrderUI po = new PizzaOrderUI();
				po.setVisible(true);
				contentPane.setVisible(false);
				dispose();

			}
		});
		btnPizzaOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPizzaOrder.setBounds(413, 66, 317, 292);
		contentPane.add(btnPizzaOrder);
	}

}
