import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SAUQI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SAUQI frame = new SAUQI();
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
	public SAUQI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSauqiOnlineShop = new JLabel("SAUQI ONLINE SHOP");
		lblSauqiOnlineShop.setBounds(0, 11, 124, 14);
		contentPane.add(lblSauqiOnlineShop);
		
		JLabel lblIdr = new JLabel("IDR 280.000");
		lblIdr.setBounds(10, 125, 74, 14);
		contentPane.add(lblIdr);
		
		JLabel lblIdr_1 = new JLabel("IDR 200.000");
		lblIdr_1.setBounds(177, 125, 74, 14);
		contentPane.add(lblIdr_1);
		
		JLabel label = new JLabel("IDR 200.000");
		label.setBounds(326, 125, 74, 14);
		contentPane.add(label);
		
		JLabel lblTersedia = new JLabel("39 Tersedia");
		lblTersedia.setBounds(10, 152, 74, 14);
		contentPane.add(lblTersedia);
		
		JLabel lblTersedia_1 = new JLabel("40 Tersedia");
		lblTersedia_1.setBounds(10, 164, 74, 14);
		contentPane.add(lblTersedia_1);
		
		JLabel lblTersedia_2 = new JLabel("41 Tersedia");
		lblTersedia_2.setBounds(10, 177, 74, 14);
		contentPane.add(lblTersedia_2);
		
		JLabel lblTersedia_3 = new JLabel("42 Tersedia");
		lblTersedia_3.setBounds(10, 189, 74, 14);
		contentPane.add(lblTersedia_3);
		
		JLabel lblTersedia_5 = new JLabel("43 Tersedia");
		lblTersedia_5.setBounds(10, 202, 74, 14);
		contentPane.add(lblTersedia_5);
		
		JLabel label_1 = new JLabel("39 Tersedia");
		label_1.setBounds(177, 150, 74, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("40 Tersedia");
		label_2.setBounds(177, 164, 74, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("41 Tersedia");
		label_3.setBounds(177, 177, 74, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("42 Tersedia");
		label_4.setBounds(177, 189, 74, 14);
		contentPane.add(label_4);
		
		JLabel lblTersedia_4 = new JLabel("43 Tersedia");
		lblTersedia_4.setBounds(177, 201, 74, 14);
		contentPane.add(lblTersedia_4);
		
		JLabel label_5 = new JLabel("39 Tersedia");
		label_5.setBounds(326, 150, 74, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("40 Tersedia");
		label_6.setBounds(326, 164, 74, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("41 Tersedia");
		label_7.setBounds(326, 177, 74, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("42 Tersedia");
		label_8.setBounds(326, 189, 74, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("43 Tersedia");
		label_9.setBounds(326, 202, 74, 14);
		contentPane.add(label_9);
		
		JButton btnBrodoCasual = new JButton("Brodo Casual");
		btnBrodoCasual.setBackground(new Color(0, 0, 0));
		btnBrodoCasual.setBounds(0, 101, 100, 23);
		contentPane.add(btnBrodoCasual);
		
		JButton btnJager = new JButton("Jager");
		btnJager.setBackground(new Color(0, 0, 0));
		btnJager.setBounds(161, 101, 100, 23);
		contentPane.add(btnJager);
		
		JButton btnMokasino = new JButton("Mokasino");
		btnMokasino.setBackground(new Color(0, 0, 0));
		btnMokasino.setBounds(308, 101, 100, 23);
		contentPane.add(btnMokasino);
		
		JButton btnKategori = new JButton("Kategori");
		btnKategori.setBackground(new Color(0, 0, 0));
		btnKategori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKategori.setBounds(0, 227, 100, 23);
		contentPane.add(btnKategori);
		
		JButton btnBag = new JButton("Bag");
		btnBag.setBackground(new Color(0, 0, 0));
		btnBag.setBounds(110, 226, 100, 23);
		contentPane.add(btnBag);
		
		JButton btnWishlist = new JButton("Wishlist");
		btnWishlist.setBackground(new Color(0, 0, 0));
		btnWishlist.setBounds(220, 226, 100, 23);
		contentPane.add(btnWishlist);
		
		JButton btnAkun = new JButton("Akun");
		btnAkun.setBackground(new Color(0, 0, 0));
		btnAkun.setBounds(326, 227, 100, 23);
		contentPane.add(btnAkun);
	}

}
