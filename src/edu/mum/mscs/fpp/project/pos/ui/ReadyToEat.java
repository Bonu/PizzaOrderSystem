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
import javax.swing.JTextArea;

public class ReadyToEat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public ReadyToEat(String s) throws IOException {
		setTitle("Verify Your Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		System.out.println(s);
		BufferedImage myPicture = ImageIO.read(new File("redball.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBounds(113, 11, 290, 299);
		contentPane.add(picLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(121, 335, 314, 280);
		textArea.setText(s);
		contentPane.add(textArea);
		contentPane.setVisible(true);
	}
}
