import java.awt.EventQueue;


import java.awt.Image;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.Color;

public class GUI {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 150, 684, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("---------------------------------------------------------------------------------");
		label.setBounds(18, 56, 648, 16);
		frame.getContentPane().add(label);
		
		JLabel lblWelcomeToInstantour = new JLabel("Welcome to InstanTour !");
		lblWelcomeToInstantour.setFont(new Font("Hiragino Kaku Gothic Std", Font.PLAIN, 18));
		lblWelcomeToInstantour.setBounds(72, 84, 289, 31);
		frame.getContentPane().add(lblWelcomeToInstantour);
		
		JLabel lblWeHave = new JLabel("We have 5+ sights and 5+ restaurants for your tour.");
		lblWeHave.setBounds(45, 130, 341, 16);
		frame.getContentPane().add(lblWeHave);
		
		JLabel lblWeWillInstantly = new JLabel("We will instantly arrange some tours for you.");
		lblWeWillInstantly.setBounds(45, 169, 296, 16);
		frame.getContentPane().add(lblWeWillInstantly);
		
		JLabel lblHowLongWould = new JLabel("How long would you like to tour?");
		lblHowLongWould.setBounds(45, 230, 233, 16);
		frame.getContentPane().add(lblHowLongWould);
		
		
		
		JButton btnContinue = new JButton("1 Day");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				frame.dispose();
				secondbox second= new secondbox();
				second.setVisible(true);
				
			}
		});
		btnContinue.setBounds(33, 294, 117, 29);
		frame.getContentPane().add(btnContinue);
		
		JLabel lblPleaseSelect = new JLabel("Please select …");
		lblPleaseSelect.setForeground(Color.BLUE);
		lblPleaseSelect.setBounds(46, 254, 233, 16);
		frame.getContentPane().add(lblPleaseSelect);
		
		JButton btnDay = new JButton("2 Days");
		btnDay.setBounds(150, 294, 117, 29);
		frame.getContentPane().add(btnDay);
		
		JButton btnDay_1 = new JButton("3 Days");
		btnDay_1.setBounds(265, 294, 117, 29);
		frame.getContentPane().add(btnDay_1);
		
		JLabel lblI = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("Pic/Main_logo.png")).getImage();
		lblI.setIcon(new ImageIcon(img));
		lblI.setBounds(398, 74, 256, 256);
		frame.getContentPane().add(lblI);
		
		JLabel label_1 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("Pic/Aria.png")).getImage();
		label_1.setIcon(new ImageIcon(img2));
		label_1.setBounds(224, 6, 223, 56);
		frame.getContentPane().add(label_1);
		

		
		
		

		
	}
}
