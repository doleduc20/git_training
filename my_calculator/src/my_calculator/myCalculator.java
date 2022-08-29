package my_calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class myCalculator extends JFrame {
	public myCalculator() {
	this.setTitle("C4LCUL4T0R");
	this.setSize(300, 300);
	this.setLocationRelativeTo(null);
	
	JPanel jpanel_head = new JPanel();
	jpanel_head.setLayout(new BorderLayout());
	
	JTextField jtextfield1 = new JTextField(10);
	jpanel_head.add(jtextfield1,BorderLayout.CENTER);
	
	JButton jbutton_1 = new JButton("1");
	JButton jbutton_2 = new JButton("2");
	JButton jbutton_3 = new JButton("3");
	JButton jbutton_4 = new JButton("4");
	JButton jbutton_5 = new JButton("5");
	JButton jbutton_6 = new JButton("6");
	JButton jbutton_7 = new JButton("7");
	JButton jbutton_8 = new JButton("8");
	JButton jbutton_9 = new JButton("9");
	JButton jbutton_0 = new JButton("0");
	JButton jbutton_cong = new JButton("+");
	JButton jbutton_tru = new JButton("-");
	JButton jbutton_nhan = new JButton("*");
	JButton jbutton_chia = new JButton("/");
	
	JPanel jpanel_center = new JPanel();
	jpanel_center.setLayout(new GridLayout(5,3));
	jpanel_center.add(jbutton_0);
	jpanel_center.add(jbutton_1);
	jpanel_center.add(jbutton_2);
	jpanel_center.add(jbutton_3);
	jpanel_center.add(jbutton_4);
	jpanel_center.add(jbutton_5);
	jpanel_center.add(jbutton_6);
	jpanel_center.add(jbutton_7);
	jpanel_center.add(jbutton_8);
	jpanel_center.add(jbutton_9);
	jpanel_center.add(jbutton_cong);
	jpanel_center.add(jbutton_tru);
	jpanel_center.add(jbutton_nhan);
	jpanel_center.add(jbutton_chia);
	this.setLayout(new BorderLayout());
	this.add(jpanel_head,BorderLayout.NORTH);
	this.add(jpanel_center,BorderLayout.CENTER);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			new myCalculator();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
