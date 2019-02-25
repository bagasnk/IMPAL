package Supplier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class supp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supp window = new supp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public supp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSuppier = new JLabel("SUPPLIER");
		lblSuppier.setBounds(10, 11, 57, 14);
		frame.getContentPane().add(lblSuppier);
		
		JButton btnInput = new JButton("Input Data Barang");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInput.setBounds(20, 227, 130, 23);
		frame.getContentPane().add(btnInput);
		
		JCheckBox chckbxBrodoCasual = new JCheckBox("Brodo Casual");
		chckbxBrodoCasual.setBackground(Color.GRAY);
		chckbxBrodoCasual.setBounds(10, 88, 97, 23);
		frame.getContentPane().add(chckbxBrodoCasual);
		
		JCheckBox chckbxJager = new JCheckBox("Jager");
		chckbxJager.setBackground(Color.GRAY);
		chckbxJager.setBounds(158, 88, 97, 23);
		frame.getContentPane().add(chckbxJager);
		
		JCheckBox chckbxMokasino = new JCheckBox("Mokasino");
		chckbxMokasino.setBackground(Color.GRAY);
		chckbxMokasino.setBounds(294, 88, 97, 23);
		frame.getContentPane().add(chckbxMokasino);
		
		JCheckBox checkBox = new JCheckBox("39");
		checkBox.setBounds(10, 107, 97, 23);
		frame.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("40");
		checkBox_1.setBounds(10, 125, 97, 23);
		frame.getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("39");
		checkBox_2.setBounds(158, 107, 97, 23);
		frame.getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_4 = new JCheckBox("41");
		checkBox_4.setBounds(10, 143, 97, 23);
		frame.getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("42");
		checkBox_5.setBounds(10, 171, 97, 23);
		frame.getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("43");
		checkBox_6.setBounds(10, 197, 97, 23);
		frame.getContentPane().add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("40");
		checkBox_7.setBounds(158, 125, 97, 23);
		frame.getContentPane().add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("40");
		checkBox_8.setBounds(294, 125, 97, 23);
		frame.getContentPane().add(checkBox_8);
		
		JCheckBox checkBox_3 = new JCheckBox("39");
		checkBox_3.setBounds(294, 107, 97, 23);
		frame.getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_9 = new JCheckBox("41");
		checkBox_9.setBounds(158, 143, 97, 23);
		frame.getContentPane().add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("41");
		checkBox_10.setBounds(294, 143, 97, 23);
		frame.getContentPane().add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("42");
		checkBox_11.setBounds(158, 171, 97, 23);
		frame.getContentPane().add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("42");
		checkBox_12.setBounds(294, 171, 97, 23);
		frame.getContentPane().add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("43");
		checkBox_13.setBounds(158, 197, 97, 23);
		frame.getContentPane().add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("43");
		checkBox_14.setBounds(294, 197, 97, 23);
		frame.getContentPane().add(checkBox_14);
		
		JButton btnKirimBarang = new JButton("Kirim Barang");
		btnKirimBarang.setBounds(302, 227, 109, 23);
		frame.getContentPane().add(btnKirimBarang);
	}
}
