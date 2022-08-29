package jframe;

import javax.swing.JFrame;

public class taocuaso extends JFrame {
	public taocuaso() {
		
	}
	public void hienCuaSo() {
		this.setVisible(true);
	}
	public void hienCuaSo(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	public void hienCuaSo(String title,int width,int height) {
//		 hien tieu de
		this.setTitle(title);
//		set kich co
		this.setSize(width, height);
//		set noi hien thi tren man hinh
		this.setLocation(400, 500);
//		tat chuong trinh sau khi dong cua so
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		cho phep hien thi
		this.setVisible(true);
	}
	public static void main(String[] args) {
		
		taocuaso cs3 = new taocuaso();
		
		
		cs3.hienCuaSo("chuong trinh b", 200, 400);
	}
}
