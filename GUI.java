import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class GUI {

	private JFrame frame;
    private JComboBox comboBox;
    private JLabel TestText;
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
		
		JLabel lblNewLabel = new JLabel("Instan Tour");
		lblNewLabel.setFont(new Font("DecoType Naskh", Font.PLAIN, 28));
		lblNewLabel.setBounds(242, 6, 296, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("---------------------------------------------------------------------------------");
		label.setBounds(18, 33, 648, 16);
		frame.getContentPane().add(label);
		
		JLabel lblWelcomeToInstantour = new JLabel("Welcome to InstanTour !");
		lblWelcomeToInstantour.setBounds(242, 62, 167, 31);
		frame.getContentPane().add(lblWelcomeToInstantour);
		
		JLabel lblWeHave = new JLabel("We have 5+ sights and 5+ restaurants for your tour.");
		lblWeHave.setBounds(169, 105, 341, 16);
		frame.getContentPane().add(lblWeHave);
		
		JLabel lblWeWillInstantly = new JLabel("We will instantly arrange some tours for you.");
		lblWeWillInstantly.setBounds(197, 141, 296, 16);
		frame.getContentPane().add(lblWeWillInstantly);
		
		JLabel lblHowLongWould = new JLabel("How long would you like to tour?");
		lblHowLongWould.setBounds(45, 194, 233, 16);
		frame.getContentPane().add(lblHowLongWould);
		
		comboBox = new JComboBox();
		comboBox.setBounds(41, 222, 149, 27);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Select");
		comboBox.addItem("1 Day");
		comboBox.addItem("2 Days");
		comboBox.addItem("3 Days");
		
	
		
		TestText = new JLabel("");
		TestText.setBounds(232, 307, 199, 21);
		frame.getContentPane().add(TestText);
		
		
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TestText.setText((String)comboBox.getSelectedItem());
				
			}
		});
		btnContinue.setBounds(512, 263, 117, 29);
		frame.getContentPane().add(btnContinue);
		

		
		
		

		
	}
}
