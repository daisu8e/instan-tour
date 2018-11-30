import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class secondbox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondbox frame = new secondbox();
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
	public secondbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 684, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOne = new JLabel("(1) ------------------------------------------------------------");
		lblOne.setForeground(Color.RED);
		lblOne.setBounds(22, 38, 599, 23);
		contentPane.add(lblOne);
		
		JLabel lblY = new JLabel("Granville Island > Yaletown");
		lblY.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblY.setBounds(32, 61, 278, 40);
		contentPane.add(lblY);
		
		JLabel label = new JLabel("— ------------------------------------------------------------");
		label.setForeground(Color.RED);
		label.setBounds(22, 98, 599, 23);
		contentPane.add(label);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		btnBack.setBounds(22, 349, 75, 23);
		contentPane.add(btnBack);
		
		JLabel lblTouristReviews = new JLabel("183 tourist reviews\n");
		lblTouristReviews.setBounds(307, 70, 125, 28);
		contentPane.add(lblTouristReviews);
		
		JLabel label_1 = new JLabel("Please select …");
		label_1.setForeground(Color.BLUE);
		label_1.setBounds(559, 29, 106, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("(2) ------------------------------------------------------------");
		label_2.setForeground(Color.RED);
		label_2.setBounds(29, 135, 599, 23);
		contentPane.add(label_2);
		
		JLabel lblTouristReviews_1 = new JLabel("73 tourist reviews.  ");
		lblTouristReviews_1.setBounds(329, 167, 125, 28);
		contentPane.add(lblTouristReviews_1);
		
		JLabel label_4 = new JLabel("Granville Island > Yaletown");
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_4.setBounds(39, 158, 278, 40);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("— ------------------------------------------------------------");
		label_5.setForeground(Color.RED);
		label_5.setBounds(29, 195, 599, 23);
		contentPane.add(label_5);
		
		JLabel label_3 = new JLabel("(3) ------------------------------------------------------------");
		label_3.setForeground(Color.RED);
		label_3.setBounds(32, 235, 599, 23);
		contentPane.add(label_3);
		
		JLabel label_6 = new JLabel("Granville Island > Yaletown");
		label_6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_6.setBounds(42, 258, 278, 40);
		contentPane.add(label_6);
		
		JLabel lblTouristReviews_2 = new JLabel("8   tourist reviews");
		lblTouristReviews_2.setBounds(332, 267, 125, 28);
		contentPane.add(lblTouristReviews_2);
		
		JLabel label_8 = new JLabel("— ------------------------------------------------------------");
		label_8.setForeground(Color.RED);
		label_8.setBounds(32, 295, 599, 23);
		contentPane.add(label_8);
		
		JLabel star = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		star.setIcon(new ImageIcon(img));
		star.setBounds(428, 73, 20, 20);
		contentPane.add(star);
		
		JLabel Star2 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		Star2.setIcon(new ImageIcon(img));
		Star2.setBounds(454, 73, 20, 20);
		contentPane.add(Star2);
		
		JLabel Star3 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		Star3.setIcon(new ImageIcon(img));
		Star3.setBounds(477, 73, 20, 20);
		contentPane.add(Star3);
		
		JLabel Star4 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		Star4.setIcon(new ImageIcon(img));
		Star4.setBounds(500, 73, 20, 20);
		contentPane.add(Star4);
		
		JLabel Star5 = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		Star5.setIcon(new ImageIcon(img));
		Star5.setBounds(524, 73, 20, 20);
		contentPane.add(Star5);
		
		JLabel Star6 = new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		Star6.setIcon(new ImageIcon(img));
		Star6.setBounds(454, 170, 20, 20);
		contentPane.add(Star6);
		
		JLabel Star7 = new JLabel("");
		Image img7=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		Star7.setIcon(new ImageIcon(img));
		Star7.setBounds(477, 170, 20, 20);
		contentPane.add(Star7);
		
		JLabel Star8 = new JLabel("");
		Image img8=new ImageIcon(this.getClass().getResource("/Ster.png")).getImage();
		Star8.setIcon(new ImageIcon(img));
		Star8.setBounds(464, 270, 20, 20);
		contentPane.add(Star8);
		
		JButton btnFirst = new JButton("First");
		btnFirst.setBounds(576, 71, 75, 23);
		contentPane.add(btnFirst);
		
		JButton btnSecond = new JButton("Second");
		btnSecond.setBounds(576, 170, 75, 23);
		contentPane.add(btnSecond);
		
		JButton btnThird = new JButton("Third");
		btnThird.setBounds(576, 270, 75, 23);
		contentPane.add(btnThird);
	}
}
