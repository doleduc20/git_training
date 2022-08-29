package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;
	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		this.init();
	}
	private void init() {
		this.setTitle("Last Button");
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		LastButtonListener lastButtonListener = new LastButtonListener(this);
		Font font = new Font("Arial", Font.BOLD, 35);
		JPanel jpanel_center = new JPanel();
		jpanel_center.setLayout(new GridLayout(2,2));
		JButton jButton_1 = new JButton("1");
		jButton_1.addActionListener(lastButtonListener);
		jButton_1.setFont(font);
		JButton jButton_2 = new JButton("2");
		jButton_2.addActionListener(lastButtonListener);
		jButton_2.setFont(font);
		JButton jButton_3 = new JButton("3");
		jButton_3.addActionListener(lastButtonListener);
		jButton_3.setFont(font);
		JButton jButton_4 = new JButton("4");
		jButton_4.addActionListener(lastButtonListener);
		jButton_4.setFont(font);
		jpanel_center.add(jButton_1);
		jpanel_center.add(jButton_2);
		jpanel_center.add(jButton_3);
		jpanel_center.add(jButton_4);
		
		JPanel jpanel_footer = new JPanel();
		jLabel = new JLabel("-------");
		jLabel.setFont(font);
		jpanel_footer.add(jLabel);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_center,BorderLayout.CENTER);
		this.add(jpanel_footer,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
	public void set_num1() {
		this.lastButtonModel.num_1();
		jLabel.setText("Last Button is: "+this.lastButtonModel.getValue());
	}
	public void set_num2() {
		this.lastButtonModel.num_2();
		jLabel.setText("Last Button is: "+this.lastButtonModel.getValue());
	}
	public void set_num3() {
		this.lastButtonModel.num_3();
		jLabel.setText("Last Button is: "+this.lastButtonModel.getValue());
	}
	public void set_num4() {
		this.lastButtonModel.num_4();
		jLabel.setText("Last Button is: "+this.lastButtonModel.getValue());
	}
}
