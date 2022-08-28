package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.MyColorListener;
import Model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorModel;
	private JLabel jLabel;
	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
	}
	private void init() {
		this.setTitle("My Color");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Font font_label = new Font("Arial", Font.BOLD, 50);
		Font font_button = new Font("Arial", Font.BOLD, 20);
		jLabel = new JLabel("TEXT");
		jLabel.setFont(font_label);
		
		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2,3));
		
		MyColorListener myColorListener = new MyColorListener(this);
		
		JButton jButton_redText = new JButton("Red Text");
		jButton_redText.setFont(font_button);
		jButton_redText.setForeground(Color.RED);
		jButton_redText.addActionListener(myColorListener);
		JButton jButton_YellowText = new JButton("Yellow Text");
		jButton_YellowText.setFont(font_button);
		jButton_YellowText.setForeground(Color.YELLOW);
		jButton_YellowText.addActionListener(myColorListener);
		JButton jButton_GreenText = new JButton("Green Text");
		jButton_GreenText.setFont(font_button);
		jButton_GreenText.setForeground(Color.GREEN);
		jButton_GreenText.addActionListener(myColorListener);
		
		JButton jButton_redBackground = new JButton("Red BG");
		jButton_redBackground.setFont(font_button);
		jButton_redBackground.setBackground(Color.RED);
		jButton_redBackground.addActionListener(myColorListener);
		JButton jButton_YellowBackground = new JButton("Yellow BG");
		jButton_YellowBackground.setFont(font_button);
		jButton_YellowBackground.setBackground(Color.YELLOW);
		jButton_YellowBackground.addActionListener(myColorListener);
		JButton jButton_GreenBackground = new JButton("Green BG");
		jButton_GreenBackground.setFont(font_button);
		jButton_GreenBackground.setBackground(Color.GREEN);
		jButton_GreenBackground.addActionListener(myColorListener);
		
		jPanel_footer.add(jButton_redText);
		jPanel_footer.add(jButton_YellowText);
		jPanel_footer.add(jButton_GreenText);
		jPanel_footer.add(jButton_redBackground);
		jPanel_footer.add(jButton_YellowBackground);
		jPanel_footer.add(jButton_GreenBackground);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel,BorderLayout.NORTH);
		this.add(jPanel_footer,BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}
	public void changeBgColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}
}
