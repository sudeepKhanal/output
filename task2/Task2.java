package task2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class Task2 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton qBtn;
	private JButton bBtn;
	private JButton cBtn;
	private JButton programingBtn;
	private JButton dBtn;
	private JButton eBtn;

	public Task2() {
		
		setSize(600, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		qBtn = new JButton("Q");
		qBtn.setBackground(Color.WHITE);
		qBtn.setBorder(new RoundedBorder(10));
		qBtn.setFont(new Font("Serif", Font.BOLD, 22));
		getContentPane().add(qBtn).setBounds(180, 0, 80, 30);
		
		bBtn = new JButton("B");
		bBtn.setBackground(Color.WHITE);
		bBtn.setBorder(new RoundedBorder(10));
		bBtn.setFont(new Font("Serif", Font.BOLD, 22));
		getContentPane().add(bBtn).setBounds(270, 0, 80, 30);
		
		cBtn = new JButton("C");
		cBtn.setBackground(Color.WHITE);
		cBtn.setBorder(new RoundedBorder(10));
		cBtn.setFont(new Font("Serif", Font.BOLD, 22));
		getContentPane().add(cBtn).setBounds(5, 80, 70, 80);
		
		programingBtn = new JButton("Programming is fun!");
		programingBtn.setHorizontalAlignment( SwingConstants.LEFT );
		programingBtn.setBackground(Color.WHITE);
		programingBtn.setBorder(new RoundedBorder(10));
		programingBtn.setFont(new Font("Serif", Font.BOLD, 22));
		getContentPane().add(programingBtn).setBounds(80, 100, 510, 80);
		
		
		dBtn = new JButton("D");
		dBtn.setBackground(Color.WHITE);
		dBtn.setBorder(new RoundedBorder(10));
		dBtn.setFont(new Font("Serif", Font.BOLD, 22));
		getContentPane().add(dBtn).setBounds(5, 185, 295, 80);
		
		eBtn = new JButton("E");
		eBtn.setBackground(Color.WHITE);
		eBtn.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLUE));
		eBtn.setFont(new Font("Serif", Font.BOLD, 22));
		getContentPane().add(eBtn).setBounds(305, 185, 285, 80);

	}
	
	public static void main(String[] args) {
		Task2 task2 = new Task2();
		task2.setVisible(true);
	}
	
	private static class RoundedBorder implements Border {

	    private int radius;
	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }

	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }

	    public boolean isBorderOpaque() {
	        return true;
	    }

	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}

}
