package main;

import java.io.File;

public class taotaptin {
	public static void main(String[] args) {
//		kiem tra tm co ton tai hay k
		File thumuc1 = new File("D:\\java\\taotaptin\\test");
		System.out.println("kiem tra tm1 ton tai hay k? "+thumuc1.exists());
		
		// tao 1 thu muc
		File d1 = new File("D:\\java\\taotaptin\\test\\test 2");
		d1.mkdir();
		File d2 = new File("D:\\java\\taotaptin\\test\\test 2\\test3");
		d2.mkdir();
		
//		tao nhieu thu muc
		File d3 = new File("D:\\java\\taotaptin\\test\\test 2\\test3\\test3_a\\test3_b\\test3_c");
		d3.mkdirs();
		
	}
}
