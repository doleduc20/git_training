package flowlayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class vidu extends JFrame {
	public vidu() {
		this.setTitle("hello");
		this.setSize(300,400);
//		can giua cua so
		this.setLocationRelativeTo(null);
//		set flowlayout
		FlowLayout fl1 = new FlowLayout();
		FlowLayout fl2 = new FlowLayout(FlowLayout.TRAILING);
		FlowLayout fl3 = new FlowLayout(FlowLayout.CENTER,30,40);
		FlowLayout fl4 = new FlowLayout(FlowLayout.LEADING,50,10);
//		this.setLayout(fl1);
//		this.setLayout(fl2);
//		this.setLayout(fl3);
		this.setLayout(fl4);
		
		JButton jb1 = new JButton("button 1");
		JButton jb2 = new JButton("button 2");
		JButton jb3 = new JButton("button 3");
		
//		add thanh phan
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new vidu();
	}
}
