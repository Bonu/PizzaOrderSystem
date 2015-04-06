package edu.mum.mscs.fpp.project.pos.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import edu.mum.mscs.fpp.project.pos.dao.TestDAO;

import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;

public class InventoryUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JScrollBar scrollBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TestDAO t = new TestDAO();
		System.out.println(t);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryUI frame = new InventoryUI();
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
	public InventoryUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(220, 11, 46, 14);
		contentPane.add(lblSearch);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 36, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 61, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(10, 86, 46, 14);
		contentPane.add(lblCode);
		
		textField = new JTextField();
		textField.setBounds(66, 33, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 58, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 83, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, ""},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Quantity", "Display Name"
			}
		) 
		{
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(0).setMinWidth(100);
		table.getColumnModel().getColumn(0).setMaxWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(135);
		table.getColumnModel().getColumn(1).setMinWidth(135);
		table.getColumnModel().getColumn(1).setMaxWidth(135);
		table.getColumnModel().getColumn(2).setPreferredWidth(135);
		table.getColumnModel().getColumn(2).setMinWidth(135);
		table.getColumnModel().getColumn(2).setMaxWidth(135);
		table.getColumnModel().getColumn(3).setPreferredWidth(135);
		table.getColumnModel().getColumn(3).setMinWidth(135);
		table.getColumnModel().getColumn(3).setMaxWidth(135);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setCellSelectionEnabled(true);
		table.setBounds(10, 140, 658, 211);
		contentPane.add(table);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(651, 140, 17, 211);
		contentPane.add(scrollBar);
		
	}
}
