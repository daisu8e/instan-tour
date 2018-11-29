import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Day1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Day1 window = new Day1();
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
	public Day1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 648, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGggg = new JLabel("(1) ------------------------------------------------------------");
		lblGggg.setForeground(Color.RED);
		lblGggg.setBounds(58, 6, 558, 27);
		frame.getContentPane().add(lblGggg);
		
		JLabel lblGranvilleIsland = new JLabel("Granville Island > Yaletown");
		lblGranvilleIsland.setBounds(58, 32, 481, 27);
		frame.getContentPane().add(lblGranvilleIsland);
	}

}
