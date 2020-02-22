package task3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Task3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JComboBox<String> colorCombo;
	private JCheckBox backgroundChk;
	private JCheckBox foregroundChk;
	private JButton okBtn;
	private JButton cancelBtn;

	public Task3() {

		setSize(600, 380);
		setTitle("Colour Game");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		colorCombo = new JComboBox<>();
		colorCombo.addItem("Red");
		colorCombo.addItem("Blue");
		colorCombo.addItem("Green");
		colorCombo.addItem("Black");
		colorCombo.addItem("White");
		colorCombo.setBackground(Color.WHITE);
		colorCombo.setBorder(new RoundedBorder(10));

		backgroundChk = new JCheckBox("Background");
		backgroundChk.setBackground(Color.WHITE);
		backgroundChk.setOpaque(true);
		backgroundChk.setBorder(new RoundedBorder(10));

		foregroundChk = new JCheckBox("Forground");
		foregroundChk.setBackground(Color.WHITE);
		foregroundChk.setOpaque(true);
		foregroundChk.setBorder(new RoundedBorder(10));

		okBtn = new JButton("Ok");
		okBtn.setBackground(Color.WHITE);
		okBtn.setBorder(new RoundedBorder(10));

		cancelBtn = new JButton("Cancel");
		cancelBtn.setBackground(Color.WHITE);
		cancelBtn.setBorder(new RoundedBorder(10));

		getContentPane().add(colorCombo).setBounds(50, 10, 500, 50);
		getContentPane().add(backgroundChk).setBounds(170, 70, 100, 40);
		getContentPane().add(foregroundChk).setBounds(275, 70, 100, 40);
		getContentPane().add(okBtn).setBounds(180, 250, 100, 40);
		getContentPane().add(cancelBtn).setBounds(300, 250, 100, 40);

	}

	public static void main(String[] args) {
		Task3 task3 = new Task3();
		task3.setVisible(true);
	}

	private static class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

}
