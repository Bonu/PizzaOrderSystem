package edu.mum.mscs.fpp.project.pos.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;

import edu.mum.mscs.fpp.project.pos.model.Pizza;
import edu.mum.mscs.fpp.project.pos.model.PizzaStore;
import edu.mum.mscs.fpp.project.pos.model.SimplePizzaFactory;

public class PizzaOrderUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrderUI frame = new PizzaOrderUI();
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
	public PizzaOrderUI() {
		final ArrayList<String> toppings = new ArrayList<String>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBounds(10, 11, 188, 178);
		contentPane.add(panel);
		panel.setLayout(null);

		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setSelected(true);
		rdbtnSmall.setBounds(55, 42, 109, 23);
		panel.add(rdbtnSmall);

		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setBounds(55, 68, 109, 23);
		panel.add(rdbtnMedium);

		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setBounds(55, 94, 109, 23);
		panel.add(rdbtnLarge);

		final ButtonGroup bgSize = new ButtonGroup();
		bgSize.add(rdbtnSmall);
		bgSize.add(rdbtnMedium);
		bgSize.add(rdbtnLarge);
		rdbtnSmall.setActionCommand("rdbtnSmall");
		rdbtnMedium.setActionCommand("rdbtnMedium");
		rdbtnLarge.setActionCommand("rdbtnLarge");

		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(57, 0, 122, 14);
		panel.add(lblSize);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_1.setBounds(216, 11, 426, 178);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblTopping = new JLabel("Topping");
		lblTopping.setBounds(184, 0, 46, 14);
		panel_1.add(lblTopping);

		final JCheckBox chckFreshMozzarella = new JCheckBox("Fresh Mozzarella");
		chckFreshMozzarella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckFreshMozzarella.isSelected()) {
					toppings.add("Fresh Mozzarella");
				}
			}
		});
		chckFreshMozzarella.setBounds(16, 40, 149, 23);
		panel_1.add(chckFreshMozzarella);
		chckFreshMozzarella.setActionCommand("chckFreshMozzarella");

		JCheckBox chckParmesan = new JCheckBox("Parmesan");
		chckParmesan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toppings.add("Parmesan");
			}
		});
		chckParmesan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckParmesan.setBounds(16, 66, 97, 23);
		panel_1.add(chckParmesan);

		JCheckBox chckClams = new JCheckBox("Clams");
		chckClams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toppings.add("Clams");
			}
		});
		chckClams.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckClams.setBounds(16, 92, 97, 23);
		panel_1.add(chckClams);

		JCheckBox chckGratedParmesanCheese = new JCheckBox(
				"Grated parmesan cheese");
		chckGratedParmesanCheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toppings.add("Granted parmesan cheese");
			}
		});
		chckGratedParmesanCheese.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckGratedParmesanCheese.setBounds(16, 118, 205, 23);
		panel_1.add(chckGratedParmesanCheese);

		JCheckBox chckShreddedMozzarella = new JCheckBox("Shredded Mozzarella");
		chckShreddedMozzarella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toppings.add("Shredded Mozarella");
			}
		});
		chckShreddedMozzarella.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckShreddedMozzarella.setBounds(230, 40, 149, 23);
		panel_1.add(chckShreddedMozzarella);

		JCheckBox chckDicedOnion = new JCheckBox("Diced Onion");
		chckDicedOnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toppings.add("Decied onion");
			}
		});
		chckDicedOnion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckDicedOnion.setBounds(230, 66, 97, 23);
		panel_1.add(chckDicedOnion);

		JCheckBox chckSlicedMushrooms = new JCheckBox("Sliced Mushrooms");
		chckSlicedMushrooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toppings.add("Slied Mushrooms");
			}
		});
		chckSlicedMushrooms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		chckSlicedMushrooms.setBounds(228, 92, 182, 23);
		panel_1.add(chckSlicedMushrooms);

		JCheckBox chckSlicedRedPepper = new JCheckBox("Sliced Red Pepper");
		chckSlicedRedPepper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toppings.add("Sliced Red Pepper");
			}
		});
		chckSlicedRedPepper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		chckSlicedRedPepper.setBounds(228, 118, 130, 23);
		panel_1.add(chckSlicedRedPepper);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_2.setBounds(10, 196, 188, 122);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("Crust Type");
		lblNewLabel.setBounds(65, 0, 87, 14);
		panel_2.add(lblNewLabel);

		JRadioButton rdbtnRegularCrust = new JRadioButton("Regular Crust");
		rdbtnRegularCrust.setSelected(true);
		rdbtnRegularCrust.setBounds(43, 35, 109, 23);
		panel_2.add(rdbtnRegularCrust);

		JRadioButton rdbtnThinCrust = new JRadioButton("Thin Crust");
		rdbtnThinCrust.setBounds(43, 61, 109, 23);
		panel_2.add(rdbtnThinCrust);

		JRadioButton rdbtnCrust = new JRadioButton("Crust");
		rdbtnCrust.setBounds(43, 87, 109, 23);
		panel_2.add(rdbtnCrust);

		final ButtonGroup bgThin = new ButtonGroup();
		bgThin.add(rdbtnRegularCrust);
		bgThin.add(rdbtnThinCrust);
		bgThin.add(rdbtnCrust);
		rdbtnRegularCrust.setActionCommand("rdbtnRegularCrust");
		rdbtnThinCrust.setActionCommand("rdbtnThinCrust");
		rdbtnCrust.setActionCommand("rdbtnCrust");

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_3.setBounds(216, 195, 426, 123);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblSauce = new JLabel("Pizza Type");
		lblSauce.setBounds(186, 0, 46, 14);
		panel_3.add(lblSauce);

		JRadioButton rdbtnMarinaraPizzaSauce = new JRadioButton("Cheese Pizza");
		rdbtnMarinaraPizzaSauce.setSelected(true);
		rdbtnMarinaraPizzaSauce.setBounds(26, 32, 197, 23);
		panel_3.add(rdbtnMarinaraPizzaSauce);

		JRadioButton rdbtnWhiteGarlicSauce = new JRadioButton("Pepperoni Pizza");
		rdbtnWhiteGarlicSauce.setBounds(26, 72, 170, 23);
		panel_3.add(rdbtnWhiteGarlicSauce);

		JRadioButton rdbtnMarinaraSauce = new JRadioButton("Veggie Pizza");
		rdbtnMarinaraSauce.setBounds(228, 32, 170, 23);
		panel_3.add(rdbtnMarinaraSauce);

		JRadioButton rdbtnClamPizza = new JRadioButton("Clam Pizza");
		rdbtnClamPizza.setBounds(228, 72, 109, 23);
		panel_3.add(rdbtnClamPizza);

		rdbtnMarinaraPizzaSauce.setActionCommand("rdbtnCheesePizza");
		rdbtnWhiteGarlicSauce.setActionCommand("rdbtnPepperoniPizza");
		rdbtnMarinaraSauce.setActionCommand("rdbtnVeggiePizza");
		rdbtnClamPizza.setActionCommand("rdbtnClamPizza");

		final ButtonGroup bgSauce = new ButtonGroup();
		bgSauce.add(rdbtnMarinaraPizzaSauce);
		bgSauce.add(rdbtnWhiteGarlicSauce);
		bgSauce.add(rdbtnMarinaraSauce);
		bgSauce.add(rdbtnClamPizza);

		JButton btnCreate = new JButton("Create");
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Sause = ((JToggleButton.ToggleButtonModel) bgSauce
						.getSelection()).getActionCommand();
				String Size = ((JToggleButton.ToggleButtonModel) bgSize
						.getSelection()).getActionCommand();
				String Thin = ((JToggleButton.ToggleButtonModel) bgThin
						.getSelection()).getActionCommand();
				SimplePizzaFactory factory = new SimplePizzaFactory();
				PizzaStore store = new PizzaStore(factory);

//				Pizza pizza = store.orderPizza("cheese", "pepperoni", "clam", "veggie");
				Pizza pizza = store.orderPizza(Sause, Thin, Size, toppings);
				contentPane.setVisible(false);
				dispose();
				

			}
		});
		btnCreate.setBounds(241, 351, 89, 23);
		contentPane.add(btnCreate);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				MainProgram mp = new MainProgram();
				mp.setVisible(true);
			}
		});
		btnCancel.setBounds(364, 351, 89, 23);
		contentPane.add(btnCancel);
	}

}
