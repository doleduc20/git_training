package gridlayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class vidu extends JFrame {
	public vidu() {
		this.setTitle("chuong trinh grid");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		GridLayout gl1 = new GridLayout(4,4,25,25);
		this.setLayout(gl1);
		for(int i=0;i<16;i++) {
			JButton jb  = new JButton("button"+i);
			this.add(jb );
		}
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new vidu();
	}
}
