package edu.mum.mscs.fpp.project.pos.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ReadyToEat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadyToEat frame = new ReadyToEat("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public ReadyToEat(String s) throws IOException {
		setTitle("Verify Your Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		System.out.println(s);
		BufferedImage myPicture = ImageIO.read(new File("redball.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBounds(113, 11, 290, 299);
		contentPane.add(picLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(113, 340, 290, 81);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(s);
		contentPane.setVisible(true);
	}

}
