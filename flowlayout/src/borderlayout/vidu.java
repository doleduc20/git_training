package borderlayout;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class vidu extends JFrame {
	public vidu() {
		this.setTitle("chuong trinh c");
		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		
		BorderLayout bl1 = new BorderLayout(15,15);
		this.setLayout(bl1);
		
		Button but1 = new Button("button 1");
		Button but2 = new Button("button 2");
		Button but3 = new Button("button 3");
		Button but4 = new Button("button 4");
		Button but5 = new Button("button 5");
		
		this.add(but1, BorderLayout.NORTH);
		this.add(but2, BorderLayout.SOUTH);
		this.add(but3, BorderLayout.WEST);
		this.add(but4, BorderLayout.EAST);
		this.add(but5, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new vidu();
	}
}
