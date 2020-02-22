package task1;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Task1 extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel welcomeLbl;
	private JLabel toLbl;
	private JLabel colourLbl;
	private JLabel chooseLbl;
	private JButton startBtn;

	public Task1() {
		setSize(600, 350);
		setTitle("Colour Game");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		welcomeLbl = new JLabel("WELCOME", SwingConstants.CENTER);
		welcomeLbl.setFont(new Font("Serif", Font.BOLD, 22));

		toLbl = new JLabel("to the", SwingConstants.CENTER);
		toLbl.setFont(new Font("Serif", Font.BOLD, 20));

		colourLbl = new JLabel("Colour Game", SwingConstants.CENTER);
		colourLbl.setForeground(Color.RED);
		colourLbl.setFont(new Font("Serif", Font.BOLD, 22));

		chooseLbl = new JLabel("> Choose the colour of the provided items", SwingConstants.CENTER);
		chooseLbl.setFont(new Font("Serif", Font.BOLD, 18));

		startBtn = new JButton("Start");
		startBtn.setBackground(Color.WHITE);
		startBtn.setFont(new Font("Serif", Font.BOLD, 18));

		getContentPane().add(welcomeLbl).setBounds(170, 0, 200, 50);
		getContentPane().add(toLbl).setBounds(170, 20, 200, 50);
		getContentPane().add(colourLbl).setBounds(170, 40, 200, 50);
		getContentPane().add(chooseLbl).setBounds(140, 100, 340, 50);
		getContentPane().add(startBtn).setBounds(100, 200, 400, 50);

	}

	private void titleAlign(JFrame frame) {

		Font font = frame.getFont();

		String currentTitle = frame.getTitle().trim();
		System.out.println(frame.getFontMetrics(font));
		FontMetrics fm = frame.getFontMetrics(font);
		int frameWidth = frame.getWidth();
		int titleWidth = fm.stringWidth(currentTitle);
		int spaceWidth = fm.stringWidth(" ");
		int centerPos = (frameWidth / 2) - (titleWidth / 2);
		int spaceCount = centerPos / spaceWidth;
		String pad = "";
		pad = String.format("%" + (spaceCount - 14) + "s", pad);
		frame.setTitle(pad + currentTitle);

	}

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		task1.setVisible(true);
	}

}
