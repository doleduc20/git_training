package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.MiniCalculatorController;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_first;
	private JTextField jTextField_second;
	private JTextField jTextField_answer;
	public MiniCalculatorView()  {
		
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("Minicalculator");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 40);
		MiniCalculatorController miniCalculatorController = new MiniCalculatorController(this);
		
		JLabel jLabel_first = new JLabel("First value");
		jLabel_first.setFont(font);
		JLabel jLabel_second = new JLabel("Second value");
		jLabel_second.setFont(font);
		JLabel jLabel_answer = new JLabel("Answer");
		jLabel_answer.setFont(font);
		
		jTextField_first = new JTextField(50);
		jTextField_first.setFont(font);
		jTextField_second = new JTextField(50);
		jTextField_second.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);
		
		JPanel jpanel_1 = new JPanel();
		jpanel_1.setLayout(new GridLayout(3,2));
		jpanel_1.add(jLabel_first);
		jpanel_1.add(jTextField_first);
		jpanel_1.add(jLabel_second);
		jpanel_1.add(jTextField_second);
		jpanel_1.add(jLabel_answer);
		jpanel_1.add(jTextField_answer);
		
		JButton jButton_plus = new JButton("+");
		jButton_plus.setForeground(Color.BLUE);
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(miniCalculatorController);
		
		JButton jButton_minus = new JButton("-");
		jButton_minus.setForeground(Color.CYAN);
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(miniCalculatorController);
		
		JButton jButton_multiple = new JButton("*");
		jButton_multiple.setForeground(Color.DARK_GRAY);
		jButton_multiple.setFont(font);
		jButton_multiple.addActionListener(miniCalculatorController);
		
		JButton jButton_devide = new JButton("/");
		jButton_devide.setForeground(Color.LIGHT_GRAY);
		jButton_devide.setFont(font);
		jButton_devide.addActionListener(miniCalculatorController);
		
		JButton jButton_square = new JButton("^");
		jButton_square.setForeground(Color.PINK);
		jButton_square.setFont(font);
		jButton_square.addActionListener(miniCalculatorController);
		
		JButton jButton_mod = new JButton("%");
		jButton_mod.setForeground(Color.RED);
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(miniCalculatorController);
		
		JPanel jPanel_Button = new JPanel();
		jPanel_Button.setLayout(new GridLayout(2,3));
		jPanel_Button.add(jButton_plus);
		jPanel_Button.add(jButton_minus);
		jPanel_Button.add(jButton_multiple);
		jPanel_Button.add(jButton_devide);
		jPanel_Button.add(jButton_square);
		jPanel_Button.add(jButton_mod);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_1,BorderLayout.CENTER);
		this.add(jPanel_Button,BorderLayout.SOUTH);
		this.setVisible(true);
		
	}
	public void plus() {
		double firstvalue = Double.valueOf(jTextField_first.getText());
		double secondvalue = Double.valueOf(jTextField_second.getText());
		this.miniCalculatorModel.setFirstValue(firstvalue);
		this.miniCalculatorModel.setSecondValue(secondvalue);
		this.miniCalculatorModel.plus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	public void minus() {
		double firstvalue = Double.valueOf(jTextField_first.getText());
		double secondvalue = Double.valueOf(jTextField_second.getText());
		this.miniCalculatorModel.setFirstValue(firstvalue);
		this.miniCalculatorModel.setSecondValue(secondvalue);
		this.miniCalculatorModel.minus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void multiple() {
		double firstvalue = Double.valueOf(jTextField_first.getText());
		double secondvalue = Double.valueOf(jTextField_second.getText());
		this.miniCalculatorModel.setFirstValue(firstvalue);
		this.miniCalculatorModel.setSecondValue(secondvalue);
		this.miniCalculatorModel.multiple();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void devide() {
		double firstvalue = Double.valueOf(jTextField_first.getText());
		double secondvalue = Double.valueOf(jTextField_second.getText());
		this.miniCalculatorModel.setFirstValue(firstvalue);
		this.miniCalculatorModel.setSecondValue(secondvalue);
		this.miniCalculatorModel.devide();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void square() {
		double firstvalue = Double.valueOf(jTextField_first.getText());
		double secondvalue = Double.valueOf(jTextField_second.getText());
		this.miniCalculatorModel.setFirstValue(firstvalue);
		this.miniCalculatorModel.setSecondValue(secondvalue);
		this.miniCalculatorModel.square();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void mod() {
		double firstvalue = Double.valueOf(jTextField_first.getText());
		double secondvalue = Double.valueOf(jTextField_second.getText());
		this.miniCalculatorModel.setFirstValue(firstvalue);
		this.miniCalculatorModel.setSecondValue(secondvalue);
		this.miniCalculatorModel.mod();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
}
